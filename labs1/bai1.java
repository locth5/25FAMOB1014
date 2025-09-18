package labs1;

import java.util.Scanner;

public class bai1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("nhap ho va ten");
        String name = scanner.nextLine();
        System.out.println("nhap diem");
        double point = scanner.nextDouble();
        System.out.printf("ho va ten: %s, diem: %.2f", name, point);
        scanner.close();/// test
    }
}