public class Bai1 {
    public static void main(String[] args) {
//        Bài 1: In ra các số chẵn trong khoảng từ 1 đến 10 và tính tổng các số đó
        int sum = 0;
        System.out.println("Cac so chan trong khoang tu 1-10:");
        for (int i = 1; i <=10 ; i++) {
            if(i%2==0){
                System.out.printf("%d\t",i);
                sum+= i;
            }
        }
        System.out.printf("\nTong cac so: %d", sum);
    }
}
