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
public class Abarrote extends Tipo{
    private java.util.List<Tipo> pu=new ArrayList<Tipo>();
    private java.util.List<Tipo> ma=new ArrayList<Tipo>();
    private String nombre,categoria,unidadmedidad;
    private double precio;
    private int existencia;
    public Abarrote(){
        
    }
    public Abarrote(String n,double p,int e){
        this.nombre=n;
        this.precio=p;
        this.existencia=e; 
    }
    public Abarrote(String n,String c,String um,double p,int e){
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
            pu.add(new Abarrote("Mermelada",15.6,50));
            pu.add(new Abarrote("Azucar ",30.0,30));
            pu.add(new Abarrote("Leche",20.4,10));
            pu.add(new Abarrote("Aceite de coina",30.5,10));
            pu.add(new Abarrote("Aceite de oliva",20.0,10));
            return pu;
    }else{
            ma.add(new Abarrote("Mermelada","endulzantes","kg",15.6,50));
            ma.add(new Abarrote("Azucar ","Endulzantes","kg",30.0,30));
            ma.add(new Abarrote("Leche","Lacteos","litros",20.4,10));
            ma.add(new Abarrote("Aceite de coina","Aceites","lts",30.5,10));
            ma.add(new Abarrote("Aceite de oliva","Aceites ","lts",20.0,10));
            return ma;
         }
    }
}
