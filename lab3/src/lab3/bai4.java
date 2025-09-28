/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class bai4 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("nhap so luong sv: ");
        int a = scanner.nextInt();

        String[] hoten = new String[a];
        double[] diem = new double[a];

        // hien thi thong tin sinh vien
        for (int i = 0; i < a; i++) {
            System.out.print("nhap ho ten sv thu " + (i + 1) + ": ");
            hoten[i] = scanner.next();
            System.out.print("nhap diem sv thu " + (i + 1) + ": ");
            diem[i] = scanner.nextDouble();
        }
        // danh sach sv
        System.out.println("\n--- danh sach sv ---");
        for (int i = 0; i < a; i++) {
            System.out.printf("%-20s | diem: %.2f | Hoc luc: %s\n", hoten[i], diem[i], xepLoai(diem[i]));
        }

        // sap xep theo hoc luc
        for (int i = 0; i < a - 1; i++) {
            for (int j = i + 1; j < a; j++) {
                if (diem[i] > diem[j]) {
                    // doi diem
                    double tempDiem = diem[i];
                    diem[i] = diem[j];
                    diem[j] = tempDiem;

                    // đổi tên theo điểm
                    String tempTen = hoten[i];
                    hoten[i] = hoten[j];
                    hoten[j] = tempTen;
                }
            }
        }

        // xuat danh sach da sap xep
        System.out.println("\n--- danh sach sv theo hoc luc tang dan ---");
        for (int i = 0; i < a; i++) {
            System.out.printf("%-20s | Điểm: %.2f | Hoc luc: %s\n", hoten[i], diem[i], xepLoai(diem[i]));
        }
    }

    // xep loai
    public static String xepLoai(double diem) {
        if (diem < 5)
            return "Yeu";
        else if (diem < 6.5)
            return "Trung binh";
        else if (diem < 7.5)
            return "Kha";
        else if (diem < 9)
            return "Gioi";
        else
            return "Xuat sac";
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */