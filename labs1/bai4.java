package labs1;

import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap he so a: ");
        double a = scanner.nextDouble();
        System.out.print("nhap he so b: ");
        double b = scanner.nextDouble();
        System.out.print("nhap he so c: ");
        double c = scanner.nextDouble();
        double delta = b * b - 4 * a * c;
        System.out.println("Delta = " + delta);
        if (delta >= 0) {
            double canDelta = Math.sqrt(delta);
            System.out.println("canS delta = " + canDelta);
        } else {
            System.out.println("delta am.");
        }

        scanner.close();
    }
}
