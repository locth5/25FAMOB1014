/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab1;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class Lab1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
Scanner scanner = new Scanner(System.in);

        // Nhập họ và tên
        System.out.print("ho va ten: ");
        String hoTen = scanner.nextLine();

        // Nhập điểm trung bình
        System.out.print("diem TB: ");
        double diemTB = scanner.nextDouble();

        // Xuất ra màn hình
        System.out.printf("%s%f điem", hoTen, diemTB);
        
        scanner.close();
    }
    
}

