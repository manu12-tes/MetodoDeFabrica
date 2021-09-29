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
public class Alimento extends Tipo {
    private java.util.List<Tipo> pu=new ArrayList<Tipo>();
    private java.util.List<Tipo> ma=new ArrayList<Tipo>();
    private String nombre,categoria,unidadmedidad;
    private double precio;
    private int existencia;
    
    public Alimento(){
        
    }
    public Alimento(String n,double p,int e){
        this.nombre=n;
        this.precio=p;
        this.existencia=e;
        
    }
    public Alimento(String n,String c,String um,double p,int e){
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
            pu.add(new Alimento("manzana",10.0,50));
            pu.add(new Alimento("platano",20.0,30));
            pu.add(new Alimento("carne de res",70.0,10));
            pu.add(new Alimento("Agua para beber",10.5,100));
            pu.add(new Alimento("carne de puerco",70.0,10));
            return pu;
        }else{
            ma.add(new Alimento("manzana","Fruta","kg",10.0,100));
            ma.add(new Alimento("platano","fruta","Kg",20.0,60));
            ma.add(new Alimento("carne de res","carnes frias","kg",70.0,30));
            ma.add(new Alimento("Agua para beber","bebidas","lts",10.5,200));
            ma.add(new Alimento("carne de puerco","Carnes frias","kg",70.0,40));
            return ma;
        }
        
    }
    
  /*  private Class estructuraP[]={String.class,String.class,String.class,String.class,String.class };
   
    private Class estructuraM[]={String.class,String.class,String.class,Double.class,Integer.class,Integer.class ,Double.class};*/
}



