/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB_3;

/**
 *
 * @author Admin
 */
public class bai_2 {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            System.out.println("Bảng cửu chương " + i + ":");
            for (int j = 1; j <= 10; j++) {
                System.out.printf("%d x %d = %d\n", i, j, i * j);
            }
            System.out.println();
        }
    }
}
