package labs3;

public class bai21 {
    public static void main(String[] args) {

        for (int i = 1; i <= 9; i++) { // bang cuu chuong 1-9
            System.out.println("bang cuu chuong " + i + ":");
            for (int j = 1; j <= 10; j++) { // so nhan 1-10
                System.out.printf("%d x %d = %d", i, j, i * j);
                System.out.println();
            }
            System.out.println(); // xuống dòng sau mỗi bảng
        }
    }
}
