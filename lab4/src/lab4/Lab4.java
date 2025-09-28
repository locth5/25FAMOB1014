/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab4;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class Lab4 {
private String tenSp;
    private double donGia;
    private double giamGia;
     public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten san pham: ");
        tenSp = sc.nextLine();
        System.out.print("Nhap don gia: ");
        donGia = sc.nextDouble();
        System.out.print("Nhap giam gia: ");
        giamGia = sc.nextDouble();
    }
       public double getThueNhapKhau() {
        return donGia * 0.1;
    }

    // Xuất thông tin sản phẩm
    public void xuat() {
        System.out.println("Ten san pham: " + tenSp);
        System.out.println("Don gia: " + donGia);
        System.out.println("Giam gia: " + giamGia);
        System.out.println("Thue nhap khau: " + getThueNhapKhau());
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          Lab4 sp;
    sp = new Lab4();
        sp.nhap();
        System.out.println(" Thong tin san pham");
        sp.xuat();
    }
    }
    

