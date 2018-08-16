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
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 1795162
 */
public class Utils {

    private static Utils util;

    public static Utils GetInstance() {

        if (util == null) {

            util = new Utils();
            return util;
        } else {

            return util;
        }

    }

    public ArrayList chercherProvince(String _province) {
        ArrayList Ar_Province = new ArrayList();
        Connection conn = getConnection();

        String Query = "select PROV_NOM from PROVINCE ";
        PreparedStatement psm;
        try {
            psm = conn.prepareStatement(Query);
            // psm.setString(1, _province);
            ResultSet rs = psm.executeQuery();
            while (rs.next()) {
                Ar_Province.add(rs.getString("PROV_NOM"));

            }

        } catch (SQLException ex) {
            Logger.getLogger(Utils.class.getName()).log(Level.SEVERE, null, ex);
        }
        return Ar_Province;
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

    public ArrayList chercherVille(String _ville) {
        ArrayList Ar_Ville = new ArrayList();
        Connection conn = getConnection();

        String Query = "select PROV_NOM from VILLE ";
        PreparedStatement psm;
        try {
            psm = conn.prepareStatement(Query);
            // psm.setString(1, _province);
            ResultSet rs = psm.executeQuery();
            while (rs.next()) {
                Ar_Ville.add(rs.getString("PROV_NOM"));

            }

        } catch (SQLException ex) {
            Logger.getLogger(Utils.class.getName()).log(Level.SEVERE, null, ex);
        }
        return Ar_Ville;
    }
}
