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
public class bai4 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập các hệ số a, b, c
        System.out.print("Nhap a: ");
        double a = scanner.nextDouble();

        System.out.print("Nhap b: ");
        double b = scanner.nextDouble();

        System.out.print("Nhap c: ");
        double c = scanner.nextDouble();

        // Tính delta
        double delta = Math.pow(b, 2) - 4 * a * c;

        // Xuất delta
        System.out.println("Delta = " + delta);

        // Tính căn delta nếu delta >= 0
     
            double canDelta = Math.sqrt(delta);
            System.out.println("Can delta = " + canDelta);
       
           
        

        scanner.close();
    }
}
