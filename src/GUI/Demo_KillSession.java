/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;
import DAL.DBConfig;
import java.awt.Color;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author phatl
 */
public class Demo_KillSession extends javax.swing.JFrame {

    /**
     * Creates new form Demo_KillSession
     */
    public Demo_KillSession() {
        initComponents();
    }

    private Connection conn = null;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt_username = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_password = new javax.swing.JTextField();
        login = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        label_state = new javax.swing.JLabel();
        login1 = new javax.swing.JButton();
        lb_err = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Username");
        jLabel1.setToolTipText("");

        jLabel2.setText("Password");

        login.setBackground(new java.awt.Color(0, 255, 255));
        login.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        login.setForeground(new java.awt.Color(0, 0, 0));
        login.setText("Login");
        login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginMouseClicked(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel3.setText("Demo Session");
        jLabel3.setToolTipText("");

        label_state.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        label_state.setText("Trạng Thái: ");

        login1.setBackground(new java.awt.Color(255, 204, 51));
        login1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        login1.setForeground(new java.awt.Color(0, 0, 0));
        login1.setText("Load");
        login1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                login1MouseClicked(evt);
            }
        });

        lb_err.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lb_err.setText("err");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_password, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label_state, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(login1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_username, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(41, 41, 41))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lb_err, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(223, 223, 223))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(5, 5, 5)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txt_username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(login1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(label_state, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb_err, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //load data for demo kill session
    private void loadDataOnTable()
    {
        System.out.print("Vèo");
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        try{
            Statement state = conn.createStatement( 
                ResultSet.TYPE_SCROLL_INSENSITIVE,
                ResultSet.CONCUR_READ_ONLY);
            
            ResultSet rs = state.executeQuery("select * from hr.Employees");
            //get title column
            ResultSetMetaData rsmd = rs.getMetaData();
            int numColumn = rsmd.getColumnCount();
            Object[] ColumnNames = new Object[numColumn];
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
            String[][] temps = new String[size][numColumn];
            
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
            //conn.close();
            model.setDataVector(temps, ColumnNames);
        }
        catch(SQLException err)
        {
            model.setColumnCount(0);
            model.setRowCount(0);
            label_state.setText("Trạng thái đăng nhập: Đã bị hủy !");
            lb_err.setText(err.getMessage());
            lb_err.setForeground(Color.red);
            System.out.print(err.getMessage());
        }
        
    }
    
    private void loginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginMouseClicked
        DBConfig.username = txt_username.getText();
        DBConfig.password = txt_password.getText();
        try{
            conn = DBConfig.getConnectionString();
            //System.out.print(conn.getSchema());
            conn.createStatement();
            //conn.close();
            label_state.setText("Trạng thái đăng nhập: thành Công");
            lb_err.setText("");
            lb_err.setForeground(Color.BLACK);
            JOptionPane.showMessageDialog(this, "Đăng nhập Thành Công !","Thông Báo",JOptionPane.INFORMATION_MESSAGE);
        }
        catch(SQLException err)
        {
            label_state.setText("Trạng thái đăng nhập: Thất Bại !");
            lb_err.setText(err.getMessage());
            lb_err.setForeground(Color.red);
            JOptionPane.showMessageDialog(this, "Đăng nhập Thất Bại !","Thông Báo",JOptionPane.ERROR_MESSAGE);
        }      
    }//GEN-LAST:event_loginMouseClicked

    private void login1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_login1MouseClicked
        if(conn != null)
            loadDataOnTable();
    }//GEN-LAST:event_login1MouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel label_state;
    private javax.swing.JLabel lb_err;
    private javax.swing.JButton login;
    private javax.swing.JButton login1;
    private javax.swing.JTextField txt_password;
    private javax.swing.JTextField txt_username;
    // End of variables declaration//GEN-END:variables
}