/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB_3;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Mảng {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số phần tử của mảng: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "] = ");
            a[i] = sc.nextInt();
        }

    
        Arrays.sort(a);
        System.out.print("Mảng sau khi sắp xếp: ");
        for (int x : a) {
            System.out.print(x + " ");
        }
        System.out.println();

        //  min
        int min = a[0];
        for (int x : a) {
            min = Math.min(min, x);
        }
        System.out.println("Phần tử nhỏ nhất: " + min);

        // Trung bình chia hết cho 3
        int tong = 0, dem = 0;
        for (int x : a) {
            if (x % 3 == 0) {
                tong += x;
                dem++;
            }
        }
        if (dem > 0) {
            double tbc = (double) tong / dem;
            System.out.println("Trung bình cộng các số chia hết cho 3: " + tbc);
        } else {
            System.out.println("Không có số nào chia hết cho 3.");
        }
        sc.close();
    }
}
