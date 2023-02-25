package BLL;

import DAL.DataAccess;
import java.util.ArrayList;

public class GetData {
    
    private String[] ColumnNames;
    private Object[][] DataRows;
    
    public ArrayList showSGA()
    {
        DataAccess da= new DataAccess("select * from v$sga");
        ColumnNames = da.QueryHeaderTable();
        //System.out.print(ColumnNames.length);
        DataRows = da.QueryContentTable();
        ArrayList<Object> arr = new ArrayList();
        arr.add(ColumnNames);
        arr.add(DataRows);
        return arr;
    }
}
