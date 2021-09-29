/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import java.util.ArrayList;

/**
 *
 * @author manel
 */
public class Electronicos extends Tipo{
    private java.util.List<Tipo> pu=new ArrayList<Tipo>();
    private java.util.List<Tipo> ma=new ArrayList<Tipo>();
    private String nombre,categoria,unidadmedidad;
    private double precio;
    private int existencia;
    
    public Electronicos(){
        
    }
    public Electronicos(String n,double p,int e){
        this.nombre=n;
        this.precio=p;
        this.existencia=e; 
    }
    public Electronicos(String n,String c,String um,double p,int e){
      this.nombre=n;
      this.precio=p;
      this.existencia=e;  
      this.categoria=c;
      this.unidadmedidad=um; 
    }
      public String getNombre(){
        return nombre; 
    }
    public double getPrecio(){
        return precio;
    }
    public int getExistencias(){
        return existencia;
    }
    public String getCategoria(){
        return categoria;
    }
   public String getMedida(){
       return unidadmedidad;
   }
     @Override
    public java.util.List<Tipo>  muestraArticulos(String s){
         if(s.equals("Publico")){
            pu.add(new Electronicos("Tv Smart ",1534.6,50));
            pu.add(new Electronicos("Laptop",3000.0,30));
            pu.add(new Electronicos("Computadora de escritorio",2000.4,10));
            pu.add(new Electronicos("celular Smart",1213.5,10));
            pu.add(new Electronicos("Bocina Bluetohh",200.0,10));
            return pu;
    }else{
            ma.add(new Electronicos("Tv Smart ","Lg","FT",1534.6,50));
            ma.add(new Electronicos("Laptop","Hp","ft",3000.0,30));
            ma.add(new Electronicos("Computadora de escritorio","Toshiba","ft",2000.4,10));
            ma.add(new Electronicos("celular Smart","Nokia","pixeles",1213.5,10));
            ma.add(new Electronicos("Bocina Bluetohh","Steren","sonido surround",200.0,10));
            return ma;
         }
    }
   
}
