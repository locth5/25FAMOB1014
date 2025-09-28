/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package asm;

/**
 *
 * @author Admin
 */
public abstract  class NhanVien {
    protected String maNV;
    protected String hoTen;
    protected double luong;

    public NhanVien(String maNV, String hoTen, double luong) {
        this.maNV = maNV;
        this.hoTen = hoTen;
        this.luong = luong;
    }

    public String getMaNV() { return maNV; }
    public String getHoTen() { return hoTen; }
    public double getLuong() { return luong; }

    public void setHoTen(String hoTen) { this.hoTen = hoTen; }
    public void setLuong(double luong) { this.luong = luong; }

    // Mỗi loại NV sẽ tự tính thu nhập
    public abstract double getThuNhap();

    // Tính thuế theo lũy tiến
    public double getThueThuNhap() {
        double tn = getThuNhap();
        if (tn < 9000000) return 0;
        else if (tn <= 15000000) return tn * 0.1;
        else return tn * 0.12;
    }

    public void xuat() {
        System.out.printf("Mã: %s | Họ tên: %s | Lương: %.0f | Thu nhập: %.0f | Thuế: %.0f\n",
                maNV, hoTen, luong, getThuNhap(), getThueThuNhap());
    }
}
