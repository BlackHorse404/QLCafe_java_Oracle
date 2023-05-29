package GUI;

import event.EventMenuSelected;
import java.awt.Color;
import javax.swing.JComponent;
import BLL.GetData;
import GUI.Dashboard;
import GUI.HoaDon.CHITIETHOADON;
import GUI.HoaDon.QLHoaDon;
import GUI.KhachHangGUI.KhachHang;
import GUI.Nhanvien.Nhanvien_panel;
import GUI.Role_Priv_Config.GrantRole;
import GUI.SanPhamGUI.SanPham;
import GUI.TimKiem.TimKiem;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import GUI.Role_Priv_Config.GrantRole;
import java.io.File;
import java.sql.*;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author phatl
 */
public class Dashboard extends javax.swing.JFrame {

    /**
     * Creates new form Dashboard
     */
    public static Connection conn = null; 
    public static Login loginForm = null;
    GetData x = new GetData();
    
    public Dashboard(String user) {
        initComponents();
        header.setUsername(x.getCurrentUser());
        header.setLastLogin(x.getLastLogin());
        setBackground(new Color(0, 0, 0, 0));

        menu.initMoving(Dashboard.this);
        menu.addEventMenuSelected(new EventMenuSelected() {
            @Override
            public void selected(int index) {
                System.out.print(index);
                if (index == 0) {
                    setForm(new StartForm());
                } 
                else if (index == 1)
                {
                    setForm(new SanPham());
                }else if (index == 2)
                {
                    setForm(new Nhanvien_panel());
                }
                else if (index == 4)
                {
                    setForm(new KhachHang());
                }
                else if (index == 5) {
                    setForm(new SystemForm());
                }
                else if (index == 6) {
                    setForm(new GrantRole());
                }
                else if (index == 7){
                    setForm(new TimKiem());
                }
                else if (index == 8){
                    setForm(new QLHoaDon());
                }
                 else if (index == 9){
                    setForm(new CHITIETHOADON());
                }
                else if (index == 11) {
                    Logout();
                }
                else if(index == 12)
                {
                    if(JOptionPane.showConfirmDialog(Dashboard.this, "Bạn muốn thoát chương trình ?") == JOptionPane.YES_OPTION)
                        System.exit(0);
                }
            }
        });
        //  set when system open start with home form
        setForm(new StartForm());
    }

    private void Logout(){
        final String javaBin = System.getProperty("java.home") + File.separator + "bin" + File.separator + "java";
        //final File currentJar = new File("dist/QuanLyCafe.jar");
        /* Build command: java -jar application.jar */
        final ArrayList<String> command = new ArrayList<String>();
        command.add(javaBin);
        command.add("-jar");
        //System.out.println("path:" +currentJar.getAbsolutePath());
        command.add(new File("dist\\QuanLyCafe.jar").getAbsolutePath());

        final ProcessBuilder builder = new ProcessBuilder(command);
        try {
            builder.start();
        } catch (IOException ex) {
            Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.exit(0);
    }
    
    private void setForm(JComponent com) {
        mainPanel.removeAll();
        mainPanel.add(com);
        mainPanel.repaint();
        mainPanel.revalidate();
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBorder1 = new Ultilities.swing.PanelBorder();
        menu = new Ultilities.component.Menu();
        mainPanel = new javax.swing.JPanel();
        header = new Ultilities.component.Header();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);

        mainPanel.setMinimumSize(new java.awt.Dimension(1100, 700));
        mainPanel.setOpaque(false);
        mainPanel.setPreferredSize(new java.awt.Dimension(1100, 700));
        mainPanel.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout panelBorder1Layout = new javax.swing.GroupLayout(panelBorder1);
        panelBorder1.setLayout(panelBorder1Layout);
        panelBorder1Layout.setHorizontalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        panelBorder1Layout.setVerticalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelBorder1Layout.createSequentialGroup()
                        .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 713, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1329, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panelBorder1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 779, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panelBorder1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Ultilities.component.Header header;
    private javax.swing.JPanel mainPanel;
    private Ultilities.component.Menu menu;
    private Ultilities.swing.PanelBorder panelBorder1;
    // End of variables declaration//GEN-END:variables
}
