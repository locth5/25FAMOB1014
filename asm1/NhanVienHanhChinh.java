package asm1;

public class NhanVienHanhChinh extends NhanVien {

    public NhanVienHanhChinh(String ma, String hoTen, double luong) {
        super(ma, hoTen, luong);
    }

    @Override
    public double getThuNhap() {
        return luong;
    }
}
