import java.util.Scanner;

public class Bai8 {
    public static void main(String[] args) {
//        Bài 8: Viết chương trình nhập vào một số nguyên n, in menu và thực
//        hiện các chức năng theo menu:
//**********************PRACTICE**********************
//        1. In dãy số chia hết cho 2 và giảm dần (n >= số >= 2)
//        2. In các số nhỏ hơn n và tính tổng
//        3. In ra các ước số chẵn của n
//        4. In ra các ước số lẻ và số lượng các ước lẻ của n
//        5. In ra ước số lẻ lớn nhất của n
//        6. Thoát
//        Lựa chọn của bạn:
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao 1 so nguyen: ");
        int n = scanner.nextInt();
        do {
            System.out.println("**********************PRACTICE**********************");
            System.out.println("1. In day so chia het cho 2 va giam dan (n >= so >=2");
            System.out.println("2. In ra cac so nho hon n va tinh tong");
            System.out.println("3. In ra cac uoc so chan cua n");
            System.out.println("4. In ra cac uoc so le va so luong cac uoc so le cua n");
            System.out.println("5. In ra cac uoc so le lon nhat cua n");
            System.out.println("6. Thoat");
            int chose = scanner.nextInt();
            switch (chose) {
                case 1:
                    if (n >= 2) {
                        System.out.println("Day so chia het cho 2 va giam dan:");
                        for (int i = n; i >= 2; i -= 2) {
                            System.out.println(i + "");
                        }
                    }
                    break;
                case 2:
                    int sum = 0;
                    System.out.println("Cac so nho hon n la: ");
                    for (int i = 0; i < n; i++) {
                        System.out.printf("%d\t", i);
                        sum += i;
                    }
                    System.out.println("\nTong cac so nho hon n la: " + sum);
                    break;
                case 3:
                    System.out.println("Cac uoc so chan n: ");
                    for (int i = 2; i <= n; i += 2) {
                        if (n % i == 0) {
                            System.out.printf("%d\t",i);
                        }
                    }
                    System.out.println("\n");
                    break;
                case 4:
                    int sumOdd = 0;
                    System.out.println("Cac uoc so le :");
                    for (int i = 1; i <=n ; i+=2) {
                        if(n%i ==0){
                            System.out.printf("%d\t",i);
                            sumOdd++;
                        }
                    }
                    System.out.println("\nSo luong cac uoc so le cua n \n"+sumOdd);
                    break;
                case 5:
                    int maxOdd = 1;
                    for (int i = 1; i <=n ; i++) {
                        if(n%i ==0){
                            maxOdd = i;
                        }
                    }
                    System.out.println("Cac uoc so le lon nhat cua  la : \n " +maxOdd);

                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Moi ban nhap lai, lua cho sai");
                    break;

            }
        } while (true);
    }
}
