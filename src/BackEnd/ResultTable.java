package BackEnd;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;
import java.util.List;

public class ResultTable extends AbstractTableModel {
    private List<Player> list = new ArrayList<Player>();
    private String[] columnNames = {"Player name", "Easy level", "Medium level", "Hard level"};

    public void setList(List<Player> list){
        this.list = list;
        fireTableDataChanged();
    }

    @Override
    public int getRowCount() {
        return list.size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex){
            case 0:
                return list.get(rowIndex).getName();
            case 1:
                return list.get(rowIndex).getEasyLevel();
            case 2:
                return list.get(rowIndex).getMediumLevel();
            case 3:
                return list.get(rowIndex).getHardLevel();
            default:
                return null;
        }
    }
}
