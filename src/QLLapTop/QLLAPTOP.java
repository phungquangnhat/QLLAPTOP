
package QLLapTop;

import View.Formmain;
import View.frmLogin;


public class QLLAPTOP {

   public static String dbURL ="jdbc:sqlserver://DESKTOP-A6JLJUI:1433;databaseName=QLLapTop;user=sa;password=160801";
    
    
    public static String UN,PW,FN;
    public static void main(String[] args) {
        frmLogin frm= new frmLogin();
        frm.setVisible(true);
    }
    
}
