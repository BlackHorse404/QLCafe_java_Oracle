/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;
import java.sql.*;
/**
 *
 * @author phatl
 */
public class DBConfig {
    private static String servername = "@localhost";
    private static String port = "1521";
    private static String SID = "orcl";
    public static String username;
    public static String password;
    
    public static Connection getConnectionString()
    {
        try{
            //step1 load the driver class  
            Class.forName("oracle.jdbc.driver.OracleDriver");  
            //username += " as sysdba";
            //step2 create  the connection object  
            return DriverManager.getConnection(String.format("jdbc:oracle:thin:%s:%s:%s", servername, port, SID), username, password);   
        }
        catch(Exception err)
        {
            return null;
        } 
    }
    
    public static void testgetConnect(){
        System.out.print(String.format("jdbc:oracle:thin:%s:%s:%s - %s/%s", servername, port, SID, username, password));
    }
}
