/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele;

import Utilitaire.Utils;
import java.util.ArrayList;

/**
 *
 * @author 1795657
 */
public class ListeServicesApp extends ArrayList<ServicesApp>{
   
    private ArrayList<ServicesApp> listeServices;

    public ArrayList<ServicesApp> getInstance() {
        if (listeServices != null) {

            return listeServices;
        } else {

            listeServices = new ListeServicesApp();
            listeServices = Utils.GetInstance().getAppServices();

            return listeServices;

        }

    }

    
}
