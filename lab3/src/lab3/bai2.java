/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3;

/**
 *
 * @author Admin
 */
public class bai2 {
     public static void main(String[] args) {
        // Vòng lặp ngoài: chạy các bảng từ 1 đến 9
        for (int i = 1; i <= 9; i++) {
            System.out.println("Bang cuu chuong " + i + ":");

            // Vòng lặp trong: chạy từ 1 đến 10 cho từng bảng
            for (int j = 1; j <= 10; j++) {
                System.out.printf("%d x %d = %d\n", i, j, i * j);
            }

            System.out.println(); // dòng trống để ngăn cách giữa các bảng
        }
    }
}

