import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.println("1-100 arasındaki asal sayılar:");


        int sayac = 0;

        for (int i = 2; i <= 100; i++) {
            int kontrol = 0;
            for (int j=2; j<i; j++) {
                if (i % j == 0) {
                    kontrol = 1; //boolean kullanılabilirdi bu şekilde kontrol sağladım
                    break;
                }
            }
            if (kontrol==0){
                System.out.println(i);
                sayac++;
            }

        }
    }
}

