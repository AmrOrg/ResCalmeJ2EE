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
        System.out.println(HashTotal);
        HashMap<String, HashMap<String, ArrayList<String>>> HashSp = new HashMap<>();
        ArrayList<String> arProv = new ArrayList();

        ArrayList<String> arProvId = new ArrayList();
        ArrayList<String> arVilleName = new ArrayList();

        String _province = request.getParameter("province").toUpperCase().trim();

        String _ville = request.getParameter("ville").toUpperCase().trim();

        if (_province != null) {

            for (int d = 0; d < HashTotal.get("province").get("prov_name").size(); d++) {

                if (HashTotal.get("province").get("prov_name").get(d).startsWith(_province)) {
                    arProv.add(HashTotal.get("province").get("prov_name").get(d));
                    arProvId.add(HashTotal.get("province").get("prov_id").get(d));

                }
            }
            if (Utils.GetInstance().isProvComplete(_province)) {

                if (_ville != null) {
                    for (String s : arProvId) {

                        for (int d = 0; d < HashTotal.get("ville").get("ville_name").size(); d++) {
                            if (HashTotal.get("ville").get("prov_id").get(d).equals( s )){
                            arVilleName.add( HashTotal.get("ville").get("ville_name").get(d));
                            
                            }
                        }

                    }

                }

            }else{
            
            
            }

        }

       
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(arProv);
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
