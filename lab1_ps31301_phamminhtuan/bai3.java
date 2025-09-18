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
public class bai3 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập cạnh khối lập phương
        System.out.print("Nhap canh khoi lap phuong: ");
        double canh = scanner.nextDouble();

        // Tính thể tích (cách 1: nhân 3 lần)
        double theTich1 = canh * canh * canh;

        // Tính thể tích (cách 2: dùng Math.pow)
        double theTich2 = Math.pow(canh, 3);

        // Xuất kết quả
        System.out.println("The tich (cach 1): " + theTich1);
        System.out.println("The tich (cach 2): " + theTich2);

        scanner.close();
    }
}
