/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import javax.swing.JOptionPane;

/**
 *
 * @author phatl
 */
public class Dashboard extends javax.swing.JFrame {

    /**
     * Creates new form Dashboard
     */
    public Dashboard() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menu_spfile = new javax.swing.JMenu();
        menu_ControlFile = new javax.swing.JMenu();
        menu_dataFile = new javax.swing.JMenu();
        menu_SGA = new javax.swing.JMenu();
        menu_PGA = new javax.swing.JMenu();
        menu_Process = new javax.swing.JMenu();
        menu_Instance = new javax.swing.JMenu();
        menu_Database = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        menu_account = new javax.swing.JMenu();
        menu_settingAccount = new javax.swing.JMenu();
        menu_logout = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFont(new java.awt.Font("#9Slide03 AllRoundGothic", 0, 14)); // NOI18N

        jMenuBar1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jMenu1.setText("Hệ Thống");
        jMenu1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        menu_spfile.setText("PFile");
        menu_spfile.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        menu_spfile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menu_spfileMouseClicked(evt);
            }
        });
        jMenu1.add(menu_spfile);

        menu_ControlFile.setText("Control file");
        menu_ControlFile.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        menu_ControlFile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menu_ControlFileMouseClicked(evt);
            }
        });
        jMenu1.add(menu_ControlFile);

        menu_dataFile.setText("DataFile");
        menu_dataFile.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        menu_dataFile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menu_dataFileMouseClicked(evt);
            }
        });
        jMenu1.add(menu_dataFile);

        menu_SGA.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        menu_SGA.setLabel("SGA");
        menu_SGA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menu_SGAMouseClicked(evt);
            }
        });
        jMenu1.add(menu_SGA);

        menu_PGA.setText("PGA");
        menu_PGA.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        menu_PGA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menu_PGAMouseClicked(evt);
            }
        });
        jMenu1.add(menu_PGA);

        menu_Process.setText("Process");
        menu_Process.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        menu_Process.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menu_ProcessMouseClicked(evt);
            }
        });
        jMenu1.add(menu_Process);

        menu_Instance.setText("Instance");
        menu_Instance.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        menu_Instance.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menu_InstanceMouseClicked(evt);
            }
        });
        jMenu1.add(menu_Instance);

        menu_Database.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        menu_Database.setLabel("Database");
        menu_Database.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menu_DatabaseMouseClicked(evt);
            }
        });
        jMenu1.add(menu_Database);

        jMenu5.setText("Tablespace");
        jMenu5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu5MouseClicked(evt);
            }
        });
        jMenu1.add(jMenu5);

        jMenuBar1.add(jMenu1);

        menu_account.setText("Tài Khoản");
        menu_account.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        menu_settingAccount.setText("Cài Đặt");
        menu_settingAccount.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        menu_settingAccount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menu_settingAccountMouseClicked(evt);
            }
        });
        menu_account.add(menu_settingAccount);

        menu_logout.setText("Đăng Xuất");
        menu_logout.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        menu_logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menu_logoutMouseClicked(evt);
            }
        });
        menu_account.add(menu_logout);

        jMenu2.setText("Tạo Tài Khoản");
        jMenu2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        menu_account.add(jMenu2);

        jMenuBar1.add(menu_account);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 461, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 363, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menu_DatabaseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_DatabaseMouseClicked
        S_Database t = new S_Database();
        t.setVisible(true);
    }//GEN-LAST:event_menu_DatabaseMouseClicked

    private void menu_InstanceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_InstanceMouseClicked
        S_Instance t = new S_Instance();
        t.setVisible(true);
    }//GEN-LAST:event_menu_InstanceMouseClicked

    private void menu_ProcessMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_ProcessMouseClicked
        S_Process t = new S_Process();
        t.setVisible(true);
    }//GEN-LAST:event_menu_ProcessMouseClicked

    private void menu_PGAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_PGAMouseClicked
        S_PGA ld = new S_PGA();
        ld.setVisible(true);
    }//GEN-LAST:event_menu_PGAMouseClicked

    // menu system
    
    private void menu_SGAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_SGAMouseClicked
        S_SGA ld = new S_SGA();
        ld.setVisible(true);
    }//GEN-LAST:event_menu_SGAMouseClicked

    private void menu_dataFileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_dataFileMouseClicked
        S_Datafile t = new S_Datafile();
        t.setVisible(true);
    }//GEN-LAST:event_menu_dataFileMouseClicked

    private void menu_KillSessionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_KillSessionMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_menu_KillSessionMouseClicked

    private void menu_SoLuongSessionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_SoLuongSessionMouseClicked
        S_NumberOfSession t = new S_NumberOfSession();
        t.setVisible(true);
    }//GEN-LAST:event_menu_SoLuongSessionMouseClicked

    private void menu_ProcessSessionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_ProcessSessionMouseClicked
        S_SessionProcess t = new S_SessionProcess();
        t.setVisible(true);
    }//GEN-LAST:event_menu_ProcessSessionMouseClicked

    private void menu_ControlFileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_ControlFileMouseClicked
        S_ControlFile t = new S_ControlFile();
        t.setVisible(true);
    }//GEN-LAST:event_menu_ControlFileMouseClicked

    private void menu_spfileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_spfileMouseClicked
        S_SPFile t = new S_SPFile();
        t.setVisible(true);
    }//GEN-LAST:event_menu_spfileMouseClicked

    private void jMenu5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu5MouseClicked
        // TODO add your handling code here:
        S_Tablespaces t = new S_Tablespaces ();
        t.showDataOnTable ();
        t.setVisible (true);
        
    }//GEN-LAST:event_jMenu5MouseClicked

    private void menu_logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_logoutMouseClicked
        int a = JOptionPane.showConfirmDialog(this,
                "Bạn chắc chắn muốn đăng xuất ?",
                "Thông Báo",
                JOptionPane.OK_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE
                );
        // JOptionPane.setRootFrame(null);
        if (a == JOptionPane.OK_OPTION) {
            dispose();
            Login obj = new Login();
            obj.setVisible(true);
        }
    }//GEN-LAST:event_menu_logoutMouseClicked

    private void menu_settingAccountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_settingAccountMouseClicked
        ACC_Setting t = new ACC_Setting();
        t.setVisible(true);
    }//GEN-LAST:event_menu_settingAccountMouseClicked
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu menu_ControlFile;
    private javax.swing.JMenu menu_Database;
    private javax.swing.JMenu menu_Instance;
    private javax.swing.JMenu menu_PGA;
    private javax.swing.JMenu menu_Process;
    private javax.swing.JMenu menu_SGA;
    private javax.swing.JMenu menu_account;
    private javax.swing.JMenu menu_dataFile;
    private javax.swing.JMenu menu_logout;
    private javax.swing.JMenu menu_settingAccount;
    private javax.swing.JMenu menu_spfile;
    // End of variables declaration//GEN-END:variables
}
