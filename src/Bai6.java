import java.util.Scanner;

public class Bai6 {

    public static void main(String[] args) {
        //    Bài 6: Nhập vào 2 số nguyên từ bàn phím, in menu và thực hiện các
//    chức năng theo menu sau:
//            **********************CACULATOR**********************
//            1. Tổng 2 số
//2. Hiệu 2 số
//3. Tích 2 số
//4. Thương 2 số
//5. Số dư trong phép chia 2 số
//6. Ước chung lớn nhất
//7. Bội chung nhỏ nhất
//8. Thoát
//    Lựa chọn của bạn:
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao so nguyen thu nhat: ");
        int num1 = scanner.nextInt();
        System.out.println("Nhap vao so nguyen thu hai: ");
        int num2 = scanner.nextInt();
        System.out.printf("Hai so nguyen la: %d va %d", num1, num2);
        do {
            System.out.println("**********************CACULATOR**********************");
            System.out.println("1.Tong 2 so");
            System.out.println("2.Hieu hai so");
            System.out.println("3.Tich hai so");
            System.out.println("4.Thuong hai so");
            System.out.println("5.So du trong phep chia hai so");
            System.out.println("6.Uoc chung lon nhat");
            System.out.println("7.Boi chung nho nhat");
            System.out.println("8.Thoat");
            int chose = scanner.nextInt();
            int num3;
            switch (chose) {
                case 1:
                    num3 = num1 + num2;
                    System.out.println("Tong 2 so la :" + num3);
                    break;
                case 2:
                    num3 = num1 - num2;
                    System.out.println("Hieu hai so la:" + num3);
                    break;
                case 3:
                    num3 = num1 * num2;
                    System.out.println("Tich hai so la: " + num3);
                    break;
                case 4:
                    num3 = num1 / num2;
                    System.out.println("Thuong hai so la:" + num3);
                    break;
                case 5:
                    if (num2 != 0) {
                        num3 = num1 % num2;
                        System.out.println("So du trong phep chia hai so: " + num3);
                    }
                    break;
                case 6:
                    while (num2 != 0) {
                        int temp = num2;
                        num2 = num1 % num2;
                        num1 = temp;
                    }
                    System.out.println("Uoc chung lon nhat la " + num1);
                    break;
                case 7:


                case 8:
                    System.exit(0);
                default:
                    System.out.println("Ban nhap sai, vui long nhap lai!");
                    break;

            }
        } while (true);

    }

}

