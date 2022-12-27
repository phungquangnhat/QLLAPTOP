/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import static Controller.NhanVien_Controller.sql;
import Model.tbDangKy;
import static QLLapTop.QLLAPTOP.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class DangKy_Controller {
    
    public static Connection conn;
    public static Statement state;
    public static PreparedStatement pstate;
    public static ResultSet rs;
    public static String sql;
    
    public static List<tbDangKy> LayNguon(String tukhoa) {
        List<tbDangKy> arr =new ArrayList<>();
        conn =null;
        state=null;
        
        try {
            conn=DriverManager.getConnection(dbURL);
            sql="select * from login ";
            if(tukhoa.equals("")==false){
                 sql = sql + " Where TK like N'%" + tukhoa + "%' or hoten like N'% " + tukhoa + "%'";
            }
             sql = sql + " order by TK";
          
            state =conn.createStatement();
            rs=state.executeQuery(sql);
            while (rs.next()){
              
               tbDangKy dk=new tbDangKy();
               dk.setTK(rs.getString("TK"));
               dk.setHoten(rs.getString("hoten"));
               dk.setEmail(rs.getString("email"));
               dk.setMK(rs.getString("MK"));
               
               
               arr.add(dk);
            }
            state.close();conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(DangKy_Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            if (conn !=null)
            try {
                conn.close();
            } catch(SQLException ex){
                        Logger.getLogger(DangKy_Controller.class.getName()).log(Level.SEVERE, null, ex);

            }
            if (state !=null)
            try {
                state.close();
            } catch (SQLException ex) {
                        Logger.getLogger(DangKy_Controller.class.getName()).log(Level.SEVERE, null, ex);

            }
        }
        return arr;
    }

    //2. insert: them tai khoan
    public static void ThemMoi(tbDangKy dk){
        conn=null;
        pstate =null;
        try {
            conn=DriverManager.getConnection(dbURL);
            sql="Insert Into login(TK,hoten,email,MK) Values(?,?,?,?)";
            pstate= conn.prepareStatement(sql);
            pstate.setString(1, dk.getTK());
            pstate.setString(2, dk.getHoten());
            pstate.setString(3, dk.getEmail());
            
            pstate.setString(4, dk.getMK());
            
            
            
            pstate.execute();
            pstate.close();conn.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(DangKy_Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
        if(pstate!=null)
            try {
                pstate.close();
        } catch (SQLException ex) {
            Logger.getLogger(DangKy_Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(conn!=null)
            try {
                conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(DangKy_Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
        }

}
    //3. update: cap nhat tai khoan
    public static void CapNhap(tbDangKy dk,String macu){
        conn=null;
        pstate=null;
        try {
            conn=DriverManager.getConnection(dbURL);
            sql="Update login Set TK=?, hoten=?, email=?, MK=? where TK=?";
            pstate= conn.prepareStatement(sql);
            pstate.setString(1, dk.getTK());
            pstate.setString(2, dk.getHoten());
            pstate.setString(3, dk.getEmail());       
            pstate.setString(4, dk.getMK());
            
            
            pstate.setString(5, macu);
            pstate.execute();
            pstate.close();conn.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(DangKy_Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
        if(pstate!=null)
            try {
                pstate.close();
        } catch (SQLException ex) {
            Logger.getLogger(DangKy_Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(conn!=null)
            try {
                conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(DangKy_Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    }
    //4. delete: xoa tai khoan
    public static void XoaBo(String macu){
        conn=null;
        pstate=null;
        try {
            conn=DriverManager.getConnection(dbURL);
            sql="Delete From login where TK=?";
            pstate= conn.prepareStatement(sql);
            pstate.setString(1, macu);
            
            pstate.execute();
            pstate.close();conn.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(DangKy_Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
        if(pstate!=null)
            try {
                pstate.close();
        } catch (SQLException ex) {
            Logger.getLogger(DangKy_Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(conn!=null)
            try {
                conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(DangKy_Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
        }

}
}


