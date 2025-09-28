/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab4;

/**
 *
 * @author Admin
 */
public class MainSanPham3 {
   
    public static void main(String[] args) {
        // Tạo sản phẩm có giảm giá
        SanPham3 sp1 = new SanPham3("Laptop", 2000000, 1500000);

        // Tạo sản phẩm không giảm giá
        SanPham3 sp2 = new SanPham3("Dien thoai", 9000000);

        // Xuất thông tin ban đầu
        sp1.xuat();
        sp2.xuat();

        // Thay đổi dữ liệu bằng setter
        sp1.setDonGia(1800000);
        sp2.setTenSp("iPhone");

        // Xuất thông tin sau khi thay đổi
        System.out.println("=== Sau khi cap nhat du lieu bang setter ===");
        sp1.xuat();
        sp2.xuat();
    

    }
}
