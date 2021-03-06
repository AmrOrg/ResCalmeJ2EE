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
import modele.ServicesApp;
import modele.appartement;

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

    public HashMap<String, ArrayList<String>> chercherProvince(Connection conn) {
        HashMap<String, ArrayList<String>> Hash_province = new HashMap();
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

    public HashMap<String, ArrayList<String>> chercherVille(Connection conn) {
        HashMap<String, ArrayList<String>> Hash_Ville = new HashMap();
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
            HashMap<String, ArrayList<String>> HashAPP = new HashMap<String, ArrayList<String>>();
            Connection connexion = getConnection();
            if (connexion != null) {
                HashProv = chercherProvince(connexion);
                HashVille = chercherVille(connexion);
                HashTotal.put("province", HashProv);
                HashTotal.put("ville", HashVille);
            }
            return HashTotal;
        }
    }

    public boolean isProvComplete(String _province) {
        boolean etat = false;
        for (String s : HashTotal.get("province").get("prov_name")) {
            if (_province.equals(s)) {
                etat = true;
            }
        }
        return etat;
    }

    public ArrayList<appartement> chercherApp() {

        Connection conn = getConnection();

        appartement app = new appartement();
        ArrayList<appartement> ar_app_objet = new ArrayList<>();

        String Query = "SELECT APPARTEMENT_ID , APP_NUMERO, APP_STATUT_DISPONIBLE,RESIDENCE_ID  FROM APPARTEMENT ";
        PreparedStatement psm;
        try {
            psm = conn.prepareStatement(Query);
            ResultSet rs = psm.executeQuery();
            while (rs.next()) {
                app.setApp_id(rs.getString("APPARTEMENT_ID"));
                app.setApp_num("APP_NUMERO");
                app.setApp_status("APP_STATUT_DISPONIBLE");
                app.setApp_type("TYPE_APPARTEMENT_ID");
                app.setRes_id("RESIDENCE_ID");

                ar_app_objet.add(app);
            }

        } catch (SQLException ex) {
            Logger.getLogger(Utils.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                conn.close();

            } catch (SQLException ex) {
                Logger.getLogger(Utils.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        return ar_app_objet;
    }

    public ArrayList<String> getAppTypes() {
        Connection conn = getConnection();

        ArrayList<String> ar_app_type = new ArrayList<>();

        String Query = "SELECT TYPE_APP_DESCRIPTION FROM TYPE_APPARTEMENT ";
        PreparedStatement psm;
        try {
            psm = conn.prepareStatement(Query);
            ResultSet rs = psm.executeQuery();
            while (rs.next()) {

                ar_app_type.add(rs.getString("TYPE_APP_DESCRIPTION"));
            }

        } catch (SQLException ex) {
            Logger.getLogger(Utils.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                conn.close();

            } catch (SQLException ex) {
                Logger.getLogger(Utils.class.getName()).log(Level.SEVERE, null, ex);
            } finally {

                try {
                    conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Utils.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        }
        return ar_app_type;

    }

    public ArrayList<ServicesApp> getAppServices() {
        Connection conn = getConnection();
        ArrayList<ServicesApp> ar_app_services = new ArrayList<ServicesApp>();
        String Query = "SELECT SERVICE_ID, SERV_DESCRIPTION, SERV_PRIX FROM SERVICE";
        PreparedStatement psm;
        try {
            psm = conn.prepareStatement(Query);
            ResultSet rs = psm.executeQuery();
            while (rs.next()) {
                ar_app_services.add(new ServicesApp(rs.getInt("SERVICE_ID"), rs.getString("SERV_DESCRIPTION"), rs.getDouble("SERV_PRIX")));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Utils.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                conn.close();

            } catch (SQLException ex) {
                Logger.getLogger(Utils.class.getName()).log(Level.SEVERE, null, ex);
            } finally {

                try {
                    conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Utils.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return ar_app_services;
    }
}
