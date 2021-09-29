/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import java.awt.List;
import java.util.ArrayList;

/**
 *
 * @author manel
 */
public abstract class Tipo {
    public Tipo(){
        
    }
      public String getNombre(){
        return ""; 
    }
    public double getPrecio(){
        return 0.0;
    }
    public int getExistencias(){
        return 0;
    }
    public String getCategoria(){
        return "";
    }
    public String getMedida(){
        return " ";
    }
      
    public java.util.List<Tipo> muestraArticulos(String s){
       java.util.List<Tipo> datos = new ArrayList<Tipo>();
        return datos;
    }
   
}
    

