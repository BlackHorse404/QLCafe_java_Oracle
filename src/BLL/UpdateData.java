/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BLL;

import DAL.DataAccess;
import javax.swing.JOptionPane;
import oracle.sql.RAW;

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
        
         try 
            {
                String chuoi ="UPDATE HoaDon SET NGAYLAP = TO_DATE('" + ngaylap + "', 'DD-MM-YYYY'), HINHTHUC = N'" + hinhthuc + "', KHACHHANGMAKH = '" + khachhangmakhString + "', KHUYENMAIMAKM = '" + khuyenmaimakmString + "', NHANVIENMANV = '" + nhanvienmanv + "' WHERE MAHD = '" + mahd + "'";
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
//Thêm hóa đơn
    public  boolean  insertHD(String ngaylap,String hinhthuc,String khachhangmakhString,String khuyenmaimakmString,String nhanvienmanv,String mahd)
    {
           
        try {
            String chuoi = "INSERT INTO HoaDon(MAHD, NGAYLAP, HINHTHUC, KHACHHANGMAKH, KHUYENMAIMAKM, NHANVIENMANV) VALUES "
                    + "('" + mahd + "', TO_DATE('" + ngaylap + "', 'DD-MM-YYYY'), '" + hinhthuc + "', '" + khachhangmakhString + "', '" + khuyenmaimakmString + "', '" + nhanvienmanv + "')";
            da = new DataAccess(chuoi);
            return true;
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            return false;
        }

    }
    //Thêm Thực Đơn
    public  boolean  insertTD(String mamon,String tenmon,String gia,String kichco,String trangthai,String mota,String phanloaiml)
    {
           
        try {
            String chuoi = "INSERT INTO ThucDon(MAMON,TENMON,GIA,KICHCO,TRANGTHAI,MOTA,PHANLOAIMALOAI) VALUES "
                    + "('" + mamon + "'," +"N'" + tenmon + "',"  + gia + "," + "'" + kichco + "'," +"'" + trangthai + "'," +"N'" + mota + "'," +"'" + phanloaiml + "'" +")";
            da = new DataAccess(chuoi);
            return true;
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            return false;
        }

    }
    //cập nhật hóa đơn
    public  boolean  updateTD( String tenmon,String gia,String kichco,String trangthai,String mota,String maml,String mamon)
    {
        
         try 
            {
                String chuoi ="UPDATE ThucDon SET TENMON = N'" + tenmon + "',"+"GIA = '"+ gia +"',"+" KICHCO = '" + kichco +"'"+ ", TRANGTHAI = '" + trangthai +"',"+"MOTA ='"+ mota+"',"+"PHANLOAIMALOAI = '"+ maml+"'"+" WHERE MAMON = '" + mamon + "'";   
                da = new DataAccess(chuoi);
                return true;
            } 
        catch (Exception ex) 
            {
            
                System.out.println (ex.getMessage ());
                return false;
            }
    }
    //Xóa Thưc Đơn
    public  boolean deleteTD(String matd)
    {
        try 
            {
                String chuoi ="DELETE THUCDON WHERE MAMON = '"+matd+"'";     
                da = new DataAccess(chuoi);
                return true;
            } 
        catch (Exception ex) 
            {
            
                System.out.println (ex.getMessage ());
                return false;
            }
    }
    //Thêm Khách Hàng
    public  boolean  insertKH(String makh,String tenkh,String gioitinh,String sdt,String diemtich,String hsd)
    {
           
        try {
            String chuoi = "INSERT INTO KhachHang(MAKH,TENKH,GIOITINH,SDT,DIEMTICHLUY,HSD) VALUES "
                    + "('" + makh + "'," +"N'" + tenkh + "'," +"N'" + gioitinh +"'," + "'" + sdt + "',"  + diemtich  +"," +"TO_DATE('" + hsd + "', 'DD-MM-YYYY')"  + ")";
            da = new DataAccess(chuoi);
            return true;
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            return false;
        }

    }
    //cập nhật Khách Hàng
    public  boolean  updateKH( String tenkh,String gioitinh,String sdt,String diemtich,String hsd,String makh)
    {
        
         try 
            {
                String chuoi ="UPDATE KhachHang SET TENKH = N'" + tenkh + "',"+"GIOITINH = N'"+ gioitinh +"',"+" SDT = '" + sdt +"'"+ ", DIEMTICHLUY = " + diemtich +","+"HSD = TO_DATE('" + hsd + "', 'DD-MM-YYYY')"+" WHERE MAKH = '" + makh + "'";   
                da = new DataAccess(chuoi);
                return true;
            } 
        catch (Exception ex) 
            {
            
                System.out.println (ex.getMessage ());
                return false;
            }
         
    }
    //Xóa Khách Hàng
    public  boolean deleteKH(String makh)
    {
        try 
            {
                String chuoi ="DELETE KhachHang WHERE MAKH = '"+makh+"'";     
                da = new DataAccess(chuoi);
                return true;
            } 
        catch (Exception ex) 
            {
            
                System.out.println (ex.getMessage ());
                return false;
            }
    }
    //Thêm Khuyến Mãi
    public  boolean  insertKM(String makm,String tenkm,String tile)
    {
           
        try {
            String chuoi = "INSERT INTO KhuyenMai(MAKM,TENKM,TILE) VALUES "
                    + "('" + makm + "'," +"N'" + tenkm + "',"+ tile  + ")";
            da = new DataAccess(chuoi);
            return true;
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            return false;
        }
    }
    //cập nhật Khách Hàng
    public  boolean  updateKM( String tile ,String tenkm,String makm)
    {
        
         try 
            {
                String chuoi ="UPDATE KHUYENMAI SET  "+"TENKM = N'"+ tenkm +"',"+" TILE = " + tile +" WHERE MAKM = '" + makm + "'";   
                da = new DataAccess(chuoi);
                return true;
            } 
        catch (Exception ex) 
            {
            
                System.out.println (ex.getMessage ());
                return false;
            }
         
    }
    //Xóa khuyến mãi
    public  boolean deleteKM(String makm)
    {
        try 
            {
                String chuoi ="DELETE KhuyenMai WHERE MAKM = '"+makm+"'";     
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

