/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab4;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class Sanpham {
     private String tenSp;
    private double donGia;
    private double giamGia;

    // Hàm nhập
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten san pham: ");
        tenSp = sc.nextLine();
        System.out.print("Nhap don gia: ");
        donGia = sc.nextDouble();
        System.out.print("Nhap giam gia: ");
        giamGia = sc.nextDouble();
        sc.nextLine(); // bỏ dòng thừa
    }

    // Tính thuế nhập khẩu (10% đơn giá)
    public double getThueNhapKhau() {
        return donGia * 0.1;
    }

    // Xuất thông tin sản phẩm
    public void xuat() {
        System.out.println("ten san pham: " + tenSp);
        System.out.println("don gia: " + donGia);
        System.out.println("giam gia: " + giamGia);
        System.out.println("Thue nhap khau: " + getThueNhapKhau());
        System.out.println("---------------------------");
    }
}
