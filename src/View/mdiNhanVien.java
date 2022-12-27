/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.KiemTraDL_Controller;
import Controller.NhanVien_Controller;
import Model.tbNhanVien;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;


public class mdiNhanVien extends javax.swing.JInternalFrame {

    DefaultTableModel tbldanhsach;
    List<tbNhanVien>arr = new ArrayList<>();
    String MaNv,TenNv,NgaySinh,sGioiTinh,Sdt,DiaChi;
    String macu,tukhoa; 
    boolean GioiTinh;
    boolean ktThem;
    SimpleDateFormat sDF =new SimpleDateFormat("yyyy-MM-dd");
   // SimpleDateFormat sDF1 =new SimpleDateFormat("dd/MM/yyyy");
    Date date ;
    //private String tukhoa;
    //public static Date date;
    public mdiNhanVien() {
        initComponents();
        
        tbldanhsach=(DefaultTableModel) dgDanhSach.getModel();
        LayNguon();
        KhoaMo(true);
        DesignTable();
    }

    public void KhoaMo(boolean b){
        cmdThem.setEnabled(b);
        cmdSua.setEnabled(b);
        cmdXoa.setEnabled(b);
        cmdKetThuc.setEnabled(b);
        
        cmdGhi.setEnabled(!b);
        cmdKhong.setEnabled(!b);
        txtMaNV.setEditable(!b);
        txtTenNv.setEditable(!b);
        dtpNgaySinh.setEnabled(!b);
        cboGioiTinh.setEditable(!b);
        txtSDT.setEditable(!b);
        txtDiaChi.setEditable(!b);
        
                  
        dgDanhSach.setEnabled(b);
    }
    public void XoaTrang(){
        txtMaNV.setText(""); 
        txtTenNv.setText("");
        //txtNgaySinh.setText("");
        //cboGioiTinh.set("");
        txtSDT.setText("");
        txtDiaChi.setText("");
        
    }
    public void DesignTable(){
        dgDanhSach.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        dgDanhSach.getColumnModel().getColumn(0).setPreferredWidth(50);
        dgDanhSach.getColumnModel().getColumn(1).setPreferredWidth(140);
        dgDanhSach.getColumnModel().getColumn(2).setPreferredWidth(93);
        dgDanhSach.getColumnModel().getColumn(3).setPreferredWidth(59);
        dgDanhSach.getColumnModel().getColumn(4).setPreferredWidth(95);
        dgDanhSach.getColumnModel().getColumn(5).setPreferredWidth(100);
        
        
    }
public void LayNguon(){
    tukhoa= txtTuKhoa.getText();
    arr=NhanVien_Controller.LayNguon(tukhoa);
    tbldanhsach.setRowCount(0);
    arr.forEach(p->{
    tbldanhsach.addRow(new Object[]{
        p.getMaNv(),p.getTenNv(),p.getNgaySinh(),p.getGioitinh(),p.getSdt(),p.getDiaChi()
    });
    });
   
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cmdThem = new javax.swing.JButton();
        cmdSua = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        cmdXoa = new javax.swing.JButton();
        cmdGhi = new javax.swing.JButton();
        cmdKhong = new javax.swing.JButton();
        txtMaNV = new javax.swing.JTextField();
        txtTenNv = new javax.swing.JTextField();
        cmdKetThuc = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        cboGioiTinh = new javax.swing.JComboBox<>();
        dtpNgaySinh = new com.toedter.calendar.JDateChooser();
        txtSDT = new javax.swing.JTextField();
        txtDiaChi = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        dgDanhSach = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtTuKhoa = new javax.swing.JTextField();
        cmdTimKhoa = new javax.swing.JButton();

        setTitle("QUẢN LÝ DANH MỤC NHÂN VIÊN");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Mã Nhân Viên:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Tên Nhân Viên:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Ngày Sinh:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Giới Tính:");

        cmdThem.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cmdThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Add.png"))); // NOI18N
        cmdThem.setText("Thêm");
        cmdThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdThemActionPerformed(evt);
            }
        });

        cmdSua.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cmdSua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Notes.png"))); // NOI18N
        cmdSua.setText("Sửa");
        cmdSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdSuaActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("SĐT:");

        cmdXoa.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cmdXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Delete.png"))); // NOI18N
        cmdXoa.setText("Xóa");
        cmdXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdXoaActionPerformed(evt);
            }
        });

        cmdGhi.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cmdGhi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Edit.png"))); // NOI18N
        cmdGhi.setText("Ghi");
        cmdGhi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdGhiActionPerformed(evt);
            }
        });

        cmdKhong.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cmdKhong.setIcon(new javax.swing.ImageIcon("E:\\Download\\85308_edit_not_validated_icon.png")); // NOI18N
        cmdKhong.setText("Không");
        cmdKhong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdKhongActionPerformed(evt);
            }
        });

        cmdKetThuc.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cmdKetThuc.setIcon(new javax.swing.ImageIcon("C:\\Users\\Thao\\Pictures\\Camera Roll\\18861_end_player_icon.png")); // NOI18N
        cmdKetThuc.setText("Kết Thúc");
        cmdKetThuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdKetThucActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Địa Chỉ:");

        cboGioiTinh.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cboGioiTinh.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nam", "Nữ" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cmdGhi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmdThem, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmdSua, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmdKhong, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(79, 79, 79)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cmdXoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmdKetThuc, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMaNV)
                            .addComponent(txtTenNv)
                            .addComponent(cboGioiTinh, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtSDT)
                            .addComponent(txtDiaChi)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(dtpNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTenNv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dtpNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboGioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmdThem, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmdSua, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmdXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmdGhi, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmdKhong, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmdKetThuc, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        dgDanhSach.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Mã Nhân Viên", "Tên Nhân Viên", "Ngày Sinh", "Giới Tính", "SĐT", "Địa Chỉ"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
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

        jLabel1.setBackground(new java.awt.Color(255, 153, 51));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 153, 51));
        jLabel1.setText("     Thông Tin Chi Tiết");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        jLabel8.setText("Thông tin tìm kiếm:");

        txtTuKhoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTuKhoaActionPerformed(evt);
            }
        });

        cmdTimKhoa.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        cmdTimKhoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Search.png"))); // NOI18N
        cmdTimKhoa.setText("Tìm Kiếm");
        cmdTimKhoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdTimKhoaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addGap(26, 26, 26)
                .addComponent(txtTuKhoa, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cmdTimKhoa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(88, 88, 88))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTuKhoa, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmdTimKhoa)
                            .addComponent(jLabel8))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 439, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dgDanhSachMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dgDanhSachMouseClicked
        
        int id = dgDanhSach.getSelectedRow();
        TableModel md = dgDanhSach.getModel();
        MaNv = md.getValueAt(id, 0).toString();
        TenNv= md.getValueAt(id, 1).toString();
        NgaySinh = md.getValueAt(id, 2).toString();
        sGioiTinh = md.getValueAt(id, 3).toString();
        Sdt = md.getValueAt(id, 4).toString();
        DiaChi= md.getValueAt(id, 5).toString();
        
        txtMaNV.setText(MaNv);
        txtTenNv.setText(TenNv);
        try {
            date = sDF.parse(NgaySinh);
            dtpNgaySinh.setDate(date);
        } catch (ParseException ex) {
            Logger.getLogger(mdiNhanVien.class.getName()).log(Level.SEVERE, null, ex);
        }
        cboGioiTinh.setSelectedIndex(sGioiTinh.equalsIgnoreCase("Nam")? 0 : 1);
        txtSDT.setText(Sdt);
        txtDiaChi.setText(DiaChi);
        
        
    }//GEN-LAST:event_dgDanhSachMouseClicked

    private void cmdThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdThemActionPerformed
        XoaTrang();
        ktThem=true ;

        KhoaMo(false);
        txtMaNV.requestFocus();
    }//GEN-LAST:event_cmdThemActionPerformed

    private void cmdSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdSuaActionPerformed
        if(txtMaNV.getText().length()<=0)
         return ;
       macu=txtMaNV.getText();
       ktThem=false;
       KhoaMo(false);
       
       txtMaNV.requestFocus(); 
    }//GEN-LAST:event_cmdSuaActionPerformed

    private void cmdXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdXoaActionPerformed
        if(txtMaNV.getText().length()<0){
        return;}
        int kq=JOptionPane.showConfirmDialog(this, "Bạn có muốn xóa không?","Thông báo",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        if( kq==JOptionPane.YES_OPTION){
            macu=txtMaNV.getText();
            NhanVien_Controller.XoaBo(macu);
            XoaTrang();
            LayNguon();
        }
    }//GEN-LAST:event_cmdXoaActionPerformed

    private void cmdGhiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdGhiActionPerformed
        if(txtMaNV.getText().length()<=0)  {
            JOptionPane.showMessageDialog(this, "Bạn chưa nhập mã nhân viên?","Thông báo",JOptionPane.WARNING_MESSAGE);
            txtMaNV.requestFocus();
            return;}
        if(txtTenNv.getText().length()<=0)  {
            JOptionPane.showMessageDialog(this, "Bạn chưa nhập tên nhân viên","Thông báo",JOptionPane.WARNING_MESSAGE);
            txtTenNv.requestFocus();
            return;}

       
        if(KiemTraDL_Controller.KiemTraTrungMa("MaNv","nhanvien",txtMaNV.getText(), ktThem, macu)==true){
            JOptionPane.showMessageDialog(this, "Bạn nhập trùng mã nhân viên đã có! ","Thông báo",JOptionPane.ERROR_MESSAGE);
            txtMaNV.requestFocus();
            return;
        }
        MaNv=txtMaNV.getText();
        TenNv=txtTenNv.getText();
        NgaySinh=sDF.format(dtpNgaySinh.getDate());
        GioiTinh=cboGioiTinh.getSelectedIndex()==0 ? true : false;
        Sdt=txtSDT.getText();
        DiaChi=txtDiaChi.getText();
        
       
        tbNhanVien cn=new tbNhanVien (MaNv,TenNv,NgaySinh,GioiTinh,Sdt,DiaChi);
        if(ktThem==true)
        NhanVien_Controller.ThemMoi(cn);
        else
        NhanVien_Controller.CapNhap(cn, macu);
        LayNguon();
        KhoaMo(true);
    }//GEN-LAST:event_cmdGhiActionPerformed

    private void cmdKhongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdKhongActionPerformed
        XoaTrang();
        KhoaMo(true);
    }//GEN-LAST:event_cmdKhongActionPerformed

    private void cmdKetThucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdKetThucActionPerformed
        dispose();
    }//GEN-LAST:event_cmdKetThucActionPerformed

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

    private void txtTuKhoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTuKhoaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTuKhoaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cboGioiTinh;
    private javax.swing.JButton cmdGhi;
    private javax.swing.JButton cmdKetThuc;
    private javax.swing.JButton cmdKhong;
    private javax.swing.JButton cmdSua;
    private javax.swing.JButton cmdThem;
    private javax.swing.JButton cmdTimKhoa;
    private javax.swing.JButton cmdXoa;
    private javax.swing.JTable dgDanhSach;
    private com.toedter.calendar.JDateChooser dtpNgaySinh;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtDiaChi;
    private javax.swing.JTextField txtMaNV;
    private javax.swing.JTextField txtSDT;
    private javax.swing.JTextField txtTenNv;
    private javax.swing.JTextField txtTuKhoa;
    // End of variables declaration//GEN-END:variables

    
}
