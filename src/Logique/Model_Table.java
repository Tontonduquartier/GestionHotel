/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logique;

import javax.swing.JButton;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author nahimana
 */
public class Model_Table extends AbstractTableModel{

    private String[] titles_;
    private Object [][] data;
    
    public int getRowCount() {
       if(data==null)
           return -1;
        return data.length;
    }
    
    public Model_Table(Object[][] t,String [] tit){
    
        this.data=t;
        this.titles_=tit;
    }

    @Override
    public int getColumnCount() {
        if(this.titles_==null)
            return -1;
        return titles_.length;
          
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        
        return data[rowIndex][columnIndex];
    
    }
    
    

               /**
* Retourne le titre de la colonne à l'indice spécifé
*/
public String getColumnName(int col) {
  return this.titles_[col];
}

/**
 * Retourne vrai si la cellule est éditable : celle-ci sera donc éditable
 * @return boolean
 */
public boolean isCellEditable(int row, int col){

	//On appelle la méthode getValueAt qui retourne la valeur d'une cellule
	//Et on fait un traitement spécifique si c'est un JButton
	if(getValueAt(0, col) instanceof JButton)
		return false;
	return true; 
}


    
    
}
