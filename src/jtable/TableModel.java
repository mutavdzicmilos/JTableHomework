/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jtable;

import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Milos <mm20160088@student.fon.bg.ac.rs>
 */
public class TableModel extends AbstractTableModel {

    String[] naziviKolona = {"Ime", "Sport", "Vegan", "Broj godina"};
    Object[][] podaci = new Object[][]{
        {"Milos", "Tenis", new Integer(3), new Boolean(true)},
        {"Marko", "Surfovanje", new Integer(2), null},
        {"Milica", "Odbojka", new Integer(5), new Boolean(true)},
        {"Katarina", "Macevanje", new Integer(9), new Boolean(true)}
    };

    @Override
    public int getRowCount() {
        return podaci.length;
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return podaci[rowIndex][columnIndex];
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        if (columnIndex == 0) {
            return true;
        }
        return false;
    }

    @Override
    public String getColumnName(int column) {
        return naziviKolona[column]; //To change body of generated methods, choose Tools | Templates.
    }

    public void setValueAt(Object value, int row, int col) {
        podaci[row][col] = value;
        fireTableCellUpdated(row, col);
    }
}
