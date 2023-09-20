import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Kullanıcıdan dizinin eleman sayısını istiyoruz.

        System.out.print("Insert number: ");
        int N = input.nextInt();

        //İlk iki değer biliniyor
        int toplam0 = 0;
        int toplam1 = 1;
        int toplam;


        for (int i = 2; i <= N; i++) {
            toplam = toplam0 + toplam1;
            System.out.print(toplam + " ");
            toplam0 = toplam1;
            toplam1 = toplam;
        }
    }
}