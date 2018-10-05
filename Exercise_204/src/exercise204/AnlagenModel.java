

package exercise204;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 * @author Kilian Stöckler
 */
public class AnlagenModel extends AbstractTableModel{
    
    private ArrayList<Anlage> anlagen = new ArrayList<>();
    
    public void add(Anlage a){
        
    }
    
    public void calc(String year){
        
    }

    @Override
    public int getRowCount() {
        return anlagen.size();
    }

    @Override
    public int getColumnCount() {
        return 9;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
