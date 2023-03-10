/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import BLL.ExecuteData;
import BLL.GetData;
import Ultilities.ConvertData.ConvertDataORCL;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HieuThao
 */
public class ShowAudit
        extends javax.swing.JFrame {
    private GetData x ;
    private ExecuteData exec ;

    /**
     * Creates new form ShowAudit
     */
    public ShowAudit() {
        initComponents ();
        x= new GetData();
        exec = new ExecuteData ();
        showDataOnTable(x.getDataAudit ());
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
        Table1 = new javax.swing.JTable();
        btn_Delete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        Table1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(Table1);

        btn_Delete.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btn_Delete.setText("Hủy Audit");
        btn_Delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_DeleteMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 737, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(300, 300, 300))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 399, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_DeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_DeleteMouseClicked
        // TODO add your handling code here:
       int row =  Table1.getSelectedRow ();
       exec.DeleteAuditPolicy (Table1.getValueAt (row,0).toString (),Table1.getValueAt (row,1).toString (), Table1.getValueAt (row,3).toString ());
       JOptionPane.showMessageDialog(this, "Hủy audit thành công!","Thông Báo",JOptionPane.INFORMATION_MESSAGE);
       showDataOnTable(x.getDataAudit());

    }//GEN-LAST:event_btn_DeleteMouseClicked

    /**
     * @param args the command line arguments
     */
 public void showDataOnTable(ArrayList arr)
    {
        DefaultTableModel model = (DefaultTableModel)Table1.getModel();
        String[] columnNames = (String[])arr.get(0);
        String[][] data = ConvertDataORCL.ConvertObject2DToString2D((Object[][])arr.get(1));
        model.setDataVector(data, columnNames);
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Table1;
    private javax.swing.JButton btn_Delete;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
