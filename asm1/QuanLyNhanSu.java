package asm1;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLyNhanSu {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<NhanVien> dsNhanVien = new ArrayList<>();

    public static void main(String[] args) {
        int choice;

        do {
            System.out.println("\n===== MENU QUẢN LÝ NHÂN SỰ =====");
            System.out.println("1. Nhập danh sách nhân viên");
            System.out.println("2. Xuất danh sách nhân viên");
            System.out.println("3. Tìm nhân viên theo mã");
            System.out.println("4. Xóa nhân viên theo mã");
            System.out.println("5. Cập nhật thông tin nhân viên");
            System.out.println("6. Tìm nhân viên theo khoảng lương");
            System.out.println("7. Sắp xếp nhân viên theo họ và tên");
            System.out.println("8. Sắp xếp nhân viên theo thu nhập");
            System.out.println("9. Xuất 5 nhân viên có thu nhập cao nhất");
            System.out.println("0. Thoát");
            System.out.print("Chọn chức năng: ");

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
                    System.out.println(">> Tìm nhân viên theo mã (chưa làm)");
                    break;
                case 4:
                    System.out.println(">> Xóa nhân viên theo mã (chưa làm)");
                    break;
                case 5:
                    System.out.println(">> Cập nhật thông tin nhân viên (chưa làm)");
                    break;
                case 6:
                    System.out.println(">> Tìm nhân viên theo khoảng lương (chưa làm)");
                    break;
                case 7:
                    System.out.println(">> Sắp xếp nhân viên theo họ và tên (chưa làm)");
                    break;
                case 8:
                    System.out.println(">> Sắp xếp nhân viên theo thu nhập (chưa làm)");
                    break;
                case 9:
                    System.out.println(">> Xuất 5 nhân viên có thu nhập cao nhất (chưa làm)");
                    break;
                case 0:
                    System.out.println(">> Thoát chương trình.");
                    break;
                default:
                    System.out.println(">> Lựa chọn không hợp lệ!");
            }

            if (choice != 0) {
                System.out.println("\n------------------------------\n");
            }

        } while (choice != 0);

        sc.close();
    }

    // ===== Y1: Nhập danh sách nhân viên =====
    public static void nhapDanhSach() {
        System.out.print("Nhập số lượng nhân viên: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("\n-- Nhân viên thứ " + (i + 1));
            System.out.println("Chọn loại: 1. Hành chính | 2. Tiếp thị | 3. Trưởng phòng");
            int loai = sc.nextInt();
            sc.nextLine();

            System.out.print("Mã NV: ");
            String ma = sc.nextLine();
            System.out.print("Họ tên: ");
            String hoTen = sc.nextLine();
            System.out.print("Lương cơ bản: ");
            double luong = sc.nextDouble();

            if (loai == 1) {
                dsNhanVien.add(new NhanVienHanhChinh(ma, hoTen, luong));
            } else if (loai == 2) {
                System.out.print("Doanh số: ");
                double ds = sc.nextDouble();
                System.out.print("Tỉ lệ huê hồng: ");
                double hh = sc.nextDouble();
                dsNhanVien.add(new NhanVienTiepThi(ma, hoTen, luong, ds, hh));
            } else if (loai == 3) {
                System.out.print("Lương trách nhiệm: ");
                double tn = sc.nextDouble();
                dsNhanVien.add(new TruongPhong(ma, hoTen, luong, tn));
            } else {
                System.out.println("Loại nhân viên không hợp lệ, nhập lại!");
                i--;
            }
        }
    }

    // ===== Y2: Xuất danh sách nhân viên =====
    public static void xuatDanhSach() {
        if (dsNhanVien.isEmpty()) {
            System.out.println(">> Chưa có nhân viên nào!");
        } else {
            System.out.println("\n===== DANH SÁCH NHÂN VIÊN =====");
            for (NhanVien nv : dsNhanVien) {
                nv.xuatThongTin();
            }
        }
    }
}
