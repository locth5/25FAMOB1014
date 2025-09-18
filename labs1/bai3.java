package labs1;

import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap canh a: ");
        double a = scanner.nextDouble();
        double thetich = a * a * a;
        System.out.printf("the tich lap phuong: %.2f", thetich);
        scanner.close();
    }
}
