/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab3;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class Lab3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);

        // Nhập số nguyên từ bàn phím
        System.out.print("Nhap so nguyen N: ");
        int N = sc.nextInt();

        boolean ok = true;

        // Số nhỏ hơn 2 không phải số nguyên tố
        if (N < 2) {
            ok = false;
        } else {
            // Kiểm tra từ 2 đến căn bậc 2 của N
            for (int i = 2; i <= Math.sqrt(N); i++) {
                if (N % i == 0) {
                    ok = false;
                    break;
                }
            }
        }

        // Xuất kết quả
        if (ok) {
            System.out.println(N + " la so nguyen to.");
        } else {
            System.out.println(N + " khong phai la so nguyen to.");
        }

        sc.close();
    }
    }
    

