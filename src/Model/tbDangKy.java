/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;


public class tbDangKy {
    public String TK,hoten,email,MK;
    public tbDangKy(){
    }

    public tbDangKy(String TK, String hoten, String email, String MK) {
        this.TK = TK;
        this.hoten = hoten;
        this.email = email;
        this.MK = MK;
        
    }

    

    public String getTK() {
        return TK;
    }

    public void setTK(String TK) {
        this.TK = TK;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMK() {
        return MK;
    }

    public void setMK(String MK) {
        this.MK = MK;
    }


    
}
