/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import Utilitaire.Utils;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author AMR
 */
public class srv_Login extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        Connection conn = null;

        try (PrintWriter out = response.getWriter()) {
            String _username = request.getParameter("UserName");
            String _password = request.getParameter("PWD");
            // String _l = request.getParameter("lang");
            String logout = request.getParameter("logout");
            System.out.println(logout);
            HttpSession session = request.getSession();

            String Destination = "";
            if (logout.equals("true")) {
                Destination = "index.jsp";
                session.invalidate();
                response.sendRedirect(Destination);
                        

            } else {

                boolean status;

                try {
                    if (_username != null && _password != null) {

                        status = Utils.GetInstance().verifierConnection(_username, _password);

                        if (!status) {

                            session.setAttribute("username", _username);

                            Destination = "index.jsp";

                            //when we use forwored we create object that in clude all request and response 
                            RequestDispatcher dispatch = request.getRequestDispatcher(Destination);
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
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
