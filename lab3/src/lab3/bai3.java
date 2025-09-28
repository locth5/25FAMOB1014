
package lab3;
import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class bai3 {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhập số lượng phần tử mảng
        System.out.print("Nhap so luong phan tu mang ");
        int n = sc.nextInt();

        int[] a = new int[n];

        // Nhập từng phần tử của mảng
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap phan tu a [" + i + "]: ");
            a[i] = sc.nextInt();
        }

        // Sắp xếp mảng
        Arrays.sort(a);

        // Xuất mảng sau khi sắp xếp
        System.out.println("Mang sau khi sap xep:");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();

        // Tìm phần tử nhỏ nhất
        int min = a[0]; // sau khi sort thì phần tử đầu tiên là nhỏ nhất
        System.out.println("Phan tu nho nhat trong mang " + min);

        // Tính trung bình cộng các phần tử chia hết cho 3
        int tong = 0, dem = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] % 3 == 0) {
                tong += a[i];
                dem++;
            }
        }

        if (dem > 0) {
            double tbc = (double) tong / dem;
            System.out.println("Trung binh cong cac phan tu chia het cho 3 = " + tbc);
        } else {
            System.out.println("Khong co phan tu nao chia het cho 3 trong mang.");
        }

        sc.close();
    }
}

