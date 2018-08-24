/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import Utilitaire.Utils;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.sun.corba.se.impl.javax.rmi.CORBA.Util;
import com.sun.corba.se.spi.protocol.RequestDispatcherDefault;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author AMR
 */
public class srv_RechercheApp extends HttpServlet {

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
        response.setContentType("application/json");

        HashMap<String, HashMap<String, ArrayList<String>>> HashTotal = Utils.GetInstance().GetHashTotal();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(srv_RechercheApp.class.getName()).log(Level.SEVERE, null, ex);
        }
        HashMap<String, ArrayList<String>> HashTotalFilter = new HashMap();
        ArrayList<String> ar = new ArrayList();
        ArrayList<String> arville = new ArrayList();
        String _province = request.getParameter("province").toUpperCase().trim();
        String _ville = request.getParameter("ville").toUpperCase().trim();
        if (_province != null) {
            if (Utils.GetInstance().isProvComplete(_province)) {

                for (int i = 0; i < HashTotal.get("ville").get("prov_name").size(); i++) {
                    if (HashTotal.get("ville").get("prov_name").get(i).equals(_province)) {

                        arville.add(HashTotal.get("ville").get("ville_name").get(i));

                    }

                }

            } else {
                for (String s : HashTotal.get("province").get("prov_name")) {

                    if (s.startsWith(_province)) {
                        ar.add(s);
                    }
                }

            }
        }

        HashTotalFilter.put("prov_filter", ar);
        HashTotalFilter.put("ville_filter", arville);

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(HashTotalFilter);
        response.getWriter().write(json);
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
