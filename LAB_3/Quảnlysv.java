/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB_3;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Quảnlysv {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số sinh viên: ");
        int n = sc.nextInt();
        sc.nextLine(); // bỏ dòng thừa

        String[] hoTen = new String[n];
        double[] diem = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Họ tên SV " + (i + 1) + ": ");
            hoTen[i] = sc.nextLine();
            System.out.print("Điểm SV " + (i + 1) + ": ");
            diem[i] = sc.nextDouble();
            sc.nextLine();
        }

        // Xuất thông tin sinh viên kèm học lực
        System.out.println("\nDanh sách sinh viên:");
        for (int i = 0; i < n; i++) {
            System.out.println("Họ tên: " + hoTen[i]);
            System.out.println("Điểm: " + diem[i]);
            System.out.println("Học lực: " + hocLuc(diem[i]));
            System.out.println("-------------------------");
        }

        // Sắp xếp tăng dần theo điểm (bubble sort)
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (diem[i] > diem[j]) {
                    double tmpD = diem[i]; diem[i] = diem[j]; diem[j] = tmpD;
                    String tmpH = hoTen[i]; hoTen[i] = hoTen[j]; hoTen[j] = tmpH;
                }
            }
        }

        System.out.println("\nDanh sách sau khi sắp xếp theo điểm:");
        for (int i = 0; i < n; i++) {
            System.out.println(hoTen[i] + " - " + diem[i] + " - " + hocLuc(diem[i]));
        }
        sc.close();
    }

    private static String hocLuc(double d) {
        if (d < 5) return "Yếu";
        else if (d < 6.5) return "Trung bình";
        else if (d < 7.5) return "Khá";
        else if (d < 9) return "Giỏi";
        else return "Xuất sắc";
    }
}
