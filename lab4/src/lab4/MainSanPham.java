/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab4;

/**
 *
 * @author Admin
 */
public class MainSanPham {
    public static void main(String[] args) {
        // Tạo 2 đối tượng sản phẩm
        Sanpham sp1;
        sp1 = new Sanpham();
        Sanpham sp2 = new Sanpham();

        // Nhập thông tin cho từng sản phẩm
        System.out.println("=== Nhap thong tin san pham 1 ===");
        sp1.nhap();

        System.out.println("\n=== Nhap thong tin san pham 2 ===");
        sp2.nhap();

        // Xuất thông tin 2 sản phẩm
        System.out.println("\n=== thong tin san pham 1 ===");
        sp1.xuat();

        System.out.println("=== thong tin san pham 2 ===");
        sp2.xuat();
    }
}
