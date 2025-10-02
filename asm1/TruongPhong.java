package asm1;

public class TruongPhong extends NhanVien {
    private double luongTrachNhiem;

    public TruongPhong(String ma, String hoTen, double luong, double luongTrachNhiem) {
        super(ma, hoTen, luong);
        this.luongTrachNhiem = luongTrachNhiem;
    }

    @Override
    public double getThuNhap() {
        return luong + luongTrachNhiem;
    }
}
