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
public class bai_3 {
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        
        System.out.print("Nhập cạnh : ");
        double canh = scanner.nextDouble();

        
        double theTich = Math.pow(canh, 3);
        System.out.println("Thể tích  là: " + theTich);

        scanner.close();
        
}}
