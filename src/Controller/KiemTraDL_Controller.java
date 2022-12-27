/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;


import static Controller.DangKy_Controller.conn;
import static Controller.DangKy_Controller.rs;
import static Controller.DangKy_Controller.state;
import static QLLapTop.QLLAPTOP.dbURL;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class KiemTraDL_Controller {

   private static String sql;
    public static boolean KiemTraTrungMa(String TenTruong, String TenBang,String manhap, boolean ktThem, String macu){
       boolean kq = false;
       conn=null;
        state=null;
        
        try {
            conn=DriverManager.getConnection(dbURL);
            if(ktThem ==true)
            sql="Select "+ TenTruong +" from "+ TenBang +" Where  "+ TenTruong +" = '"+ manhap+"'";
            else
                sql="Select "+ TenTruong +" from "+ TenBang +" Where "+ 
                        TenTruong +" = '"+ manhap + "'and" + TenTruong +" <>'" + macu + "'";
            state = conn.createStatement();
            rs=state.executeQuery(sql);
            if(rs.next())
                kq =true;
            conn.close();state.close();
            
            
        } catch (SQLException ex) {
            Logger.getLogger(KiemTraDL_Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return kq;
}

    
}
  

