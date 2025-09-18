package labs3;

import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so nguyen duong n: ");
        int n = scanner.nextInt();
        boolean isPrime = true;
        if (n < 2) {
            isPrime = false;
        } else {
            for (int i = 2; i < n; i++) {
                if (n % i == 0) { // chia lay du, neu du = 0 => khong phai so nguyen to
                    isPrime = false;
                    break;
                }
            }
        }
        if (isPrime) {
            System.out.println(n + " là số nguyen to.");
        } else {
            System.out.println(n + " không phải là số nguyen to.");
        }
    }
}
