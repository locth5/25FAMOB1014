package labs2;

import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so dien ");
        double sodien = scanner.nextDouble();
        double tientra;
        if (sodien <= 50) {
            tientra = sodien * 1000;
        } else {
            tientra = 50 * 1000 + (sodien - 50) * 1200;
        }
        System.out.printf("So tien phai tra: %.2f", tientra);
        scanner.close();
    }
}
