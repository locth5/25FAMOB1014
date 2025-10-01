package bai2_3_4;

import java.util.Scanner;

import bai2_3_4.SanPham;

public class Main {
    public static void main(String[] args) {
        // Tạo sản phẩm: có giảm giá và không giảm giá
        SanPham sp1 = new SanPham("Laptop Dell", 15000000, 1000000);
        SanPham sp2 = new SanPham("Chuột Logitech", 500000);

        // Hoặc nhập từ bàn phím:
        // sp1.nhap();
        // sp2.nhap();

        // Xuất thông tin
        System.out.println("=== Thông tin SP1 ===");
        sp1.xuat();
        System.out.println("=== Thông tin SP2 ===");
        sp2.xuat();
    };
}
