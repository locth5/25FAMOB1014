/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package asm;

/**
 *
 * @author Admin
 */
public class NhanVienTiepThi extends NhanVien {
    private double doanhSo;
    private double hueHong;

    public NhanVienTiepThi(String maNV, String hoTen, double luong, double doanhSo, double hueHong) {
        super(maNV, hoTen, luong);
        this.doanhSo = doanhSo;
        this.hueHong = hueHong;
    }

    @Override
    public double getThuNhap() {
        return luong + doanhSo * hueHong;
    }
}
