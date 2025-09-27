package labs3;

import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.Scanner;

public class bai3 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("nhap so phan tu mang: ");
        int x = scanner.nextInt();
        int[] arr = new int[x];

        System.out.println("nhap cac phan tu:");
        for (int i = 0; i < x; i++) {
            System.out.print("arr[" + i + "] = "); // i la so thu tu phan tu
            arr[i] = scanner.nextInt();
        }

        Arrays.sort(arr); // sapxep mang tu be den lon
        System.out.println("mang sau khi sap xep: " + Arrays.toString(arr));
        int min = arr[0];
        System.out.println("phan tu nho nhat trong mang la: " + min);

        int tong = 0;// test
        int tam = 0;
        for (int value : arr) {
            if (value % 3 == 0) {
                tong += value;
                tam++;
            }
        }
        if (tam > 0) {
            double trungBinh = (double) tong / tam;
            System.out.println("trung binh cong cac so chia het cho 3 la: " + trungBinh);
        } else {
            System.out.println("khong co phan tu nao chia het cho 3");
        }
    }
}
