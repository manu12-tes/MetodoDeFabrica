/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Control.Tipo;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author manel
 */
public class ModeloeleMayprista extends ModeloTabla {
     private List<Object[]> datos;
    private String encabezados[];
    private Class tipos[];
     private int colEditable=5;
    public ModeloeleMayprista(List<Tipo> l){
        datos=new ArrayList<Object[]>();
        encabezados=new String[]{"Nombre","Marca","precio","Existencias","Unidad","Importe"};
        tipos=new Class[]{String.class,String.class,Double.class,Integer.class,Integer.class,Double.class};
         for(Tipo t: l){
             Object campo[]=new Object[encabezados.length];
             campo[0]=t.getNombre();
             campo[1]=t.getPrecio();
             campo[2]=t.getExistencias();
             campo[3]=0;
             campo[4]=0;
             datos.add(campo);
        }
    }
     public int getRowCount() {
        return datos.size();//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getColumnCount() {
        return encabezados.length;//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
      return datos.get(rowIndex)[columnIndex];   //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
     @Override
    public Class getColumnClass(int c){return tipos[c];}
     @Override
    public String getColumnName(int c) {
        return encabezados[c];
    }
}
