package bai1;
import java.util.Scanner;

public class Sanpham {
    private String tenSp;
    private double donGia;
    private double giamGia;

    public Sanpham(String tenSp, double donGia, double giamGia) {
        this.tenSp = tenSp;
        this.donGia = donGia;
        this.giamGia = giamGia;
    }

    public double thuenhapkhau() {
        return donGia * 0.1;
    }

    public void nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap ten sp: ");
        tenSp = scanner.nextLine();
        System.out.print("nhap don gia: ");
        donGia = scanner.nextDouble();
        System.out.print("nhap giam gia: ");
        giamGia = scanner.nextDouble();
    }

    public void xuat() {
        System.out.println("ten sp: " + tenSp);
        System.out.println("gia: " + donGia);
        System.out.println("giam gia: " + giamGia);
        System.out.println("thue: " + thuenhapkhau());
    }

}