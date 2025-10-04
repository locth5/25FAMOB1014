package bai2;

import java.util.Scanner;

public class Sanphamm {
    private String maSP;
    private String tenSP;
    private double gia;

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã sản phẩm: ");
        maSP = sc.nextLine();
        System.out.print("Nhập tên sản phẩm: ");
        tenSP = sc.nextLine();
        System.out.print("Nhập giá sản phẩm: ");
        gia = Double.parseDouble(sc.nextLine());
    }

    public void xuat() {
        System.out.println("Mã SP  : " + maSP);
        System.out.println("Tên SP : " + tenSP);
        System.out.println("Giá SP  : " + gia);
    }
}
