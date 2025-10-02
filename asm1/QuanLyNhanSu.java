package asm1;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLyNhanSu {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<NhanVien> dsNhanVien = new ArrayList<>();

    public static void main(String[] args) {
        int choice;

        do {
            System.out.println("\n===== MENU QUAN LY NHAN SU =====");
            System.out.println("1. Nhap danh sach nhan vien");
            System.out.println("2. Xuat danh sach nhan vien");
            System.out.println("3. Tim nhan vien theo ma");
            System.out.println("4. Xoa nhan vien theo ma");
            System.out.println("5. Cap nhat thong tin nhan vien");
            System.out.println("6. Tim nhan vien theo khoang luong");
            System.out.println("7. Sap xep nhan vien theo ho va ten");
            System.out.println("8. Sap xep nhan vien theo thu nhap");
            System.out.println("9. Xuat 5 nhan vien co thu nhap cao nhat");
            System.out.println("0. Thoat");
            System.out.print("Chon chuc nang: ");

            choice = sc.nextInt();
            sc.nextLine(); // bỏ ký tự xuống dòng

            switch (choice) {
                case 1:
                    nhapDanhSach();
                    break;
                case 2:
                    xuatDanhSach();
                    break;
                case 3:
                    System.out.println(">> Tim nhan vien theo ma (chua lam)");
                    break;
                case 4:
                    System.out.println(">> Xoa nhan vien theo ma (chua lam)");
                    break;
                case 5:
                    System.out.println(">> Cap nhat thong tin nhan vien (chua lam)");
                    break;
                case 6:
                    System.out.println(">> Tim nhan vien theo khoang luong (chua lam)");
                    break;
                case 7:
                    System.out.println(">> Sap xep nhan vien theo ho va ten (chua lam)");
                    break;
                case 8:
                    System.out.println(">> Sap xep nhan vien theo thu nhap (chua lam)");
                    break;
                case 9:
                    System.out.println(">> Xuat 5 nhan vien co thu nhap cao nhat (chua lam)");
                    break;
                case 0:
                    System.out.println(">> Thoat chuong trinh.");
                    break;
                default:
                    System.out.println(">> Lua chon khong hop le!");
            }

            if (choice != 0) {
                System.out.println("\n------------------------------\n");
            }

        } while (choice != 0);

        sc.close();
    }

    // ===== Y1: Nhập danh sách nhân viên =====
    public static void nhapDanhSach() {
        System.out.print("Nhap so luong nhan vien: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("\n-- Nhan vien thu " + (i + 1));
            System.out.println("Chon loai : 1. Hanh chinh | 2. Tiep thi | 3. Truong phong");
            int loai = sc.nextInt();
            sc.nextLine();

            System.out.print("MA NV: ");
            String ma = sc.nextLine();
            System.out.print("HO TEN: ");
            String hoTen = sc.nextLine();
            System.out.print("LUONG CO BAN: ");
            double luong = sc.nextDouble();

            if (loai == 1) {
                dsNhanVien.add(new NhanVienHanhChinh(ma, hoTen, luong));
            } else if (loai == 2) {
                System.out.print("DDOANH SO: ");
                double ds = sc.nextDouble();
                System.out.print("TI LE HOA HONG(NHAP%): ");
                double hh = sc.nextDouble();
                dsNhanVien.add(new NhanVienTiepThi(ma, hoTen, luong, ds, hh));
            } else if (loai == 3) {
                System.out.print("LUONG TRACH NHIEM: ");
                double tn = sc.nextDouble();
                dsNhanVien.add(new TruongPhong(ma, hoTen, luong, tn));
            } else {
                System.out.println("LOAI NHAN VIEN KHONG HOP LE, NHAP LAI!");
                i--;
            }
        }
    }

    // ===== Y2: Xuất danh sách nhân viên =====
    public static void xuatDanhSach() {
        if (dsNhanVien.isEmpty()) {
            System.out.println(">> CHUA CO NHAN VIEN NAO!");
        } else {
            System.out.println("\n===== DANH SACH NHAN VIEN =====");
            for (NhanVien nv : dsNhanVien) {
                nv.xuatThongTin();
            }
        }
    }
}
