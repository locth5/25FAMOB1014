/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab4;

/**
 *
 * @author Admin
 */
public class SanPham3 {
       private String tenSp;
    private double donGia;
    private double giamGia;

    // Hàm tạo có 3 tham số
    public SanPham3(String tenSp, double donGia, double giamGia) {
        this.tenSp = tenSp;
        this.donGia = donGia;
        this.giamGia = giamGia;
    }

    // Hàm tạo có 2 tham số (ngầm hiểu không giảm giá)
    public SanPham3(String tenSp, double donGia) {
        this(tenSp, donGia, 0);
    }

    // Getter và Setter cho tenSp
    public String getTenSp() {
        return this.tenSp;
    }

    public void setTenSp(String tenSp) {
        this.tenSp = tenSp;
    }

    // Getter và Setter cho donGia
    public double getDonGia() {
        return this.donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    // Getter và Setter cho giamGia
    public double getGiamGia() {
        return this.giamGia;
    }

    public void setGiamGia(double giamGia) {
        this.giamGia = giamGia;
    }

    // Phương thức tính thuế nhập khẩu (private)
    private double getThueNhapKhau() {
        return this.donGia * 0.1;
    }

    // Phương thức xuất (public)
     public void xuat() {
        System.out.println("ten san pham: " + this.tenSp);
        System.out.println("Don gia: " + this.donGia);
        System.out.println("Giam gia: " + this.giamGia);
        System.out.println("Thue nhap khau: " + this.getThueNhapKhau());
        System.out.println("---------------------------");
    }
}
