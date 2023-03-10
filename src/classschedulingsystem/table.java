package classschedulingsystem;

import javax.swing.Icon;
import javax.swing.table.AbstractTableModel;

public class table extends AbstractTableModel{

    private String[] columns;
    private Object[][] rows;
    
    public table(){}
    
    public table(Object[][] data, String[] columnName){
        
        this.rows = data;
        this.columns = columnName;
        

    }      
    public Class getColumnClass(int column){
        if(column == 4){
           return Icon.class; 
        }
        else{
            return getValueAt(0, column).getClass();
        }
    }
    
    @Override
    public int getRowCount() {
    return this.rows.length;
    }

    @Override
    public int getColumnCount() {
    return this.columns.length;
    }

    @Override
    public Object getValueAt(int i, int i1) {
        return this.rows[i][i1];
    }
    
    @Override
    public String getColumnName(int col){
        return this.columns[col];
    }
}
