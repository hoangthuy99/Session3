import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
//        in ra menu và thực hiện các chức năng theo yêu cầu:
//******************************Breakfast Menu*************************
//        1. Phở tôm hùm
//        2. Phở bò Kobe
//        3. Phở gà Việt Nam
//        4. Xôi trứng thịt
//        5. Bánh mỳ trứng
//        6. Mỳ tôm không người lái
//        7. Thoát
//        Lựa chọn của bạn:
//✓ Menu hiển thị ít nhất một lần, lặp đi lặp lại đến khi người dùng
//        chọn 7 – Thoát mới kết thúc chương trình
//✓ Người dùng nhập các giá trị 1-7, ngoài giá trị đó thì thông báo
//        người dùng “Vui lòng chọn từ 1 - 7”
//✓ Chọn từ 1-6, thực hiện in ra màn hình “Bạn vừa chọn món …, vui
//        lòng đợi trong giây lát;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("1. Phở tôm hùm");
            System.out.println("2. Pho bo kobe");
            System.out.println("3. Pho ga Viet Nam");
            System.out.println("4. Xoi trung thit");
            System.out.println("5. Banh my trung");
            System.out.println("6. My tom khong nguoi lai");
            System.out.println("7. Thoat");
            int chose = scanner.nextInt();
            switch (chose){
                case 1:
                    System.out.println("Ban da chon Pho tom hum");
                    break;
                case 2:
                    System.out.println("Ban da chon Pho bo Kobe");
                    break;
                case 3:
                    System.out.println("Ban da chon Pho ga Viet Nam");
                    break;
                case 4:
                    System.out.println("Ban cho da Pho ga ");
                    break;
                case 5:
                    System.out.println("Ban da chon xoi chung thit");
                    break;
                case 6:
                    System.out.println("Ban da chon Mi tom khong nguoi lai");
                    break;
                case 7:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Moi ban chon lai");

            }
        } while (true);

    }
}
