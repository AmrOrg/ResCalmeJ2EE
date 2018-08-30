/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele;

/**
 *
 * @author 1795657
 */
public class Appartement {
   private String app_pays; 
   private String app_province;
   private String app_ville;
   private String app_numero; 
   private String app_nun_civique;
   private String app_rue;
   private String app_code_postal; 
   private String app_type;
   private String app_service;
   private String app_statut; 
   private double app_prix;
   private double app_prix_service;
   private String app_image1; 
   private String app_image2; 
   private String app_image3; 
   private String app_image4; 
   private String app_image5; 

    public Appartement() {
    }

    public Appartement(String app_pays, String app_province, String app_ville, String app_numero, String app_nun_civique, String app_rue, String app_code_postal, String app_type, String app_service, String app_statut, double app_prix, double app_prix_service, String app_image1, String app_image2, String app_image3, String app_image4, String app_image5) {
        this.app_pays = app_pays;
        this.app_province = app_province;
        this.app_ville = app_ville;
        this.app_numero = app_numero;
        this.app_nun_civique = app_nun_civique;
        this.app_rue = app_rue;
        this.app_code_postal = app_code_postal;
        this.app_type = app_type;
        this.app_service = app_service;
        this.app_statut = app_statut;
        this.app_prix = app_prix;
        this.app_prix_service = app_prix_service;
        this.app_image1 = app_image1;
        this.app_image2 = app_image2;
        this.app_image3 = app_image3;
        this.app_image4 = app_image4;
        this.app_image5 = app_image5;
    }

    public String getApp_pays() {
        return app_pays;
    }

    public void setApp_pays(String app_pays) {
        this.app_pays = app_pays;
    }

    public String getApp_province() {
        return app_province;
    }

    public void setApp_province(String app_province) {
        this.app_province = app_province;
    }

    public String getApp_ville() {
        return app_ville;
    }

    public void setApp_ville(String app_ville) {
        this.app_ville = app_ville;
    }

    public String getApp_numero() {
        return app_numero;
    }

    public void setApp_numero(String app_numero) {
        this.app_numero = app_numero;
    }

    public String getApp_nun_civique() {
        return app_nun_civique;
    }

    public void setApp_nun_civique(String app_nun_civique) {
        this.app_nun_civique = app_nun_civique;
    }

    public String getApp_rue() {
        return app_rue;
    }

    public void setApp_rue(String app_rue) {
        this.app_rue = app_rue;
    }

    public String getApp_code_postal() {
        return app_code_postal;
    }

    public void setApp_code_postal(String app_code_postal) {
        this.app_code_postal = app_code_postal;
    }

    public String getApp_type() {
        return app_type;
    }

    public void setApp_type(String app_type) {
        this.app_type = app_type;
    }

    public String getApp_service() {
        return app_service;
    }

    public void setApp_service(String app_service) {
        this.app_service = app_service;
    }

    public String getApp_statut() {
        return app_statut;
    }

    public void setApp_statut(String app_statut) {
        this.app_statut = app_statut;
    }

    public double getApp_prix() {
        return app_prix;
    }

    public void setApp_prix(double app_prix) {
        this.app_prix = app_prix;
    }

    public double getApp_prix_service() {
        return app_prix_service;
    }

    public void setApp_prix_service(double app_prix_service) {
        this.app_prix_service = app_prix_service;
    }

    public String getApp_image1() {
        return app_image1;
    }

    public void setApp_image1(String app_image1) {
        this.app_image1 = app_image1;
    }

    public String getApp_image2() {
        return app_image2;
    }

    public void setApp_image2(String app_image2) {
        this.app_image2 = app_image2;
    }

    public String getApp_image3() {
        return app_image3;
    }

    public void setApp_image3(String app_image3) {
        this.app_image3 = app_image3;
    }

    public String getApp_image4() {
        return app_image4;
    }

    public void setApp_image4(String app_image4) {
        this.app_image4 = app_image4;
    }

    public String getApp_image5() {
        return app_image5;
    }

    public void setApp_image5(String app_image5) {
        this.app_image5 = app_image5;
    }

    @Override
    public String toString() {
        return "Appartement{" + "app_pays=" + app_pays + ", app_province=" + app_province + ", app_ville=" + app_ville + ", app_numero=" + app_numero + ", app_nun_civique=" + app_nun_civique + ", app_rue=" + app_rue + ", app_code_postal=" + app_code_postal + ", app_type=" + app_type + ", app_service=" + app_service + ", app_statut=" + app_statut + ", app_prix=" + app_prix + ", app_prix_service=" + app_prix_service + ", app_image1=" + app_image1 + ", app_image2=" + app_image2 + ", app_image3=" + app_image3 + ", app_image4=" + app_image4 + ", app_image5=" + app_image5 + '}';
    }
   
   
}
