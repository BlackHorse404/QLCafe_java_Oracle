package DAL;

import java.sql.*; 
/**
 *
 * @author phatl
 */
public class ConnectOrcl {
    
    public static String[][] GetTableCountries(String[] ColumnNames) throws SQLException
    {
        // get connect String
        Connection con = DBConfig.getConnectionString();
        try{  
            // create statement
            Statement stmt = con.createStatement(
                ResultSet.TYPE_SCROLL_INSENSITIVE,
                ResultSet.CONCUR_READ_ONLY
            ); 
                
            // query database
            ResultSet rs = stmt.executeQuery("select * from hr.countries");
            
            
            //get column name
            ResultSetMetaData rsmd = rs.getMetaData();
            System.out.print(rsmd.getColumnCount());
            
            ColumnNames[0] = rsmd.getColumnName(1);
            ColumnNames[1] = rsmd.getColumnName(2);
            ColumnNames[2] = rsmd.getColumnName(3);
            
            //get size record
            int size = 0;
            rs.last();
            size = rs.getRow();
            rs.beforeFirst();
            
            //show resulut query
            String[][] temps = new String[size][3];
            
            int i=0;
            while(rs.next()){
                temps[i][0] = rs.getString(1);
                temps[i][1] = rs.getString(2);
                temps[i][2] = String.format("%d",rs.getInt(3));
                i++;
            }
            return temps;
        }
        catch(Exception e){ 
            System.out.println(e);
        }  
        finally{
            con.close(); 
        }    
        return null;
    }
    
    public static String[][] GetTableEmployees(String[] ColumnNames) throws SQLException
    {
        // get connect String
        Connection con = DBConfig.getConnectionString();
        try{  
            // create statement
            Statement stmt = con.createStatement(
                ResultSet.TYPE_SCROLL_INSENSITIVE,
                ResultSet.CONCUR_READ_ONLY
            ); 
                
            // query database
            ResultSet rs = stmt.executeQuery("select * from hr.Employees");

            //get column name
            ResultSetMetaData rsmd = rs.getMetaData();
            int numColumn = rsmd.getColumnCount();
            System.out.print(rsmd.getColumnCount());
            for(int i =0;i<numColumn;i++)
            {
                ColumnNames[i] = rsmd.getColumnName(i+1);
            }
            //get size record
            int size = 0;
            rs.last();
            size = rs.getRow();
            rs.beforeFirst();
            //show resulut query
            String[][] temps = new String[size][11];
            
            int i=0;
            while(rs.next()){
                temps[i][0] = String.valueOf(rs.getFloat(1));
                temps[i][1] = rs.getString(2);
                temps[i][2] = rs.getString(3);
                temps[i][3] = rs.getString(4);
                temps[i][4] = rs.getString(5);
                temps[i][5] = String.valueOf(rs.getDate(6));
                temps[i][6] = rs.getString(7);
                temps[i][7] = String.valueOf(rs.getFloat(8));
                temps[i][8] = String.valueOf(rs.getFloat(9));
                temps[i][9] = String.valueOf(rs.getFloat(10));
                temps[i][10] = String.valueOf(rs.getFloat(11));
                i++;
            }
            return temps;
        }
        catch(Exception e){ 
            System.out.println(e+"-105");
        }  
        finally{
            con.close(); 
        }    
        return null;
    }
}
