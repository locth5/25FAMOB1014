package asm1;

public class NhanVienTiepThi extends NhanVien {
    private double doanhSo;
    private double tiLeHueHong;

    public NhanVienTiepThi(String ma, String hoTen, double luong, double doanhSo, double tiLeHueHong) {
        super(ma, hoTen, luong);
        this.doanhSo = doanhSo;
        this.tiLeHueHong = tiLeHueHong;
    }

    @Override
    public double getThuNhap() {
        return luong + doanhSo * tiLeHueHong;
    }
}
