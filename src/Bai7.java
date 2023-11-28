import java.util.Scanner;

public class Bai7 {
//    Bài 7: Nhập vào 3 số nguyên từ bàn phím, in menu và thực hiện các
//    chức năng theo menu sau:
//            **********************CACULATOR**********************
//            1. Tổng 3 số nguyên
//2. Trung bình cộng của 3 số nguyên
//3. Số lớn nhất, nhỏ nhất trong 3 số
//4. Thoát
//    Lựa chọn của bạn:
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("So nguyen thu nhat: ");
    int num1 = Integer.parseInt(scanner.nextLine());
    System.out.println("So nguyen thu hai: ");
    int num2 = Integer.parseInt(scanner.nextLine());
    System.out.println("So nguyen thu ba: ");
    int num3 = Integer.parseInt(scanner.nextLine());
    do {
        System.out.println(" **********************CACULATOR**********************");
        System.out.println("1.Tong 3 so nguyen");
        System.out.println("2. Trung binh cong cua 3 so nguyen");
        System.out.println("3. So lon nhat, so nho nhat trong 3 so");
        System.out.println("4. Thoat");
        int num ;
        int chose = Integer.parseInt(scanner.nextLine());

        switch (chose){
            case 1: 
                num = num1 + num2 + num3;
                System.out.printf("Tong 3 so nguyen la %d\n", num);
                break;
            case 2:
                num = (num1 + num2 + num3)/3;
                System.out.println("Trung binh cong cua 3 so la : \n" +num);
                break;
            case 3:
               int max = Math.max(Math.max(num1,num2),num3);
               int min = Math.min(Math.min(num1,num2),num3);
                System.out.println("Gia tri lon nhat la: \n"+max);
                System.out.println("Gia tri nho nhat la: \n"+min);
                break;
            case 4:
                System.exit(0);
                break;
            default:
                System.out.println("Nhap sai, vui long nhap lai\n");
                break;
        }
    }while (true);
}
}
