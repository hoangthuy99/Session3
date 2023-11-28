import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
//        Bài 4: Nhập các số nguyên và in ra các số nguyên chia hết cho 3, kết
//        thúc khi nhập 0
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao so nguyen ");
        int a = Integer.parseInt(scanner.nextLine());
        while (a != 0) {
            if (a % 3 == 0) {
                System.out.println("So nguyen chia het cho 3");
            }
            System.out.println("Nhap so nguyen, nhap 0 de ket thuc: ");
            a = Integer.parseInt(scanner.nextLine());

        }
        System.out.println("Ket thuc chuong trinh");
    }
}
