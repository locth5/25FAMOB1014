package asm1;

public abstract class NhanVien {
    protected String ma;
    protected String hoTen;
    protected double luong;

    public NhanVien(String ma, String hoTen, double luong) {
        this.ma = ma;
        this.hoTen = hoTen;
        this.luong = luong;
    }

    public abstract double getThuNhap();

    public void xuatThongTin() {
        System.out.printf("Mã: %s | Họ tên: %s | Lương cơ bản: %.2f | Thu nhập: %.2f\n",
                ma, hoTen, luong, getThuNhap());
    }
}
