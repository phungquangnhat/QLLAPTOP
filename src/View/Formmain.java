/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

//import java.awt.Desktop;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class Formmain extends javax.swing.JFrame {

    

    

   
    public Formmain() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Desktop = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        cmdsanpham = new javax.swing.JButton();
        cmdloaisp = new javax.swing.JButton();
        cmdhoadon = new javax.swing.JButton();
        cmdthongke = new javax.swing.JButton();
        cmdadmin = new javax.swing.JButton();
        jToolBar1 = new javax.swing.JToolBar();
        btsanpham = new javax.swing.JButton();
        btloaisp = new javax.swing.JButton();
        bthoadon = new javax.swing.JButton();
        btthongke = new javax.swing.JButton();
        btadmin = new javax.swing.JButton();
        btdanxuat = new javax.swing.JButton();
        btthoat = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mnutrangchu = new javax.swing.JMenuItem();
        mnuthoat = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mnusanpham = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        mnuloaisp = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        mnuhoadon = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        mnuthongke = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        manuadmin = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        mnuNhanVien = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Desktop.setBackground(new java.awt.Color(204, 153, 255));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("QUẢN TRỊ HỆ THỐNG");

        cmdsanpham.setBackground(new java.awt.Color(255, 255, 255));
        cmdsanpham.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cmdsanpham.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/List.png"))); // NOI18N
        cmdsanpham.setText("Sản Phẩm");
        cmdsanpham.setFocusable(false);
        cmdsanpham.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        cmdsanpham.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        cmdsanpham.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdsanphamActionPerformed(evt);
            }
        });

        cmdloaisp.setBackground(new java.awt.Color(255, 255, 255));
        cmdloaisp.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cmdloaisp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Documents.png"))); // NOI18N
        cmdloaisp.setText("Loại Sản Phẩm");
        cmdloaisp.setFocusable(false);
        cmdloaisp.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        cmdloaisp.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        cmdhoadon.setBackground(new java.awt.Color(255, 255, 255));
        cmdhoadon.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cmdhoadon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Price list.png"))); // NOI18N
        cmdhoadon.setText("Hóa Đơn");
        cmdhoadon.setFocusable(false);
        cmdhoadon.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        cmdhoadon.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        cmdthongke.setBackground(new java.awt.Color(255, 255, 255));
        cmdthongke.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cmdthongke.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Bar chart.png"))); // NOI18N
        cmdthongke.setText("Thống Kê");
        cmdthongke.setFocusable(false);
        cmdthongke.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        cmdthongke.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        cmdadmin.setBackground(new java.awt.Color(255, 255, 255));
        cmdadmin.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cmdadmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Unknown person.png"))); // NOI18N
        cmdadmin.setText("Admin");
        cmdadmin.setFocusable(false);
        cmdadmin.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        cmdadmin.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        cmdadmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdadminActionPerformed(evt);
            }
        });

        Desktop.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Desktop.setLayer(cmdsanpham, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Desktop.setLayer(cmdloaisp, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Desktop.setLayer(cmdhoadon, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Desktop.setLayer(cmdthongke, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Desktop.setLayer(cmdadmin, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout DesktopLayout = new javax.swing.GroupLayout(Desktop);
        Desktop.setLayout(DesktopLayout);
        DesktopLayout.setHorizontalGroup(
            DesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DesktopLayout.createSequentialGroup()
                .addContainerGap(197, Short.MAX_VALUE)
                .addGroup(DesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DesktopLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(126, 126, 126))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(DesktopLayout.createSequentialGroup()
                            .addComponent(cmdsanpham, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(43, 43, 43)
                            .addComponent(cmdloaisp)
                            .addGap(47, 47, 47)
                            .addComponent(cmdhoadon, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(DesktopLayout.createSequentialGroup()
                            .addGap(57, 57, 57)
                            .addComponent(cmdthongke, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(87, 87, 87)
                            .addComponent(cmdadmin, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(176, Short.MAX_VALUE))
        );
        DesktopLayout.setVerticalGroup(
            DesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DesktopLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jLabel1)
                .addGap(51, 51, 51)
                .addGroup(DesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(DesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(cmdloaisp, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                        .addComponent(cmdhoadon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(cmdsanpham, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(DesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cmdthongke, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                    .addComponent(cmdadmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(59, Short.MAX_VALUE))
        );

        jToolBar1.setBackground(new java.awt.Color(0, 153, 255));
        jToolBar1.setRollover(true);

        btsanpham.setBackground(new java.awt.Color(0, 153, 255));
        btsanpham.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btsanpham.setForeground(new java.awt.Color(255, 255, 255));
        btsanpham.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/List.png"))); // NOI18N
        btsanpham.setText("Sản Phẩm");
        btsanpham.setFocusable(false);
        btsanpham.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btsanpham.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btsanpham.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btsanphamActionPerformed(evt);
            }
        });
        jToolBar1.add(btsanpham);

        btloaisp.setBackground(new java.awt.Color(0, 153, 255));
        btloaisp.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btloaisp.setForeground(new java.awt.Color(255, 255, 255));
        btloaisp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Documents.png"))); // NOI18N
        btloaisp.setText("Loại Sản Phẩm");
        btloaisp.setFocusable(false);
        btloaisp.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btloaisp.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btloaisp);

        bthoadon.setBackground(new java.awt.Color(0, 153, 255));
        bthoadon.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bthoadon.setForeground(new java.awt.Color(255, 255, 255));
        bthoadon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Price list.png"))); // NOI18N
        bthoadon.setText("Hóa Đơn");
        bthoadon.setFocusable(false);
        bthoadon.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bthoadon.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(bthoadon);

        btthongke.setBackground(new java.awt.Color(0, 153, 255));
        btthongke.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btthongke.setForeground(new java.awt.Color(255, 255, 255));
        btthongke.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Bar chart.png"))); // NOI18N
        btthongke.setText("Thống Kê");
        btthongke.setFocusable(false);
        btthongke.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btthongke.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btthongke);

        btadmin.setBackground(new java.awt.Color(0, 153, 255));
        btadmin.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btadmin.setForeground(new java.awt.Color(255, 255, 255));
        btadmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Unknown person.png"))); // NOI18N
        btadmin.setText("Admin");
        btadmin.setFocusable(false);
        btadmin.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btadmin.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btadmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btadminActionPerformed(evt);
            }
        });
        jToolBar1.add(btadmin);

        btdanxuat.setBackground(new java.awt.Color(0, 153, 255));
        btdanxuat.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btdanxuat.setForeground(new java.awt.Color(255, 255, 255));
        btdanxuat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Exit.png"))); // NOI18N
        btdanxuat.setText("Đăng Xuất");
        btdanxuat.setFocusable(false);
        btdanxuat.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btdanxuat.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btdanxuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btdanxuatActionPerformed(evt);
            }
        });
        jToolBar1.add(btdanxuat);

        btthoat.setBackground(new java.awt.Color(0, 153, 255));
        btthoat.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btthoat.setForeground(new java.awt.Color(255, 255, 255));
        btthoat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Delete.png"))); // NOI18N
        btthoat.setText("Thoát");
        btthoat.setFocusable(false);
        btthoat.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btthoat.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btthoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btthoatActionPerformed(evt);
            }
        });
        jToolBar1.add(btthoat);

        jMenu1.setText("Hệ thống");
        jMenu1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        mnutrangchu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Add.png"))); // NOI18N
        mnutrangchu.setText("Trang chủ");
        jMenu1.add(mnutrangchu);

        mnuthoat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Delete.png"))); // NOI18N
        mnuthoat.setText("Thoát");
        mnuthoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuthoatActionPerformed(evt);
            }
        });
        jMenu1.add(mnuthoat);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Sản Phẩm");
        jMenu2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        mnusanpham.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/List.png"))); // NOI18N
        mnusanpham.setText("Sản phẩm");
        jMenu2.add(mnusanpham);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Loại Sản Phẩm");
        jMenu3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        mnuloaisp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Documents.png"))); // NOI18N
        mnuloaisp.setText("Loại sản phẩm");
        jMenu3.add(mnuloaisp);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Hóa Đơn");
        jMenu4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        mnuhoadon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Price list.png"))); // NOI18N
        mnuhoadon.setText("Hóa đơn");
        jMenu4.add(mnuhoadon);

        jMenuBar1.add(jMenu4);

        jMenu5.setText("Thống Kê");
        jMenu5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        mnuthongke.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Bar chart.png"))); // NOI18N
        mnuthongke.setText("Thống kê");
        jMenu5.add(mnuthongke);

        jMenuBar1.add(jMenu5);

        jMenu6.setText("Admin");
        jMenu6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        manuadmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Unknown person.png"))); // NOI18N
        manuadmin.setText("Admin");
        manuadmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manuadminActionPerformed(evt);
            }
        });
        jMenu6.add(manuadmin);
        jMenu6.add(jSeparator1);
        jMenu6.add(jSeparator2);

        mnuNhanVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Users.png"))); // NOI18N
        mnuNhanVien.setText("Nhân Viên");
        mnuNhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuNhanVienActionPerformed(evt);
            }
        });
        jMenu6.add(mnuNhanVien);
        jMenu6.add(jSeparator3);

        jMenuItem1.setIcon(new javax.swing.ImageIcon("E:\\Download\\account.png")); // NOI18N
        jMenuItem1.setText("Thông Tin Tài Khoản");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem1);

        jMenuBar1.add(jMenu6);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 820, Short.MAX_VALUE)
            .addComponent(Desktop)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Desktop))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void mnuthoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuthoatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnuthoatActionPerformed

    private void cmdsanphamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdsanphamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmdsanphamActionPerformed

    private void cmdadminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdadminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmdadminActionPerformed

    private void btdanxuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btdanxuatActionPerformed
        int kq=JOptionPane.showConfirmDialog(this,"Bạn có muốn đăng xuất không","Thông Báo",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        if(kq==JOptionPane.YES_NO_OPTION){
            dispose();
            frmLogin frm =new frmLogin();
            frm.setVisible(true);
        }
    }//GEN-LAST:event_btdanxuatActionPerformed

    private void btadminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btadminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btadminActionPerformed

    private void btthoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btthoatActionPerformed
        dispose();
    }//GEN-LAST:event_btthoatActionPerformed

    private void btsanphamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btsanphamActionPerformed
       
    }//GEN-LAST:event_btsanphamActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        frmtaikhoan  frm= new frmtaikhoan();
        Desktop.add(frm);

        frm.setLocation((Desktop.getWidth()-frm.getWidth())/2, (Desktop.getHeight()-frm.getHeight())/2);
        frm.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void mnuNhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuNhanVienActionPerformed
        mdiNhanVien  frm= new mdiNhanVien();
        Desktop.add(frm);

        frm.setLocation((Desktop.getWidth()-frm.getWidth())/2, (Desktop.getHeight()-frm.getHeight())/2);
        frm.setVisible(true);

    }//GEN-LAST:event_mnuNhanVienActionPerformed

    private void manuadminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manuadminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_manuadminActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Formmain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Formmain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Formmain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Formmain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Formmain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane Desktop;
    private javax.swing.JButton btadmin;
    private javax.swing.JButton btdanxuat;
    private javax.swing.JButton bthoadon;
    private javax.swing.JButton btloaisp;
    private javax.swing.JButton btsanpham;
    private javax.swing.JButton btthoat;
    private javax.swing.JButton btthongke;
    private javax.swing.JButton cmdadmin;
    private javax.swing.JButton cmdhoadon;
    private javax.swing.JButton cmdloaisp;
    private javax.swing.JButton cmdsanpham;
    private javax.swing.JButton cmdthongke;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JMenuItem manuadmin;
    private javax.swing.JMenuItem mnuNhanVien;
    private javax.swing.JMenuItem mnuhoadon;
    private javax.swing.JMenuItem mnuloaisp;
    private javax.swing.JMenuItem mnusanpham;
    private javax.swing.JMenuItem mnuthoat;
    private javax.swing.JMenuItem mnuthongke;
    private javax.swing.JMenuItem mnutrangchu;
    // End of variables declaration//GEN-END:variables

}