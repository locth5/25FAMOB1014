/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package asm;

/**
 *
 * @author Admin
 */
import java.util.Scanner;

public class MainQuanLy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QuanLyNhanSu ql = new QuanLyNhanSu();

        // Demo nhập sẵn dữ liệu
        ql.nhap(new NhanVienHanhChinh("HC01", "Nguyen Van A", 8000000));
        ql.nhap(new NhanVienTiepThi("TT01", "Tran Thi B", 4000000, 20000000, 0.05));
        ql.nhap(new TruongPhong("TP01", "Le Van C", 10000000, 2000000));

        int choice;
        do {
            System.out.println("\n===== Menu Quan ly Nhan Su =====");
            System.out.println("1. Xuat danh sach nhan vien");
            System.out.println("2. Tim nhan vien theo ma");
            System.out.println("3. Xoa nhan vien theo ma");
            System.out.println("4. Cap nhat thong tin nhan vien");
            System.out.println("5. Tim nhan vien theo khoan luong");
            System.out.println("6. Sap xep theo ho ten");
            System.out.println("7. Sap xep theo thu nhap");
            System.out.println("8. Top 5 thu nhap cao nhat");
            System.out.println("0. Thoat");
            System.out.print("Chọn: ");
            choice = sc.nextInt(); sc.nextLine();

            switch (choice) {
                case 1:
                    ql.xuat();
                    break;
                case 2:
                    System.out.print("Nhap ma: ");
                    String ma = sc.nextLine();
                    NhanVien nv = ql.timTheoMa(ma);
                    if (nv != null) nv.xuat();
                    else System.out.println("Khong tim thay");
                    break;
                case 3:
                    System.out.print("Nhap ma: ");
                    ql.xoa(sc.nextLine());
                    break;
                case 4:
                    System.out.print("Nhap ma: ");
                    String maUpdate = sc.nextLine();
                    System.out.print("Ten moi: ");
                    String ten = sc.nextLine();
                    System.out.print("Luong moi: ");
                    double luong = sc.nextDouble();
                    ql.capNhat(maUpdate, ten, luong);
                    break;
                case 5:
                    System.out.print("Min: ");
                    double min = sc.nextDouble();
                    System.out.print("Max: ");
                    double max = sc.nextDouble();
                    ql.timTheoLuong(min, max);
                    break;
                case 6:
                    ql.sapXepTheoTen();
                    ql.xuat();
                    break;
                case 7:
                    ql.sapXepTheoThuNhap();
                    ql.xuat();
                    break;
                case 8:
                    ql.top5ThuNhap();
                    break;
            }
        } while (choice != 0);

        sc.close();
    }
}
