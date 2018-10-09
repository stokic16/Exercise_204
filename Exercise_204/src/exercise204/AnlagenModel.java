package exercise204;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 * @author Kilian Stöckler
 */
public class AnlagenModel extends AbstractTableModel {
    
    private ArrayList<Anlage> anlagen = new ArrayList<>();
    private String[] colNames = {"Bezeichnung", "AK", "Inbetr. Nahme", "ND", "Bish. ND", "Afa bish.", "Werte vor Afa", "Afa. J.", "BW 31.12"};
    
    public void add(Anlage a) {
        anlagen.add(a);
        this.fireTableRowsInserted(anlagen.size() - 1, anlagen.size() - 1);
    }
    
    public void calc(int year){
        for(Anlage a : anlagen){
            a.calc(year);
        }
    }
    
    @Override
    public int getRowCount() {
        return anlagen.size();
    }

    @Override
    public String getColumnName(int column) {
       return colNames[column];
    }
    
    @Override
    public int getColumnCount() {
        return colNames.length;
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return anlagen.get(rowIndex);
    }
    
}
