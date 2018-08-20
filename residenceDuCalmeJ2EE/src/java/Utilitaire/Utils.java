/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilitaire;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 1795162
 */
public class Utils {

    private static Utils util;
    private HashMap<String, HashMap<String, ArrayList<String>>> HashTotal;

    public static Utils GetInstance() {

        if (util == null) {

            util = new Utils();
            return util;
        } else {

            return util;
        }

    }

    public HashMap<String, ArrayList<String>> chercherProvince() {
        HashMap<String, ArrayList<String>> Hash_province = new HashMap();
        //ArrayList Ar_Province = new ArrayList();
        Connection conn = getConnection();
        ArrayList<String> ar_PROV_NOM = new ArrayList<>();
        ArrayList<String> ar_PROV_id = new ArrayList<>();

        String Query = "SELECT PROV_NOM ,PROV_ID FROM PROVINCE ";
        PreparedStatement psm;

        try {
            psm = conn.prepareStatement(Query);
            ResultSet rs = psm.executeQuery();
            while (rs.next()) {
                ar_PROV_NOM.add(rs.getString("PROV_NOM"));
                ar_PROV_id.add(rs.getString("PROV_ID"));

            }
            Hash_province.put("prov_name", ar_PROV_NOM);
            Hash_province.put("prov_id", ar_PROV_id);

        } catch (SQLException ex) {
            Logger.getLogger(Utils.class.getName()).log(Level.SEVERE, null, ex);
        }
        return Hash_province;
    }

    public Connection getConnection() {
        Connection conn = null;
        try {
            Class.forName("oracle.jdbc.OracleDriver");
            conn = DriverManager.getConnection("jdbc:oracle:thin:@144.217.163.57:1521:XE", "bd1team10", "anypw10");
            System.out.println("Connected ");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Utils.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Utils.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conn;
    }

    public ResultSet verifierConnection(Connection conn, String _username, String _password) throws SQLException {
        String Query = "select * from LOGIN where IDENTIFIANT = ? AND MOTDEPASSE = ? ";
        PreparedStatement psm = conn.prepareStatement(Query);
        psm.setString(1, _username);
        psm.setString(2, _password);
        ResultSet rs = psm.executeQuery();
        return rs;
    }

    public HashMap<String, ArrayList<String>> chercherVille() {
        HashMap<String, ArrayList<String>> Hash_Ville = new HashMap();
        Connection conn = getConnection();
        ArrayList<String> ar_VILLE_NOM = new ArrayList<>();
        ArrayList<String> ar_PROV_ID = new ArrayList<>();
        ArrayList<String> ar_PROV_NOM = new ArrayList<>();
        String Query = "SELECT VILLE_NOM , PROV_ID, PROV_NOM  FROM VILLE NATURAL JOIN PROVINCE ";
        PreparedStatement psm;
        try {
            psm = conn.prepareStatement(Query);
            ResultSet rs = psm.executeQuery();
            while (rs.next()) {
                ar_VILLE_NOM.add(rs.getString("VILLE_NOM"));
                ar_PROV_ID.add(rs.getString("PROV_ID"));
                ar_PROV_NOM.add(rs.getString("PROV_NOM"));
            }
            Hash_Ville.put("ville_name", ar_VILLE_NOM);
            Hash_Ville.put("prov_id", ar_PROV_ID);
            Hash_Ville.put("prov_name", ar_PROV_NOM);

        } catch (SQLException ex) {
            Logger.getLogger(Utils.class.getName()).log(Level.SEVERE, null, ex);
        }
        return Hash_Ville;
    }

    public HashMap<String, HashMap<String, ArrayList<String>>> GetHashTotal() {
        if (HashTotal != null) {
            
            return HashTotal;
        } else {
            HashTotal = new HashMap<String, HashMap<String, ArrayList<String>>>();
            HashMap<String, ArrayList<String>> HashProv = new HashMap<String, ArrayList<String>>();
            HashMap<String, ArrayList<String>> HashVille = new HashMap<String, ArrayList<String>>();
            HashProv = chercherProvince();
            HashVille = chercherVille();

            HashTotal.put("province", HashProv);
            HashTotal.put("ville", HashVille);
            
            return HashTotal;

        }

    }

    public boolean isProvComplete(String _province) {
       // System.out.println(HashTotal);
        //System.out.println(HashTotal.get("province").get("prov_name"));
        boolean etat = false;

        for (String s : HashTotal.get("province").get("prov_name")) {

            if (_province.equals(s)) {
                etat = true;

            } else {
                etat = false;
            }

        }

        return etat;

    }

}
