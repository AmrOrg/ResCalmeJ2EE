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
 * @author 1795162
 */
public class ListeTypeApp extends ArrayList<String>{
    
    private ArrayList<String> listTypeApp ;
    
    
    public ArrayList<String> getInstance(){
    
    if(listTypeApp !=null){
    
    
    return listTypeApp ;
    }else {
    
    listTypeApp = new ListeTypeApp();
    listTypeApp = Utils.GetInstance().getAppTypes();
    
    return listTypeApp;
    
    }
    
    
    
    }
    
    
}
