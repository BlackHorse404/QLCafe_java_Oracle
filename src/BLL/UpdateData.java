/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BLL;

import DAL.DataAccess;

/**
 *
 * @author PC THAO
 */
public class UpdateData {
     private DataAccess da;

    public UpdateData() {
       
    }
    //Tạo tablespace
    public boolean createTablespace(String name)
    {
        try
        {
            da = new DataAccess(String.format ("CREATE TABLESPACE %s" ,name));
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
    //Xóa datafile ra khỏi tablespace
    public boolean dropDataFileTablespace(String path)
    {
        try
        {
            da = new DataAccess(String.format ("Alter database datafile '%s' offline drop" ,path));
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
}
