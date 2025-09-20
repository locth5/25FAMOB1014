import java.util.Scanner;

public class Lab1 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            while (true) {
                System.out.println("\n--- Menu ---");
                System.out.println("1. Nhập họ tên và điểm sinh viên");
                System.out.println("2. Tính hình chữ nhật (chu vi, diện tích, cạnh nhỏ)");
                System.out.println("3. Tính thể tích khối lập phương");
                System.out.println("4. Giải phương trình bậc 2 (tính delta)");
                System.out.println("0. Thoát");
                System.out.print("Chọn bài: ");
                int chon = sc.nextInt();
                sc.nextLine(); // đọc bỏ dòng thừa

                switch (chon) {
                    case 1 -> Bai1.run(sc);
                    case 2 -> Bai2.run(sc);
                    case 3 -> Bai3.run(sc);
                    case 4 -> Bai4.run(sc);
                    case 0 -> {
                        System.out.println("Thoát chương trình.");
                        return;
                    }
                    default -> System.out.println("Lựa chọn không hợp lệ!");
                }
            }
        }
    }
}

// Bài 1: Nhập họ tên và điểm sinh viên
class Bai1 {
    public static void run(Scanner sc) {
        System.out.print("Nhập họ và tên sinh viên: ");
        String hoTen = sc.nextLine();
        System.out.print("Nhập điểm trung bình: ");
        double diem = sc.nextDouble();
        System.out.println(hoTen + " " + diem + " điểm");
    }
}

// Bài 2: Hình chữ nhật
class Bai2 {
    public static void run(Scanner sc) {
        System.out.print("Nhập cạnh a (cm): ");
        double a = sc.nextDouble();
        System.out.print("Nhập cạnh b (cm): ");
        double b = sc.nextDouble();

        double chuVi = 2 * (a + b);
        double dienTich = a * b;
        double canhNho = Math.min(a, b);

        System.out.println("Chu vi: " + chuVi + " cm");
        System.out.println("Diện tích: " + dienTich + " cm²");
        System.out.println("Cạnh nhỏ: " + canhNho + " cm");
    }
}

// Bài 3: Khối lập phương
class Bai3 {
    public static void run(Scanner sc) {
        System.out.print("Nhập cạnh của khối lập phương (cm): ");
        double a = sc.nextDouble();
        double theTich = Math.pow(a, 3);
        System.out.println("Thể tích khối lập phương: " + theTich + " cm³");
    }
}

// Bài 4: Phương trình bậc 2
class Bai4 {
    public static void run(Scanner sc) {
        System.out.print("Nhập a: ");
        double a = sc.nextDouble();
        System.out.print("Nhập b: ");
        double b = sc.nextDouble();
        System.out.print("Nhập c: ");
        double c = sc.nextDouble();

        double delta = b * b - 4 * a * c;
        if (delta < 0) {
            System.out.println("Delta âm, phương trình vô nghiệm thực.");
        } else {
            System.out.println("Delta = " + delta);
            System.out.println("Căn delta = " + Math.sqrt(delta));
        }
    }
}
