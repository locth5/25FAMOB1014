package labs2;

import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập hệ số a: ");
        double a = scanner.nextDouble();

        System.out.print("Nhập hệ số b: ");
        double b = scanner.nextDouble();

        System.out.print("Nhập hệ số c: ");
        double c = scanner.nextDouble();

        if (a == 0) {
            // pt bậc nhất: bx + c = 0
            if (b == 0) {
                if (c == 0) {
                    System.out.println("Phương trình vô số nghiệm.");
                } else {
                    System.out.println("Phương trình vô nghiệm.");
                }
            } else {
                double x = -c / b;
                System.out.printf("Phương trình có một nghiệm: x = %.2f\n", x);
            }
        } else {
            // pt bậc hai
            double delta = Math.pow(b, 2) - 4 * a * c;
            System.out.println("Delta = " + delta);

            if (delta < 0) {
                System.out.println("Phương trình vô nghiệm.");
            } else if (delta == 0) {
                double x = -b / (2 * a);
                System.out.printf("Phương trình có nghiệm kép: x = %.2f\n", x);
            } else {
                double sqrtDelta = Math.sqrt(delta);
                double x1 = (-b + sqrtDelta) / (2 * a);
                double x2 = (-b - sqrtDelta) / (2 * a);
                System.out.println("Phương trình có 2 nghiệm phân biệt:");
                System.out.printf("x1 = %.2f\n", x1);
                System.out.printf("x2 = %.2f\n", x2);
            }
        }

        scanner.close();
    }
}
