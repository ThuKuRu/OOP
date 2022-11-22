
public class NhanVien {
	public static double LUONG_MAX = 20000000;

    private String tenNhanVien;

    private double luongCoBan;

    private double heSoLuong;

    private double luong;

    public String getTenNhanVien() {
        return tenNhanVien;
    }

    public void setTenNhanVien(String tenNhanVien) {
        this.tenNhanVien = tenNhanVien;
    }

    public double getLuongCoBan() {
        return luongCoBan;
    }

    public void setLuongCoBan(double luongCoBan) {
        this.luongCoBan = luongCoBan;
    }

    public double getHeSoLuong() {
        return heSoLuong;
    }

    public void setHeSoLuong(double heSoLuong) {
        this.heSoLuong = heSoLuong;
    }

    public boolean tangLuong(double tang){
        if((luong + tang) > LUONG_MAX){
            System.out.println(" Không thể tăng lương");
            return false;
        }else{
            System.out.println(" Luong sau khi tăng: " + luong + tang);
            return true;
        }
    }

    public double tinhLuong(){
        luong = luongCoBan * heSoLuong;
        return luong;
    }
    public void inTTin(){
        System.out.println("Thông tin nhân viên: " + "NhanVien{" +
                "tenNhanVien='" + tenNhanVien + '\'' +
                ", luongCoBan=" + luongCoBan +
                ", heSoLuong=" + heSoLuong +
                '}');
    }


}
