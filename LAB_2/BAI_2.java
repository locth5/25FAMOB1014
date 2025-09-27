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
public class BAI_2 {
    

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        
        
        System.out.println("-- Giải phương trình bậc hai ax^2 + bx + c = 0 --");
        
        
        System.out.print("Nhập a: ");
        double a = sc.nextDouble();
        
        System.out.print("Nhập b: ");
        double b = sc.nextDouble();
        
        System.out.print("Nhập c: ");
        double c = sc.nextDouble();

        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    System.out.println("Phương trình có vô số nghiệm.");
                } else {
                    System.out.println("Phương trình vô nghiệm.");
                }
            } else {
                double x = -c / b;
                System.out.println("Nghiệm x = " + x);
            }
        } else {
            double delta = b * b - 4 * a * c;
            if (delta < 0) {
                System.out.println("Phương trình vô nghiệm.");
                
            } else if (delta == 0) {
                double x = -b / (2 * a);
                System.out.println("Phương trình có nghiệm kép x = " + x);
                
            } else {
                double sqrtD = Math.sqrt(delta);
                double x1 = (-b + sqrtD) / (2 * a);
                
                double x2 = (-b - sqrtD) / (2 * a);
                
                System.out.println("Phương trình có 2 nghiệm phân biệt:");
                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);
            }
        }
    }
}
