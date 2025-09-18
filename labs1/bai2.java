package labs1;

import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("chieu dai 2 canh hinh chu nhat  lien ke");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double area = a * b;
        double perimeter = (a + b) * 2;
        double x = Math.min(a, b);
        System.out.printf("dien tich: %.2f, chu vi: %.2f,x:%.2f", area, perimeter, x);
        scanner.close();
    }
}