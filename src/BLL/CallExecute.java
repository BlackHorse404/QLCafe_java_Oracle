/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BLL;
import DAL.DataAccess;
import DTO.SanPhamDTO;
import java.io.BufferedWriter;
import java.sql.CallableStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import oracle.jdbc.OracleTypes;
import java.sql.*;
import java.util.Vector;
/**
 *
 * @author phatl
 */
public class CallExecute {
    public static void callDeleteKH(String id){       
        DataAccess.CallSql(String.format("xoaKhachHang('%s')", id));
    }
    
    public static void callDeleteKH_PKH(String id){
        DataAccess.CallSql(String.format("KH_PKG.xoa('%s')", id));
    }
    
//    public static void callTimKiemSanPham(String tenSP){
//        DataAccess.CallSql(String.format("traCuuMonAn('%s')", tenSP));
//    }
    
    public static Vector<Vector> callTimKiemSanPham(String str){
        try {
            Vector<Vector> v = new Vector<Vector>();
            String command = "{call datacaphe.traCuuMonAn(?,?)}";
            CallableStatement cstmt = DataAccess.conn.prepareCall(command);
            cstmt.setString(1, str);
            cstmt.registerOutParameter(2, OracleTypes.CURSOR);
            cstmt.execute();
            ResultSet rs = (ResultSet) cstmt.getObject(2);
            while (rs.next()) {
                Vector t = new Vector();
                t.add(rs.getString(1));
                t.add(rs.getString(2));
                t.add(Integer.parseInt(rs.getString(3)));
                t.add(rs.getString(4));
                if(Integer.parseInt(rs.getString(5)) == 1)
                    t.add("Còn");
                else
                    t.add("Hết");
                v.add(t);
            }
            return v;
        } catch (SQLException ex) {
            Logger.getLogger(DataAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public static Vector<Vector> callTimKiemSanPhamTheoLoai(String str){
        try {
            Vector<Vector> v = new Vector<Vector>();
            String command = "{call datacaphe.traCuuMonTheoLoai(?,?)}";
            CallableStatement cstmt = DataAccess.conn.prepareCall(command);
            cstmt.setString(1, str);
            cstmt.registerOutParameter(2, OracleTypes.CURSOR);
            cstmt.execute();
            ResultSet rs = (ResultSet) cstmt.getObject(2);
            while (rs.next()) {
                Vector t = new Vector();
                t.add(rs.getString(1));
                t.add(rs.getString(2));
                t.add(Integer.parseInt(rs.getString(3)));
                t.add(rs.getString(4));
                if(Integer.parseInt(rs.getString(5)) == 1)
                    t.add("Còn");
                else
                    t.add("Hết");
                v.add(t);
            }
            return v;
        } catch (SQLException ex) {
            Logger.getLogger(DataAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
