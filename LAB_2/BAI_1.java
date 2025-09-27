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
public class BAI_1 {
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        System.out.println("-- Giải phương trình bậc nhất ax + b = 0 --");
        System.out.print("Nhập a: ");
        double a = sc.nextDouble();
        System.out.print("Nhập b: ");
        double b = sc.nextDouble();

        if (a == 0) {
            if (b == 0) {
                System.out.println("Phương trình có vô số nghiệm.");
            } else {
                System.out.println("Phương trình vô nghiệm.");
            }
        } else {
            double x = -b / a;
            System.out.println("Nghiệm x = " + x);
        }
    }
}
