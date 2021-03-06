package servlets;

import Utilitaire.Utils;
import com.sun.corba.se.impl.javax.rmi.CORBA.Util;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javafx.scene.control.Alert;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;

public class login extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        Connection conn = null;

        try (PrintWriter out = response.getWriter()) {
            String _username = request.getParameter("UserName");
            String _password = request.getParameter("PWD");
            String _l = request.getParameter("lang");
            String Destiation = "";

            try {
                if (_username != null && _password != null) {

                    conn = Utils.GetInstance().getConnection();

                    ResultSet rs = Utils.GetInstance().verifierConnection(conn, _username, _password);

                    if (rs.next()) {

                        HttpSession session = request.getSession();
                        session.setAttribute("_username", _username);

                        Destiation = "index.jsp";

                        //when we use forwored we create object that in clude all request and response 
                        RequestDispatcher dispatch = request.getRequestDispatcher(Destiation);
                        dispatch.forward(request, response);
                    } else {
                        RequestDispatcher dispatch = request.getRequestDispatcher("Faild.jsp");

                        dispatch.forward(request, response);

                    }

                } else {
                    out.println("Empty UserName or Password");

                }
            } catch (Exception ex) {
                out.print("Exception : " + ex.getMessage());
                ex.printStackTrace();

            }

        }
    }



    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }

}
