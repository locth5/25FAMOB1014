package labs2;

import java.util.Scanner;

public class bai4 {
    static Scanner scanner = new Scanner(System.in);

    // 1. Giải phương trình bậc nhất: ax + b = 0
    public static void giaiPTB1() {
        System.out.print("Nhập a: ");
        double a = scanner.nextDouble();
        System.out.print("Nhập b: ");
        double b = scanner.nextDouble();

        if (a == 0) {
            if (b == 0) {
                System.out.println("Phương trình vô số nghiệm.");
            } else {
                System.out.println("Phương trình vô nghiệm.");
            }
        } else {
            double x = -b / a;
            System.out.println("Nghiệm của phương trình là x = " + x);
        }
    }

    // 2. Giải phương trình bậc 2: ax² + bx + c = 0
    public static void giaiPTB2() {
        System.out.print("Nhập a: ");
        double a = scanner.nextDouble();
        System.out.print("Nhập b: ");
        double b = scanner.nextDouble();
        System.out.print("Nhập c: ");
        double c = scanner.nextDouble();

        if (a == 0) {
            // chuyển về bậc nhất
            if (b == 0) {
                if (c == 0) {
                    System.out.println("Phương trình vô số nghiệm.");
                } else {
                    System.out.println("Phương trình vô nghiệm.");
                }
            } else {
                double x = -c / b;
                System.out.println("Nghiệm của phương trình là x = " + x);
            }
        } else {
            double delta = b * b - 4 * a * c;
            if (delta < 0) {
                System.out.println("Phương trình vô nghiệm.");
            } else if (delta == 0) {
                double x = -b / (2 * a);
                System.out.println("Phương trình có nghiệm kép x = " + x);
            } else {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("Phương trình có 2 nghiệm phân biệt:");
                System.out.println("x1 = " + x1 + ", x2 = " + x2);
            }
        }
    }

    // 3. Tính tiền điện
    public static void tinhTienDien() {
        System.out.print("Nhập số điện tiêu thụ (kWh): ");
        double soDien = scanner.nextDouble();

        double tien;
        if (soDien <= 50) {
            tien = soDien * 1678;
        } else if (soDien <= 100) {
            tien = 50 * 1678 + (soDien - 50) * 1734;
        } else if (soDien <= 200) {
            tien = 50 * 1678 + 50 * 1734 + (soDien - 100) * 2014;
        } else {
            tien = 50 * 1678 + 50 * 1734 + 100 * 2014 + (soDien - 200) * 2536;
        }

        System.out.println("Tiền điện phải trả: " + tien + " đồng");
    }

    // 4. Menu
    public static void menu() {
        int chon;
        do {
            System.out.println("+---------------------------------------------------+");
            System.out.println("1. Giải phương trình bậc nhất");
            System.out.println("2. Giải phương trình bậc 2");
            System.out.println("3. Tính tiền điện");
            System.out.println("4. Kết thúc");
            System.out.println("+---------------------------------------------------+");
            System.out.print("Chọn chức năng: ");
            chon = scanner.nextInt();

            switch (chon) {
                case 1:
                    giaiPTB1();
                    break;
                case 2:
                    giaiPTB2();
                    break;
                case 3:
                    tinhTienDien();
                    break;
                case 4:
                    System.out.println("Chương trình kết thúc.");
                    break;
                default:
                    System.out.println("Chức năng không hợp lệ. Vui lòng chọn từ 1 đến 4.");
            }
            System.out.println();
        } while (chon != 4);
    }

    // Main
    public static void main(String[] args) {
        menu();
    }
}
