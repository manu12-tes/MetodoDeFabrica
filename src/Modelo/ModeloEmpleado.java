/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Control.Tipo;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author manel
 */
public class ModeloEmpleado extends ModeloTabla{
    private List<Object[]> datos;
    private String encabezados[];
    private Class tipos[];
    private int colEditable=4;
    public ModeloEmpleado(List<Tipo> l){
        datos=new ArrayList<Object[]>();
        encabezados=new String[]{"nombre","precio","50%descuento","existencias","cantidad","importe"};
        tipos=new Class[]{String.class,Double.class,Double.class,Integer.class,Integer.class,Double.class};
        for(Tipo t: l){
             Object campo[]=new Object[encabezados.length];
             campo[0]=t.getNombre();
             campo[1]=t.getPrecio();
             campo[2]=(t.getPrecio()/2);
             campo[3]=t.getExistencias();
             campo[4]=0;
             campo[5]=0;
             datos.add(campo);
        }  
    }
       @Override
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
    @Override
     public boolean isCellEditable(int r,int c){
         return c==colEditable;
     }
     @Override
     public void setValueAt(Object aValue,int r, int c){
       int aux=(int)aValue;
       int aux2=(int)datos.get(r)[3];
      if(colEditable==c && aux<=aux2 && aux>=0){
           datos.get(r)[c]=(int)aValue;
           datos.get(r)[5]=(int)aValue*(Double)datos.get(r)[2];
      }else{
        JOptionPane.showMessageDialog(null, "este valor esta fuera del rango");
      }
     }
    
}
