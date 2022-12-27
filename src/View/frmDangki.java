
package View;



import static Controller.DangKy_Controller.conn;
import static Controller.DangKy_Controller.pstate;
import static Controller.DangKy_Controller.sql;
import Model.tbDangKy;
import static QLLapTop.QLLAPTOP.*;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class frmDangki extends javax.swing.JInternalFrame {
    List<tbDangKy> arr = new ArrayList<>();
    String TK,hoten,email,MK;
    
    
    public frmDangki() {
        initComponents();  
        
    }
    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtTenTK = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtHoten = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        cmdDK = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtMK = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        txtXacnhanMk = new javax.swing.JPasswordField();
        cmdCanel = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Họ Tên:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Xác Nhận Mật Khẩu:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Email:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Mật Khẩu:");

        cmdDK.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        cmdDK.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/User.png"))); // NOI18N
        cmdDK.setText("Đăng Ký");
        cmdDK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdDKActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(51, 255, 204));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ĐĂNG KÝ TÀI KHOẢN");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Tên Tài Khoản:");

        cmdCanel.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        cmdCanel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Exit.png"))); // NOI18N
        cmdCanel.setText("Thoát");
        cmdCanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCanelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE))
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtMK, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtHoten, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEmail)
                            .addComponent(txtXacnhanMk)
                            .addComponent(txtTenTK, javax.swing.GroupLayout.Alignment.LEADING))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(cmdDK)
                        .addGap(55, 55, 55)
                        .addComponent(cmdCanel, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(108, 108, 108))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addComponent(jLabel1)
                .addGap(0, 134, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTenTK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHoten, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtXacnhanMk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmdDK, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmdCanel, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdCanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCanelActionPerformed

        this.dispose();
    }//GEN-LAST:event_cmdCanelActionPerformed

    private void cmdDKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdDKActionPerformed

        if(txtTenTK.getText().equals("")|txtHoten.getText().equals("")|txtEmail.getText().equals("")|txtMK.getText().equals("")|txtXacnhanMk.getText().equals(""))
        {       JOptionPane.showMessageDialog(this, "Không để thông tin trống!","Thông báo",JOptionPane.INFORMATION_MESSAGE);
                return;
        }
        try {
            conn = DriverManager.getConnection(dbURL);
            
            if (txtMK.getText().toUpperCase().equals(txtXacnhanMk.getText().toUpperCase())==false) {
                JOptionPane.showMessageDialog(this, "Bạn sai mật khẩu!", "Thông Báo", JOptionPane.ERROR_MESSAGE);
                txtXacnhanMk.requestFocus();
                return;
            }

            //int dk = JOptionPane.showConfirmDialog(this, "Bạn có muốn đăng ký không?", "Thông báo",JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

            //if(dk == JOptionPane.YES_OPTION){

                //conn=DriverManager.getConnection(dbURL);
                sql="Insert Into login(TK,hoten,email,MK) Values(?,?,?,?)";
                pstate= conn.prepareStatement(sql);
                pstate.setString(1, txtTenTK.getText());
                pstate.setString(2, txtHoten.getText());
                pstate.setString(3, txtEmail.getText());
                pstate.setString(4, txtMK.getText());
               // pstate.setString(5, txtXacnhanMk.getText());
                
                int n =pstate.executeUpdate();
                
                JOptionPane.showMessageDialog(this, "Đăng ký thành công!","Thông báo",JOptionPane.INFORMATION_MESSAGE);
                // }
                frmLogin frm = new frmLogin();
                frm.setVisible(true);
                this.dispose();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(frmDangki.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_cmdDKActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdCanel;
    private javax.swing.JButton cmdDK;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtHoten;
    private javax.swing.JPasswordField txtMK;
    private javax.swing.JTextField txtTenTK;
    private javax.swing.JPasswordField txtXacnhanMk;
    // End of variables declaration//GEN-END:variables

    
}
