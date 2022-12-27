package View;




import static QLLapTop.QLLAPTOP.*;

import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class frmLogin extends javax.swing.JFrame {

    public frmLogin() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Desktop = new javax.swing.JDesktopPane();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txttk = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtpass = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        ckpass = new javax.swing.JCheckBox();
        btlg = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Desktop.setBackground(new java.awt.Color(0, 204, 204));

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/User.png"))); // NOI18N
        jButton1.setText("Đăng Ký");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 204));
        jLabel1.setText("    LOGIN TO YOUR ACCOUNT");

        txttk.setText("admin");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("Username:");

        txtpass.setText("admin");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setText("Password:");

        ckpass.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        ckpass.setForeground(new java.awt.Color(0, 0, 255));
        ckpass.setText("Show Password");
        ckpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ckpassActionPerformed(evt);
            }
        });

        btlg.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        btlg.setIcon(new javax.swing.ImageIcon("E:\\Download\\login (1).png")); // NOI18N
        btlg.setText("Đăng Nhập");
        btlg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btlgActionPerformed(evt);
            }
        });

        Desktop.setLayer(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Desktop.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Desktop.setLayer(txttk, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Desktop.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Desktop.setLayer(txtpass, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Desktop.setLayer(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Desktop.setLayer(ckpass, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Desktop.setLayer(btlg, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout DesktopLayout = new javax.swing.GroupLayout(Desktop);
        Desktop.setLayout(DesktopLayout);
        DesktopLayout.setHorizontalGroup(
            DesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DesktopLayout.createSequentialGroup()
                .addContainerGap(136, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80)
                .addComponent(btlg)
                .addGap(89, 89, 89))
            .addGroup(DesktopLayout.createSequentialGroup()
                .addGroup(DesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DesktopLayout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(DesktopLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(DesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(62, 62, 62)
                        .addGroup(DesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ckpass)
                            .addComponent(txttk, javax.swing.GroupLayout.DEFAULT_SIZE, 329, Short.MAX_VALUE)
                            .addComponent(txtpass))))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        DesktopLayout.setVerticalGroup(
            DesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DesktopLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addGroup(DesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txttk, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(DesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtpass, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(ckpass)
                .addGap(39, 39, 39)
                .addGroup(DesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btlg, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Desktop)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Desktop)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ckpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ckpassActionPerformed
        if(ckpass.isSelected())
        {
            txtpass.setEchoChar((char)0);
        }else
        {
            txtpass.setEchoChar('*');
        }
    }//GEN-LAST:event_ckpassActionPerformed

    private void btlgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btlgActionPerformed
        if(txttk.getText().length()<=0){
            JOptionPane.showConfirmDialog(this, "Bạn chưa nhập tên đăng nhập?","Thông báo",JOptionPane.WARNING_MESSAGE);
            txttk.requestFocus();
            
            return;
        }
        if(txtpass.getText().length()<=0){
            JOptionPane.showConfirmDialog(this, "Bạn chưa nhập mật khẩu tài khoản?","Thông báo",JOptionPane.WARNING_MESSAGE);
            txtpass.requestFocus();
            return;
        }
            
        Connection conn =null;
        Statement state=null;
        try{
            conn = DriverManager.getConnection(dbURL);
            String us,pw,sql;
            us=txttk.getText();
            pw= txtpass.getText();
            sql="select * from login where TK='"+ us +"' and MK='"+ pw +"'";
            state =conn.createStatement();
            ResultSet rs = state.executeQuery(sql);
            if(rs.next())
            {
                UN=rs.getString("TK");
                //PW=rs.getString("HoTen");
                PW=rs.getString("MK");
                dispose();

                Formmain frm= new Formmain();
                frm.setExtendedState(JFrame.MAXIMIZED_BOTH);
                frm.setVisible(true);
             }else{
                JOptionPane.showMessageDialog(this, "Username hoặc password ko hợp lệ!","Thông báo",JOptionPane.INFORMATION_MESSAGE);
            }
            state.close(); conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(frmLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
            
    }//GEN-LAST:event_btlgActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        frmDangki  frm= new frmDangki();
        Desktop.add(frm);
        
        frm.setLocation((Desktop.getWidth()-frm.getWidth())/2, (Desktop.getHeight()-frm.getHeight())/2);
        frm.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane Desktop;
    private javax.swing.JButton btlg;
    private javax.swing.JCheckBox ckpass;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPasswordField txtpass;
    private javax.swing.JTextField txttk;
    // End of variables declaration//GEN-END:variables
}
