/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author manel
 */
public class Modelofinal extends ModeloTabla{
     private List<Object[]> datos;
    private String encabezados[];
    private Class tipos[];
    public Modelofinal(List<Object[]> d){
        // datos=new ArrayList<Object[]>();
        this.datos=d;
        encabezados=new String[]{"nombre","cantidad","precio"};
        tipos=new Class[]{String.class,Integer.class,Double.class};
        double total=0.0;
        for(int n=0;n<datos.size();n++){
          total=total+(Double)datos.get(n)[2];
        }
       Object ax[]=new Object[3];
       ax[1]="precio total";
        ax[2]=total;
        datos.add(ax);
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
}
