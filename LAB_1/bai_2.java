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
public class bai_2 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập chiều dài và chiều rộng
        System.out.print("Nhập chiều dài: ");
        double dai = scanner.nextDouble();

        System.out.print("Nhập chiều rộng: ");
        double rong = scanner.nextDouble();

        // Tính toán
        double chuVi = (dai + rong) * 2;
        double dienTich = dai * rong;
        double canhNhoNhat = Math.min(dai, rong);

        // Xuất kết quả
        System.out.println("Chu vi: " + chuVi);
        System.out.println("Diện tích: " + dienTich);
        System.out.println("Cạnh nhỏ nhất: " + canhNhoNhat);

        scanner.close();
    }
}
