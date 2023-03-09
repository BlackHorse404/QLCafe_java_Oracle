/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUI;

import BLL.ExecuteData;
import BLL.GetData;
import Ultilities.ConvertData.ConvertDataORCL;
import Ultilities.swing.ButtonColumn;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ScrollPaneConstants;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author phatl
 */
public class SystemForm extends javax.swing.JPanel {

    /**
     * Creates new form SystemForm
     */
    private GetData x = new GetData();
    
    @SuppressWarnings("unchecked")
    public SystemForm() {
        initComponents();

        comboBoxSuggestion.addItem("SGA");
        comboBoxSuggestion.addItem("PGA");
        comboBoxSuggestion.addItem("Process");
        comboBoxSuggestion.addItem("ControlFile");
        comboBoxSuggestion.addItem("Instance");
        comboBoxSuggestion.addItem("SessionProcess");
        comboBoxSuggestion.addItem("SPFile");
        comboBoxSuggestion.addItem("DataFile");
        comboBoxSuggestion.addItem("Database");
        comboBoxSuggestion.addItem("Policy Is Valid");
                       
        showDataOnTable(x.showSGA());
    }

    public void showDataOnTable(ArrayList arr)
    {
        DefaultTableModel model = (DefaultTableModel)table1.getModel();
        String[] columnNames = (String[])arr.get(0);
        String[][] data = ConvertDataORCL.ConvertObject2DToString2D((Object[][])arr.get(1));
        model.setDataVector(data, columnNames);
        countRecord.setText("Số dòng: "+data.length);
    }
    public void showDataOnTable(Ultilities.swing.Table table , ArrayList arr)
    {
        DefaultTableModel model = (DefaultTableModel)table.getModel();
        String[] columnNames = (String[])arr.get(0);
        String[][] data = ConvertDataORCL.ConvertObject2DToString2D((Object[][])arr.get(1));
        model.setDataVector(data, columnNames);
        model.addColumn("");
        ButtonColumn btnCol = new ButtonColumn(table, kill, columnNames.length,"Kill");
        countRecord.setText("Số dòng: "+data.length);
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        comboBoxSuggestion = new Ultilities.swing.ComboBoxSuggestion();
        jScrollPane1 = new javax.swing.JScrollPane();
        table1 = new Ultilities.swing.Table();
        countRecord = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        btnRefresh = new Ultilities.swing.ButtonGradient();
        btnDemo = new Ultilities.swing.ButtonGradient();
        jScrollPane2 = new javax.swing.JScrollPane();
        table_tab2 = new Ultilities.swing.Table();
        numRecord_tab2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setForeground(new java.awt.Color(0, 0, 0));
        jTabbedPane1.setToolTipText("");
        jTabbedPane1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTabbedPane1.setVerifyInputWhenFocusTarget(false);
        jTabbedPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane1MouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Hiển Thị Thông Tin");

        comboBoxSuggestion.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        comboBoxSuggestion.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboBoxSuggestionItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(247, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comboBoxSuggestion, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboBoxSuggestion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        table1.setModel(new javax.swing.table.DefaultTableModel(
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
        table1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jScrollPane1.setViewportView(table1);

        countRecord.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        countRecord.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        countRecord.setText("jLabel2");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 715, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(countRecord, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(88, Short.MAX_VALUE)
                .addComponent(countRecord, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(454, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("Thông tin hệ thống", jPanel3);

        btnRefresh.setText("Làm Mới");
        btnRefresh.setBorderPainted(false);
        btnRefresh.setColor2(new java.awt.Color(51, 51, 255));
        btnRefresh.setFocusPainted(false);
        btnRefresh.setFocusable(false);
        btnRefresh.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnRefresh.setSizeSpeed(5.0F);
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        btnDemo.setText("Demo");
        btnDemo.setColor1(new java.awt.Color(153, 0, 255));
        btnDemo.setColor2(new java.awt.Color(255, 0, 255));
        btnDemo.setFocusPainted(false);
        btnDemo.setFocusable(false);
        btnDemo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnDemo.setSizeSpeed(5.0F);
        btnDemo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDemoActionPerformed(evt);
            }
        });

        table_tab2.setModel(new javax.swing.table.DefaultTableModel(
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
        table_tab2.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jScrollPane2.setViewportView(table_tab2);

        numRecord_tab2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        numRecord_tab2.setText("jLabel2");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 715, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(numRecord_tab2, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnDemo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDemo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numRecord_tab2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane1.addTab("Quản lý session", jPanel4);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 715, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 514, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Quản Lý Audit", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void comboBoxSuggestionItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboBoxSuggestionItemStateChanged
        String value = evt.getItem().toString();
        switch(value){
            case "SGA":
                showDataOnTable(x.showSGA());
                break;
            case "PGA":
                showDataOnTable(x.showPGA());
                break;
            case "ControlFile":
                showDataOnTable(x.showControlFile());
                break;
            case "SPFile":
                showDataOnTable(x.showSPFile());
                break;
            case "Instance":
                showDataOnTable(x.showInfoInstance());
                break;
            case "DataFile":
                showDataOnTable(x.showDataFile());
                break;    
            case "Process":
                showDataOnTable(x.showProcess());
                break;
            case "SessionProcess":
                showDataOnTable(x.showProcessOfSession());
                break;
            case "Policy Is Valid":
                showDataOnTable(x.getAllPoliciesInDB());
                break;
            case "Database":
                showDataOnTable(x.showInfoDatabase());
                break;
        }
    }//GEN-LAST:event_comboBoxSuggestionItemStateChanged

    //tab 2 - manager session
    
    Action kill = new AbstractAction()
    {
        public void actionPerformed(ActionEvent e)
        {
            //remove row
            JTable table = (JTable)e.getSource();
            int indexRow = Integer.valueOf( e.getActionCommand() );
            
            String SID = table.getValueAt(indexRow, 0).toString();
            String SerialID = table.getValueAt(indexRow, 1).toString();
            if(ExecuteData.ExecuteSql(SID, SerialID))
            {
                JOptionPane.showMessageDialog(table, "Kill session thành công !","Thông Báo",JOptionPane.INFORMATION_MESSAGE);
                ((DefaultTableModel)table.getModel()).removeRow(indexRow);
            }
            else
            {
                JOptionPane.showMessageDialog(table, "Kill session thất bại !","Thông Báo",JOptionPane.ERROR_MESSAGE);
            }
        }
    };
    
    private void jTabbedPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane1MouseClicked
        showDataOnTable(table_tab2, x.showSessionCurrent());
        numRecord_tab2.setText("Số lượng Session: "+table_tab2.getRowCount());
    }//GEN-LAST:event_jTabbedPane1MouseClicked

    private void btnDemoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDemoActionPerformed
        Demo_KillSession t = new Demo_KillSession();
        t.setVisible(true);
    }//GEN-LAST:event_btnDemoActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        showDataOnTable(table_tab2, x.showSessionCurrent());
        numRecord_tab2.setText("Số lượng Session: "+table_tab2.getRowCount());
    }//GEN-LAST:event_btnRefreshActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Ultilities.swing.ButtonGradient btnDemo;
    private Ultilities.swing.ButtonGradient btnRefresh;
    private Ultilities.swing.ComboBoxSuggestion comboBoxSuggestion;
    private javax.swing.JLabel countRecord;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel numRecord_tab2;
    private Ultilities.swing.Table table1;
    private Ultilities.swing.Table table_tab2;
    // End of variables declaration//GEN-END:variables
}
