/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB_2;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class BAI_3 {
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        
        
        System.out.println("-- Tính tiền điện theo lũy tiến --");
        System.out.print("Nhập số điện sử dụng (số nguyên >= 0): ");
        int soDien = sc.nextInt();

        if (soDien < 0) {
            System.out.println("Số điện không hợp lệ.");
            return;
        }

        final int gia1 = 1000; // 0..50
        final int gia2 = 1200; // phần vượt 50

        long tien;
        if (soDien <= 50) {
            tien = (long) soDien * gia1;
        } else {
            tien = 50L * gia1 + (long) (soDien - 50) * gia2;
        }

        System.out.println("Tiền điện phải trả: " + tien + " VND");
    }
}
