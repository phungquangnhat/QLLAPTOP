
package View;

import Controller.DangKy_Controller;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import Model.tbDangKy;
import Controller.KiemTraDL_Controller;
import javax.swing.JTable;
public class frmtaikhoan extends javax.swing.JInternalFrame {
    DefaultTableModel tbldanhsach;
    List<tbDangKy> arr = new ArrayList<>();
    String TK,hoten,email,MK;
    boolean ktThem;
    String macu,tukhoa;//dung de luu gia tri truong khoa(tendn)
    public frmtaikhoan() {
        initComponents();
        tbldanhsach=(DefaultTableModel) dgDanhSach.getModel();
        khoamo(true);    
        LayNguon();
        DesignTable();
        
    }
public void xoatrang(){
    txttdn.setText("");
    txtht.setText("");
    txtemail.setText("");
    txtmk.setText("");
}
public void khoamo(boolean b){
    btthem.setEnabled(b);
    btsua.setEnabled(b);
    btxoa.setEnabled(b);
    btkt.setEnabled(b);
    
    btghi.setEnabled(!b);
    btkhong.setEnabled(!b);
    txttdn.setEditable(!b);
    txtht.setEditable(!b);
    txtemail.setEditable(!b);
    txtmk.setEditable(!b);
    
    dgDanhSach.setEnabled(b);
}
public void DesignTable(){
        dgDanhSach.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        dgDanhSach.getColumnModel().getColumn(0).setPreferredWidth(180);
        dgDanhSach.getColumnModel().getColumn(1).setPreferredWidth(200);
        dgDanhSach.getColumnModel().getColumn(2).setPreferredWidth(206);
        dgDanhSach.getColumnModel().getColumn(3).setPreferredWidth(170);
    }
  public void LayNguon() {
      tukhoa= txtTuKhoa.getText();
      arr = DangKy_Controller.LayNguon(tukhoa);
      tbldanhsach.setRowCount(0);//xóa trắng danh sách
      arr.forEach(p->{
        tbldanhsach.addRow(new Object[]{
            p.getTK(), p.getHoten(),p.getEmail(),p.getMK()
      });
      });
     
  }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txttdn = new javax.swing.JTextField();
        txtht = new javax.swing.JTextField();
        btthem = new javax.swing.JButton();
        btsua = new javax.swing.JButton();
        btxoa = new javax.swing.JButton();
        btghi = new javax.swing.JButton();
        txtmk = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        txtemail = new javax.swing.JTextField();
        btkhong = new javax.swing.JButton();
        btkt = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtTuKhoa = new javax.swing.JTextField();
        cmdTimKhoa = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        dgDanhSach = new javax.swing.JTable();

