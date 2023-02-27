package BLL;

import DAL.DataAccess;
import java.util.ArrayList;

public class GetData {
    
    //fields
    private String[] ColumnNames;
    private Object[][] DataRows;
    
    //<editor-fold defaultstate="collapsed" desc=" Method Support ">
    // query Table
    private ArrayList QueryTable(DataAccess da)
    {
        ColumnNames = da.QueryHeaderTable();
        DataRows = da.QueryContentTable();
        
        ArrayList<Object> arr = new ArrayList();
        arr.add(ColumnNames);
        arr.add(DataRows);
        return arr;
    }
    //</editor-fold>
    
    // API Call 
    
    //<editor-fold defaultstate="collapsed" desc=" Method Show System Oracle ">
    // hiển thị SGA trong oracle
    public ArrayList showSGA()
    {
        DataAccess da = new DataAccess("select * from v$sga");
        return QueryTable(da);
    }
    
    // hiển thị PGA trong oracle
    public ArrayList showPGA()
    {
        DataAccess da = new DataAccess("select * from dba_hist_pgastat");
        return QueryTable(da);
    }
    
    // hiển thị process trong oracle
    public ArrayList showProcess()
    {
        DataAccess da = new DataAccess("select * from v$process");
        return QueryTable(da);
    }
    
    // hiển thị thông tin Instance trong oracle
    public ArrayList showInfoInstance()
    {
        DataAccess da = new DataAccess("select * from v$instance");
        return QueryTable(da);
    }
    
    // hiển thị thông tin Database trong oracle
    public ArrayList showInfoDatabase()
    {
        DataAccess da = new DataAccess("select * from v$database");
        return QueryTable(da);
    }
    
    // hiển thị thông tin Datafile trong oracle
    public ArrayList showDataFile()
    {
        DataAccess da = new DataAccess("select * from v$datafile");
        return QueryTable(da);
    }
    
    // hiển thị thông tin SPFile trong oracle
    public ArrayList showSPFile()
    {
        DataAccess da = new DataAccess("select * from sys.v_$parameter where name = 'spfile'");
        return QueryTable(da);
    }
    
    // hiển thị thông tin ControlFile trong oracle
    public ArrayList showControlFile()
    {
        DataAccess da = new DataAccess("select * from v$controlfile");
        return QueryTable(da);
    }
    
    //<editor-fold defaultstate="collapsed" desc=" Session ">
    //hiển thị thông tin các Session hiện hành
    public ArrayList showSessionCurrent()
    {
        DataAccess da = new DataAccess("Select SADDR ,SID, SERIAL#, AUDSID, USER# ,USERNAME, STATUS, OSUSER,MACHINE, PORT, TERMINAL, PROGRAM, MODULE, TYPE, PREV_EXEC_START  from v$session where USERNAME is not NULL");
        return QueryTable(da);
    } 
    
    //hiển thị thông tin các Session hiện hành
    public ArrayList showProcessOfSession()
    {
        DataAccess da = new DataAccess("select p.pname, s.username, p.username, s.serial#, s.machine, s.program from v$process p, v$session s where s.creator_addr = p.addr");
        return QueryTable(da);
    } 
    //</editor-fold>
    
    //</editor-fold>
}
