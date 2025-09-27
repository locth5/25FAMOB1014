package asm1;

import java.util.Scanner;

public class QuanLyNhanSu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
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
            sc.nextLine();

            switch (choice) {
                case 1 -> System.out.println(">> Nhập danh sách nhân viên");
                case 2 -> System.out.println(">> Xuất danh sách nhân viên");
                case 3 -> System.out.println(">> Tìm nhân viên theo mã");
                case 4 -> System.out.println(">> Xóa nhân viên theo mã");
                case 5 -> System.out.println(">> Cập nhật thông tin nhân viên");
                case 6 -> System.out.println(">> Tìm nhân viên theo khoảng lương");
                case 7 -> System.out.println(">> Sắp xếp nhân viên theo họ và tên");
                case 8 -> System.out.println(">> Sắp xếp nhân viên theo thu nhập");
                case 9 -> System.out.println(">> Xuất 5 nhân viên có thu nhập cao nhất");
                case 0 -> System.out.println("Thoát chương trình.");
                default -> System.out.println("Lựa chọn không hợp lệ!");
            }

        } while (choice != 0);

        sc.close();
    }
}
