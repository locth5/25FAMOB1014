/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab1;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class bai2 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập chiều dài và chiều rộng
        System.out.print("Nhap chieu dai: ");
        double dai = scanner.nextDouble();

        System.out.print("Nhap chieu rong: ");
        double rong = scanner.nextDouble();

        // Tính chu vi, diện tích và cạnh nhỏ
        double chuVi = (dai + rong) * 2;
        double dienTich = dai * rong;
        double canhNho = Math.min(dai, rong);

        // Xuất kết quả
        System.out.println("Chu vi hinh chu nhat: " + chuVi);
        System.out.println("Dien tich hinh chu nhat: " + dienTich);
        System.out.println("Canh nho nhat: " + canhNho);

        scanner.close();
    }
}
