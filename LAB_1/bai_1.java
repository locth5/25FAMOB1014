/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB_1;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class bai_1 {
      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Nhập họ tên
        System.out.print("Nhập họ và tên sinh viên: ");
        String hoTen = scanner.nextLine();
        
        // Nhập điểm
        System.out.print("Nhập điểm trung bình: ");
        double diem = scanner.nextDouble();
        
        // Xuất kết quả
        System.out.println("<<" + hoTen + ">> <<" + diem + ">> điểm.");

        scanner.close();
    }
            
}
