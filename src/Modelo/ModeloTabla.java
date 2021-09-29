/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author manel
 */
public class ModeloTabla extends AbstractTableModel{
   private List<Object[]> datos;
   private String encabezados[];
   private Class tipos[];
    public ModeloTabla(){
        
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
    
}
