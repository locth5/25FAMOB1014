/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab4;

/**
 *
 * @author Admin
 */
public class MainSanpPham2 {
     public static void main(String[] args) {
        // Tạo sản phẩm có giảm giá
        SanPham2 sp1 = new SanPham2("laptop", 1500000, 2000000);

        // Tạo sản phẩm không giảm giá
        SanPham2 sp2 = new SanPham2("dien thoai", 8000000);

        // Xuất thông tin sản phẩm
        sp1.xuat();
        sp2.xuat();
    }
}
