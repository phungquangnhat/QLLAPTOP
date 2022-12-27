
package Model;


public class tbNhanVien {
    public String MaNv,TenNv,NgaySinh,Sdt,DiaChi;
    public boolean GioiTinh;
    public tbNhanVien() {
    }

    public tbNhanVien(String MaNv, String TenNv, String NgaySinh, boolean GioiTinh, String Sdt, String DiaChi) {
        this.MaNv = MaNv;
        this.TenNv = TenNv;
        this.NgaySinh = NgaySinh;
        this.GioiTinh = GioiTinh;
        this.Sdt = Sdt;
        this.DiaChi = DiaChi;
    }

    public String getMaNv() {
        return MaNv;
    }

    public void setMaNv(String MaNv) {
        this.MaNv = MaNv;
    }

    public String getTenNv() {
        return TenNv;
    }

    public void setTenNv(String TenNv) {
        this.TenNv = TenNv;
    }

    public String getNgaySinh() {
        return NgaySinh;
    }

    public void setNgaySinh(String NgaySinh) {
        this.NgaySinh = NgaySinh;
    }

    public boolean sGioiTinh() {
        return GioiTinh;
    }
    
    
    public String getGioitinh(){
        if (GioiTinh==true)
            return "Nam";
        else
            return "Nữ";
}
    public void setGioiTinh(boolean GioiTinh){
       this.GioiTinh=GioiTinh;
}
    public String getSdt() {
        return Sdt;
    }

    public void setSdt(String Sdt) {
        this.Sdt = Sdt;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

   
    
    
    
}
