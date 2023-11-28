import java.util.Scanner;

public class Bai2 {
//    Bài 2: Nhập các số nguyên từ bàn phím, tính tổng các số lẻ nhập vào,
//    chương trình kết thúc khi nhập 0
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int b  = 1;
    int sum = 0;
    while (b!= 0){
        System.out.println("Nhap cac so nguyen tu ban phim: ");
        b = scanner.nextInt();
        if(b%2==0){
            sum+=b;
        }
    }
    System.out.println("Tong cac so nguyen la: "+sum);

}
}
