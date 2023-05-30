/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUI.SanPhamGUI;

import BLL.GetData;
import Ultilities.swing.Controls.ButtonColumn;
import java.math.BigDecimal;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import java.sql.Blob;
import DTO.SanPhamDTO;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.lang.System.Logger.Level;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import org.apache.log4j.Logger;
import java.sql.*;
/**
 *
 * @author phatl
 */
public class SanPham extends javax.swing.JPanel {

    GetData x = new GetData();
    
    public SanPham() {
        initComponents();
        loadDataMon(x.getDataThucDon());
    }

    void loadDataMon(ArrayList info) {
        SanPhamDTO td = new SanPhamDTO();
        
        // Set up the table with column names
        String[] columnNames = {"Mã món", "Tên món", "Kích cỡ", "Giá", "Hình ảnh"};
        table.setModel(new DefaultTableModel(new Object[][]{}, columnNames) {
            Class[] columTypes = new Class[]{
                Object.class, Object.class, Object.class, Object.class, ImageIcon.class
            };

            public Class getColumnClass(int columnIndex) {
                return columTypes[columnIndex];
            }
        });
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        String trangthai = null;
        // Add the data rows to the table
        Object[][] info1 = (Object[][]) info.get(1);
        int daudexoa = 0;
        for (Object[] innerList : info1) {

            if (innerList[0] instanceof String) {
                td.setId( (String) innerList[0]);
            }
            if (innerList[5] instanceof Blob) {
                td.setImageBlob((Blob) innerList[5]);
            }
            if (innerList[3] instanceof BigDecimal) {
                td.setPrice(((BigDecimal) innerList[3]).intValue());
            }
            if (innerList[1] instanceof String) {
                td.setName((String) innerList[1]);
            }
            if (innerList[2] instanceof String) {
                 td.setKc((String)  innerList[2]);
            }
            if (innerList[4] instanceof byte[]) {
                byte[] byteArr = (byte[]) innerList[4];
                trangthai = Byte.toString(byteArr[0]);
                if (trangthai.compareTo("1") == 0) {
                    td.setTrangthai("Còn");
                } else {
                     td.setTrangthai("Đã hết");
                    continue;
                }
            }

            BufferedImage image;
            try {
                try {
                    image = ImageIO.read(td.getImageBlob().getBinaryStream());
                    Image scaledImage = image.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
                    ImageIcon scaledImageIcon = new ImageIcon(scaledImage);
                    // Add the row data to the table model
                    if(td.getTrangthai().equals("Còn"))
                    {
                         Object[]  rowData = {td.getId(), td.getName(), td.getKc(), td.getPrice() , scaledImageIcon};
                         model.addRow(rowData);
                    }
                   
                } catch (IOException ex) {
                }
            } catch (SQLException ex) {
            }
        }
        table.setRowHeight(100);
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();

        setMinimumSize(new java.awt.Dimension(785, 607));
        setPreferredSize(new java.awt.Dimension(785, 607));

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(table);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 785, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 607, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
