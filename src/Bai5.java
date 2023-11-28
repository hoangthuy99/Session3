import java.util.Scanner;

public class Bai5 {
//    Bài 5: Nhập từ bàn phím số n (1<=n<=9), in ra bảng cửu chương n.
//    Phát triển bài toán: In ra bảng cửu chương từ 1 đến 9
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Nhap tu ban phim so n (1 <= n <= 9):");
    int n = scanner.nextInt();
    System.out.println("Bang cuu chuong n");
    for (int i = 1; i <= 10; i++) {
        int result = n * i;
        System.out.println(n + " x " + i + " = " + result);
    }
    System.out.println("Bang cuu chuong tu 1 den 9: ");
    for (int i = 1; i<= 9; i++){
        for (int j = 0; j <= 10 ; j++) {
            int result = i*j;
            System.out.println(i + " x " + j + " = " + result);
        }
    }

}
}
