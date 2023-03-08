/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BLL;

import DAL.DataAccess;
import javax.swing.JOptionPane;

/**
 *
 * @author PC THAO
 */
public class UpdateData {
     private DataAccess da;

    public UpdateData() {
       
    }
    //Tạo tablespace
    public boolean createTablespace(String name, String path, String size)
    {
        try
        {
            da = new DataAccess(String.format ("CREATE TABLESPACE %s datafile '%s' size %s M" ,name, path, size));
            return true;
        }
        catch(Exception ex)
        {
            System.out.println (ex.getMessage ());
            return false;
        }
    }
    //Thay đổi tên tablespace
    public boolean changeNameTablespace(String oldname, String newname)
    {
        try
        {
            da = new DataAccess(String.format ("Alter tablespace %s rename to %s" ,oldname, newname));
            return true;
        }
        catch(Exception ex)
        {
            System.out.println (ex.getMessage ());
            return false;
        }
                
        
    }
    //Thêm datafile vào tablespace
    public boolean addDataFileTablespace(String name, String path, String size)
    {
        try
        {
            da = new DataAccess(String.format ("Alter tablespace %s add datafile '%s' size %s"+ "M" ,name,path, size));
            return true;
        }
        catch(Exception ex)
        {
            System.out.println (ex.getMessage ());
            return false;
        }
                
        
    }
    //Thêm datafile đã tồn tại vào tablespace
    public boolean addDataFileExistTablespace(String name, String path)
    {
        try
        {
            da = new DataAccess(String.format ("Alter tablespace %s add  datafile '%s'" ,name,path));
            return true;
        }
        catch(Exception ex)
        {
            System.out.println (ex.getMessage ());
            return false;
        }
                
        
    }
    //Xóa datafile ra khỏi tablespace
    public boolean dropDataFileTablespace(String path, String name)
    {
        try
        {
            da = new DataAccess(String.format ("ALTER TABLESPACE %s DROP DATAFILE '%s';" ,name,path));
            return true;
        }
        catch(Exception ex)
        {
            System.out.println (ex.getMessage ());
            return false;
        }
                
        
    }
    //Xóa tablespace
    public boolean dropTablespace(String name)
    {
        try
        {
            da = new DataAccess(String.format ("drop Tablespace %s including contents" ,name));
            return true;
        }
        catch(Exception ex)
        {
            System.out.println (ex.getMessage ());
            return false;
        }
                
        
    }
    //Xóa tablespace and datafile
    public boolean dropAllTablespace(String name)
    {
        try
        {
            da = new DataAccess(String.format ("drop Tablespace %s including contents and datafiles" ,name));
            return true;
        }
        catch(Exception ex)
        {
            System.out.println (ex.getMessage ());
            return false;
        }
                
        
    }
    public boolean resizeDatafile(String path, String size)
    {
        try
        {
            da = new DataAccess(String.format ("Alter database datafile '%s' resize %s"+ "M" ,path, size));
            return true;
        }
        catch(Exception ex)
        {
            System.out.println (ex.getMessage ());
            return false;
        }              
    }
    //cập nhật hóa đơn
    public  boolean  updateHD(String ngaylap,String hinhthuc,String khachhangmakhString,String khuyenmaimakmString,String nhanvienmanv,String mahd)
    {
        int updateCount = 0;
        while (updateCount < 2)
        {
         try 
            {
                String chuoi ="UPDATE HoaDon SET NGAYLAP = '" + ngaylap + "', HINHTHUC = N'" + hinhthuc + "', KHACHHANGMAKH = '" + khachhangmakhString + "', KHUYENMAIMAKM = '" + khuyenmaimakmString + "', NHANVIENMANV = '" + nhanvienmanv + "' WHERE MAHD = '" + mahd + "'";
//                da = new DataAccess(String.format ("UPDATE HoaDon Set NGAYLAP = '%s',HINHTHUC = N'%s',KHUYENMAIMAKM='%s',NHANVIENMANV='%s'" +"Where MAHD ='%s'" ,ngaylap,hinhthuc,khachhangmakhString,khuyenmaimakmString,nhanvienmanv,mahd ));           
                da = new DataAccess(chuoi);
                return true;
            } 
        catch (Exception ex) 
            {
            
                System.out.println (ex.getMessage ());
                return false;
            }
        }
        return false;
    }
//Thêm hóa đơn
    public  boolean  insertHD(String ngaylap,String hinhthuc,String khachhangmakhString,String khuyenmaimakmString,String nhanvienmanv,String mahd)
    {
           
         try 
            {

                String chuoi ="SET NLS_DATE_FORMAT 'DD-MM-YYYY'; "+"INSERT INTO HoaDon(MAHD,NGAYLAP,HINHTHUC,KHACHHANGMAKH,KHUYENMAIMAKM,NHANVIENMANV) VALUES "+"("+"'" + mahd +"'"+"," +"'"+ ngaylap + "'"+","+"'"+hinhthuc+"'"+","+"'"+khachhangmakhString+"'"+","+"'"+khuyenmaimakmString+"'"+","+"'"+nhanvienmanv+"'"+")";
//                da = new DataAccess(String.format ("UPDATE HoaDon Set NGAYLAP = '%s',HINHTHUC = N'%s',KHUYENMAIMAKM='%s',NHANVIENMANV='%s'" +"Where MAHD ='%s'" ,ngaylap,hinhthuc,khachhangmakhString,khuyenmaimakmString,nhanvienmanv,mahd ));           
                da = new DataAccess(chuoi);
                return true;
            } 
        catch (Exception ex) 
            {
            
                System.out.println (ex.getMessage ());
                return false;
            }
    }
}
