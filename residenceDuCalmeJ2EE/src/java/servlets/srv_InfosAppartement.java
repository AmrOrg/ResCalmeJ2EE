/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import Utilitaire.Utils;
import static Utilitaire.Utils.GetInstance;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modele.ServicesApp;
import modele.appartement;

/**
 *
 * @author 1795162
 */
public class srv_InfosAppartement extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String action = request.getParameter("action");
        switch (action) {
            case "chercherType": {
                ArrayList<String> ar_app_types = Utils.GetInstance().getAppTypes();
                Gson gson = new GsonBuilder().setPrettyPrinting().create();
                String json = gson.toJson(ar_app_types);
                response.getWriter().write(json);
                break;
            }

            case "chercherServices": {
                ArrayList<ServicesApp> ar_app_services = Utils.GetInstance().getAppServices();
                Gson gson = new GsonBuilder().setPrettyPrinting().create();
                String json = gson.toJson(ar_app_services);
                response.getWriter().write(json);
                break;
            }

            case "rechercheListeApp": {
                String province = request.getParameter("province");
                String ville = request.getParameter("ville");
                String type = request.getParameter("type");
                String prixMin = request.getParameter("prixMin");
                String prixMax = request.getParameter("prixMax");
                String service = request.getParameter("service");
                try {
                    //Utils.GetInstance().rechercheListApp(province, ville, type, prixMin, prixMax, service);
                    Utils.GetInstance().rechercheListApp(province, ville);
                } catch (SQLException ex) {
                    Logger.getLogger(srv_InfosAppartement.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            default:
                break;
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
