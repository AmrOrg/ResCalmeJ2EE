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
public class ServicesApp {
    private int serv_id;
    private String serv_description;
    private double serv_prix;

    public ServicesApp(int serv_id, String serv_description, double serv_prix) {
        this.serv_id = serv_id;
        this.serv_description = serv_description;
        this.serv_prix = serv_prix;
    }

    public ServicesApp() {
    }
    

    public int getServ_id() {
        return serv_id;
    }

    public void setServ_id(int serv_id) {
        this.serv_id = serv_id;
    }

    public String getServ_description() {
        return serv_description;
    }

    public void setServ_description(String serv_description) {
        this.serv_description = serv_description;
    }

    public double getServ_prix() {
        return serv_prix;
    }

    public void setServ_prix(double serv_prix) {
        this.serv_prix = serv_prix;
    }
   
    
}