        setClosable(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thông Tin Chi Tiết", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 24), new java.awt.Color(255, 153, 0))); // NOI18N
        jPanel1.setToolTipText("Thông tin chi tiết");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Tên đăng nhập:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Họ và tên:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Mật khẩu:");

        btthem.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btthem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Add.png"))); // NOI18N
        btthem.setText("Thêm");
        btthem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btthemActionPerformed(evt);
            }
        });

        btsua.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btsua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Notes.png"))); // NOI18N
        btsua.setText("Sửa");
        btsua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btsuaActionPerformed(evt);
            }
        });

        btxoa.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btxoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Delete.png"))); // NOI18N
        btxoa.setText("Xóa");
        btxoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btxoaActionPerformed(evt);
            }
        });

        btghi.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btghi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Edit.png"))); // NOI18N
        btghi.setText("Ghi");
        btghi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btghiActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Email:");

        btkhong.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btkhong.setIcon(new javax.swing.ImageIcon("E:\\Download\\85308_edit_not_validated_icon.png")); // NOI18N
        btkhong.setText("Không");
        btkhong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btkhongActionPerformed(evt);
            }
        });

        btkt.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btkt.setIcon(new javax.swing.ImageIcon("C:\\Users\\Thao\\Pictures\\Camera Roll\\18861_end_player_icon.png")); // NOI18N
        btkt.setText("Kết Thúc");
        btkt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btktActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setText("Thông tin tìm kiếm:");

        cmdTimKhoa.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        cmdTimKhoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Search.png"))); // NOI18N
        cmdTimKhoa.setText("Tìm Kiếm");
        cmdTimKhoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdTimKhoaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtemail, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 421, Short.MAX_VALUE)
                            .addComponent(txtmk)
                            .addComponent(txttdn, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtht))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 53, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btghi, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btsua, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btthem, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btxoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btkhong, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(26, 26, 26)
                        .addComponent(txtTuKhoa, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cmdTimKhoa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btkt, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txttdn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btthem, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(btsua, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btxoa, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btghi, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btkhong, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btkt, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(43, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtht, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtmk, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtTuKhoa, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmdTimKhoa))
                        .addGap(24, 24, 24))))
        );

        dgDanhSach.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Tên Đăng Nhập", "Họ Tên", "Email", "Mật Khẩu"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, false, true
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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btghiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btghiActionPerformed
        if(txttdn.getText().length()<=0){
            JOptionPane.showMessageDialog(this,"Bạn chưa nhập tên dăng nhập"," Thông báo", JOptionPane.ERROR_MESSAGE);
            txttdn.requestFocus();
            return;
        }
        
        if(txtht.getText().length()<=0){
            JOptionPane.showMessageDialog(this,"Bạn chưa nhập họ tên"," Thông báo", JOptionPane.ERROR_MESSAGE);
            txtht.requestFocus();
            return;
        }
        if(txtemail.getText().length()<=0){
            JOptionPane.showMessageDialog(this,"Bạn chưa nhập email"," Thông báo", JOptionPane.ERROR_MESSAGE);
            txtemail.requestFocus();
            return;
        }
        if(txtmk.getText().length()<=0){
            JOptionPane.showMessageDialog(this,"Bạn chưa nhập mật khẩu"," Thông báo", JOptionPane.ERROR_MESSAGE);
            txtmk.requestFocus();
            return;
        }
        
        if(KiemTraDL_Controller.KiemTraTrungMa("TK", "login", txttdn.getText(), ktThem, macu)==true){
            JOptionPane.showMessageDialog(this,"Tên đăng nhập đã tồn tại"," Thông báo", JOptionPane.ERROR_MESSAGE);
            txttdn.requestFocus();
            return;
        }
        TK = txttdn.getText();
        hoten = txtht.getText();
        email = txtemail.getText();
        MK = txtmk.getText();
        tbDangKy dk=new tbDangKy(TK, hoten, email, MK);
        if(ktThem==true)
            DangKy_Controller.ThemMoi(dk);
        else
           
            DangKy_Controller.CapNhap(dk, macu);
        
            LayNguon();
        
            khoamo(true);
    }//GEN-LAST:event_btghiActionPerformed

    private void btthemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btthemActionPerformed
        xoatrang();
        ktThem=true;
        khoamo(false);
        txttdn.requestFocus();
    }//GEN-LAST:event_btthemActionPerformed

    private void btsuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btsuaActionPerformed
        if(txttdn.getText().length()<=0)
            return;
        macu= txttdn.getText();
        ktThem = false;
        khoamo(false);
        txttdn.requestFocus();
    }//GEN-LAST:event_btsuaActionPerformed

    private void btkhongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btkhongActionPerformed
        xoatrang();
        khoamo(true);
    }//GEN-LAST:event_btkhongActionPerformed

    private void btktActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btktActionPerformed
        dispose();
    }//GEN-LAST:event_btktActionPerformed

    private void dgDanhSachMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dgDanhSachMouseClicked
        int id = dgDanhSach.getSelectedRow();
        TableModel md = dgDanhSach.getModel();
        TK = md.getValueAt(id, 0).toString();
        hoten= md.getValueAt(id, 1).toString();
        email = md.getValueAt(id, 2).toString();
        MK = md.getValueAt(id, 3).toString();
        
        txttdn.setText(TK);
        txtht.setText(hoten);
        txtemail.setText(email);
        txtmk.setText(MK);
        
    }//GEN-LAST:event_dgDanhSachMouseClicked

    private void btxoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btxoaActionPerformed
       if(txttdn.getText().length()<0){
          return;}
      int kq=JOptionPane.showConfirmDialog(this, "Bạn có muốn xóa ["+txttdn.getText()+"] không?","Thông báo",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        if( kq==JOptionPane.YES_OPTION){
            macu=txttdn.getText();
            DangKy_Controller.XoaBo(macu);
            xoatrang();
            LayNguon();
        }
    }//GEN-LAST:event_btxoaActionPerformed

    private void cmdTimKhoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdTimKhoaActionPerformed
        if(txtTuKhoa.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Bạn chưa nhập thông tin","Thông báo",JOptionPane.WARNING_MESSAGE);
            txtTuKhoa.requestFocus();
            LayNguon();
            return;
        }
        else{
            tukhoa = txtTuKhoa.getText().trim();
        }
        LayNguon();
        if(dgDanhSach.getRowCount()==0)
        {
            JOptionPane.showMessageDialog(this, "Không tìm thấy thông tin","Thông báo",JOptionPane.ERROR_MESSAGE);
            txtTuKhoa.requestFocus();
            txtTuKhoa.setText("");
            LayNguon();
            return;
        }
        //Laynguon();
    }//GEN-LAST:event_cmdTimKhoaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btghi;
    private javax.swing.JButton btkhong;
    private javax.swing.JButton btkt;
    private javax.swing.JButton btsua;
    private javax.swing.JButton btthem;
    private javax.swing.JButton btxoa;
    private javax.swing.JButton cmdTimKhoa;
    private javax.swing.JTable dgDanhSach;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtTuKhoa;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtht;
    private javax.swing.JPasswordField txtmk;
    private javax.swing.JTextField txttdn;
    // End of variables declaration//GEN-END:variables
}
