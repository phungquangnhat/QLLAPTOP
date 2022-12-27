/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import static Controller.DangKy_Controller.conn;
import static Controller.DangKy_Controller.pstate;
import static Controller.DangKy_Controller.sql;
import Model.tbDangKy;
import static QLLapTop.QLLAPTOP.*;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;


public class mdiDangKy extends javax.swing.JInternalFrame {

        DefaultTableModel tbldanhsach;
         
        String TK,hoten,email,MK;
    public mdiDangKy() {
        initComponents();
        tbldanhsach=(DefaultTableModel) dgDanhSach.getModel();
    }
     public void DesignTable(){
        dgDanhSach.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        dgDanhSach.getColumnModel().getColumn(0).setPreferredWidth(100);
        dgDanhSach.getColumnModel().getColumn(1).setPreferredWidth(130);
        dgDanhSach.getColumnModel().getColumn(2).setPreferredWidth(105);
        dgDanhSach.getColumnModel().getColumn(3).setPreferredWidth(110);
        
        
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtTenTK = new javax.swing.JTextField();
        txtHoten = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        cmdDangKy = new javax.swing.JButton();
        cmdDangNhap = new javax.swing.JButton();
        txtMK = new javax.swing.JPasswordField();
        txtXacnhanMk = new javax.swing.JPasswordField();
        jScrollPane1 = new javax.swing.JScrollPane();
        dgDanhSach = new javax.swing.JTable();

        setTitle("ĐĂNG KÝ TÀI KHOẢN");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel1.setText("ĐĂNG KÝ TÀI KHOẢN");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Tên Tài Khoản:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Họ Tên:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Email:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Mật Khẩu:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Xác Nhận Mật Khẩu:");

        cmdDangKy.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cmdDangKy.setText("Đăng Ký");
        cmdDangKy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdDangKyActionPerformed(evt);
            }
        });

        cmdDangNhap.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cmdDangNhap.setText("Đăng Nhập");
        cmdDangNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdDangNhapActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 75, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(64, 64, 64))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE))
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtXacnhanMk)
                            .addComponent(txtMK)
                            .addComponent(txtEmail)
                            .addComponent(txtHoten)
                            .addComponent(txtTenTK)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(cmdDangNhap)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cmdDangKy, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
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
                .addGap(54, 54, 54)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmdDangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmdDangKy, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33))
        );

        dgDanhSach.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Tên tài khoản", "Họ tên", "Email", "Mật khẩu"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        dgDanhSach.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dgDanhSachMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(dgDanhSach);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 24, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dgDanhSachMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dgDanhSachMouseClicked
        int index=dgDanhSach.getSelectedRow();
        TableModel model=dgDanhSach.getModel();
        TK=model.getValueAt(index, 0).toString();
        hoten=model.getValueAt(index, 1).toString();
        email=model.getValueAt(index, 2).toString();
        MK=model.getValueAt(index, 3).toString();
        
        
        txtTenTK.setText(TK);
        txtHoten.setText(hoten);
        txtEmail.setText(email);
        txtMK.setText(MK);
       
    }//GEN-LAST:event_dgDanhSachMouseClicked

    private void cmdDangNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdDangNhapActionPerformed
        frmLogin frm = new frmLogin();
        frm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_cmdDangNhapActionPerformed

    private void cmdDangKyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdDangKyActionPerformed
        int dk = JOptionPane.showConfirmDialog(this, "Bạn có muốn đăng ký không?", "Thông báo",JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

        if(dk == JOptionPane.YES_OPTION)
        dispose();

        try {
            conn=null;
            pstate =null;
            conn=DriverManager.getConnection(dbURL);
            sql="Insert Into login(TK,hoten,email,MK,confrm) Values(?,?,?,?,?)";
            pstate= conn.prepareStatement(sql);
            pstate.setString(1, txtTenTK.getText());
            pstate.setString(2, txtHoten.getText());
            pstate.setString(3, txtEmail.getText());

            pstate.setString(4, txtMK.getText());
            pstate.setString(5, txtXacnhanMk.getText());

            int n=pstate.executeUpdate();
            
            if (txtMK.getText().toUpperCase().equals(txtXacnhanMk.getText().toUpperCase())==false) {
                JOptionPane.showMessageDialog(this, "Bạn sai mật khẩu mới.", "Thông Báo", JOptionPane.ERROR_MESSAGE);
                txtXacnhanMk.requestFocus();
                return;
                }
            
            if(txtTenTK.getText().equals("")|txtHoten.getText().equals("")|txtEmail.getText().equals("")|txtMK.getText().equals("")|txtXacnhanMk.getText().equals(""))
            {     JOptionPane.showMessageDialog(this, "Không để thông tin trống!");
            }
            else if(n!=0) {
                   JOptionPane.showMessageDialog(this, "Đăng ký thành công!");
                    }
            else {
                   JOptionPane.showMessageDialog(this, "Đăng ký thất bại!");
                    }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_cmdDangKyActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdDangKy;
    private javax.swing.JButton cmdDangNhap;
    private javax.swing.JTable dgDanhSach;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtHoten;
    private javax.swing.JPasswordField txtMK;
    private javax.swing.JTextField txtTenTK;
    private javax.swing.JPasswordField txtXacnhanMk;
    // End of variables declaration//GEN-END:variables

    void setExtendedState(int MAXIMIZED_BOTH) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setExtendedState(float CENTER_ALIGNMENT) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
