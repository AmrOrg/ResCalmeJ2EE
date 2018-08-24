/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import Utilitaire.Utils;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author AMR
 */
public class srv_Inscription extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String _nom = request.getParameter("nom");
        String _prenom = request.getParameter("prenom");
        String _username = request.getParameter("UserName1").toLowerCase();
        String _password = request.getParameter("PWD1");
        String _email = request.getParameter("email1");
        String _tel = request.getParameter("tel1");
        int x = 0 ;
        
        boolean status = Utils.GetInstance().VerifiIsExist(_username);
        System.out.println(status);
        
        if(status == false){
         x= Utils.GetInstance().AddLocataire(_nom,_prenom,_username,_password,_email,_tel);
        request.setAttribute("x", x);
        RequestDispatcher disp = request.getRequestDispatcher("Inscription.jsp");
        disp.forward(request, response);
        
        }else{
        String str = "Les USERNAME  deja La  Svp changer ";
        request.setAttribute("str", str);
        request.setAttribute("x", x);
        RequestDispatcher disp = request.getRequestDispatcher("Inscription.jsp");
        disp.forward(request, response);
        
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
