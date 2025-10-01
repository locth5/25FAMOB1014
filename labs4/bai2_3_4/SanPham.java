// Lớp SanPham
package bai2_3_4;

import java.util.Scanner;

public class SanPham {
    // 1. Trường dữ liệu private
    private String tenSp;
    private double donGia;
    private double giamGia;

    // 2a. Constructor 3 tham số
    public SanPham(String tenSp, double donGia, double giamGia) {
        this.tenSp = tenSp;
        this.donGia = donGia;
        this.giamGia = giamGia;
    }

    // 2b. Constructor 2 tham số (ngầm hiểu giamGia = 0)
    public SanPham(String tenSp, double donGia) {
        this(tenSp, donGia, 0);
    }

    // 3a. Getter/Setter
    public String getTenSp() {
        return tenSp;
    }

    public void setTenSp(String tenSp) {
        this.tenSp = tenSp;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public double getGiamGia() {
        return giamGia;
    }

    public void setGiamGia(double giamGia) {
        this.giamGia = giamGia;
    }

    // Nhập dữ liệu từ bàn phím
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên sản phẩm: ");
        setTenSp(sc.nextLine());
        System.out.print("Nhập đơn giá: ");
        setDonGia(sc.nextDouble());
        System.out.print("Nhập giảm giá: ");
        setGiamGia(sc.nextDouble());
    }

    // Xuất thông tin sản phẩm (public)
    public void xuat() {
        System.out.println("Tên SP       : " + getTenSp());
        System.out.println("Đơn giá      : " + getDonGia());
        System.out.println("Giảm giá     : " + getGiamGia());
        System.out.println("Thuế thu nhập: " + tinhThue());
        System.out.println("Giá sau giảm : " + (getDonGia() - getGiamGia()));
        System.out.println("-------------------------------");
    }

    // Tính thuế (private)
    private double tinhThue() {
        return 0.1 * (getDonGia() - getGiamGia());
    }
}
