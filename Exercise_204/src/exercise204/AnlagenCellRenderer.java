/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise204;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author Felix
 */
public class AnlagenCellRenderer implements TableCellRenderer {

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        JLabel label = new JLabel();
        Anlage anlage = (Anlage) value;

        double[] values = anlage.getValues();
        if (values != null) {
            if (values[3] == 0) {
                label.setBackground(Color.red);
            }

            switch (column) {
                case 4:
                    label.setText("" + values[0]);
                    break;
                case 5:
                    label.setText("" + values[2]);
                    break;
                case 6:
                    label.setText("" + values[3]);
                    break;
                case 7:
                    label.setText("" + values[1]);
                    break;
                case 8:
                    label.setText("" + values[4]);
                    break;
            }
        }

        switch (column) {
            case 0:
                label.setText(anlage.getName());
                break;
            case 1:
                label.setText(String.valueOf(anlage.getValue()));
                break;
            case 2:
                label.setText(String.valueOf(anlage.getYear()));
                break;
            case 3:
                label.setText(String.valueOf(anlage.getNd()));
                break;

        }

        return label;
    }

}
