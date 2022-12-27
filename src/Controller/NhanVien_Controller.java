
package Controller;

import Model.tbNhanVien;
import static QLLapTop.QLLAPTOP.*;
import java.io.IOException;
import java.sql.*;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class NhanVien_Controller {
    
    public static Connection conn;
    public static Statement state;
    public static PreparedStatement pstate;
    public static ResultSet rs;
    public static String sql;
    
    public static List<tbNhanVien> LayNguon(String tukhoa) {
        List<tbNhanVien> arr =new ArrayList<>();
        conn =null;
        state=null;
        
        try {
            conn=DriverManager.getConnection(dbURL);
           
            sql="select * from nhanvien ";
             if(tukhoa.equals("")==false){
                 sql = sql + " Where MaNV like N'%" + tukhoa + "%' or TenNv like N'% " + tukhoa + "%'";
            }
             sql = sql + " order by MaNv";
            state =conn.createStatement();
            rs=state.executeQuery(sql);
            while (rs.next()){
              // tbNhanVien nv= new tbNhanVien();
               tbNhanVien nv=new tbNhanVien();
               nv.setMaNv(rs.getString("MaNv"));
               nv.setTenNv(rs.getString("TenNv"));
               nv.setNgaySinh(rs.getString("NgaySinh"));
               nv.setGioiTinh(rs.getBoolean("GioiTinh"));
               nv.setSdt(rs.getString("Sdt"));
               nv.setDiaChi(rs.getString("DiaChi"));
               
               arr.add(nv);
            }
            state.close();conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(NhanVien_Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            if (conn !=null)
            try {
                conn.close();
            } catch(SQLException ex){
                        Logger.getLogger(NhanVien_Controller.class.getName()).log(Level.SEVERE, null, ex);

            }
            if (state !=null)
            try {
                state.close();
            } catch (SQLException ex) {
                        Logger.getLogger(NhanVien_Controller.class.getName()).log(Level.SEVERE, null, ex);

            }
        }
        return arr;
    }

    //2. insert: them tai khoan
    public static void ThemMoi(tbNhanVien nv){
        conn=null;
        pstate =null;
        try {
            conn=DriverManager.getConnection(dbURL);
            sql="Insert Into nhanvien(MaNv,TenNv,NgaySinh,GioiTinh,Sdt,DiaChi) Values(?,?,?,?,?,?)";
            pstate= conn.prepareStatement(sql);
            pstate.setString(1, nv.getMaNv());
            pstate.setString(2, nv.getTenNv());
            pstate.setString(3, nv.getNgaySinh());
            pstate.setBoolean(4, nv.sGioiTinh());
            pstate.setString(5, nv.getSdt());
            pstate.setString(6, nv.getDiaChi());
            
            
            pstate.execute();
            pstate.close();conn.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(NhanVien_Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
        if(pstate!=null)
            try {
                pstate.close();
        } catch (SQLException ex) {
            Logger.getLogger(NhanVien_Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(conn!=null)
            try {
                conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(NhanVien_Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
        }

}
    //3. update: cap nhat tai khoan
    public static void CapNhap(tbNhanVien nv,String macu){
        conn=null;
        pstate=null;
        try {
            conn=DriverManager.getConnection(dbURL);
            sql="Update nhanvien Set MaNv=?, TenNv=?, NgaySinh=?, GioiTinh=?, Sdt=?, DiaChi=? where MaNv=?";
            pstate= conn.prepareStatement(sql);
            pstate.setString(1, nv.getMaNv());
            pstate.setString(2, nv.getTenNv());
            pstate.setString(3, nv.getNgaySinh());
            pstate.setBoolean(4, nv.sGioiTinh());
            pstate.setString(5, nv.getSdt());
            pstate.setString(6, nv.getDiaChi());
            
            pstate.setString(7, macu);
            pstate.execute();
            pstate.close();conn.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(NhanVien_Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
        if(pstate!=null)
            try {
                pstate.close();
        } catch (SQLException ex) {
            Logger.getLogger(NhanVien_Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(conn!=null)
            try {
                conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(NhanVien_Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    }
    //4. delete: xoa tai khoan
    public static void XoaBo(String macu){
        conn=null;
        pstate=null;
        try {
            conn=DriverManager.getConnection(dbURL);
            sql="Delete From nhanvien where MaNv=?";
            pstate= conn.prepareStatement(sql);
            pstate.setString(1, macu);
            
            pstate.execute();
            pstate.close();conn.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(NhanVien_Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
        if(pstate!=null)
            try {
                pstate.close();
        } catch (SQLException ex) {
            Logger.getLogger(NhanVien_Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(conn!=null)
            try {
                conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(NhanVien_Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
        }

}
    
public static boolean KiemTraTrungMa(String manhap,boolean ktThem,String macu){
   boolean kq=false;
     conn=null;
     
     state=null;
        try {
            conn=DriverManager.getConnection(dbURL);
            if(ktThem==true)
                sql="Select MaNv From nhanvien Where MaNv='" + manhap +"'";
            else
                sql="Select MaNv From nhanvien Where MaNv='" + manhap +"' and MaNv<> '" + macu +"'";
            state = conn.createStatement();
            
            rs =  state.executeQuery(sql);
            if(rs.next())
                kq=true;
            state.close();conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(NhanVien_Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
     return kq;
     }
    
}
