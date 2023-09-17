import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int number;

        Scanner scanner = new Scanner(System.in);

        //Kullanıcı değeri alıyoruz.
        System.out.print("Insert number: ");
        number = scanner.nextInt();

        // Üst kısımda üçgen örneğiyle aynı işlemi yapıyoruz.
        for (int i = 0; i <= number; i++) {
            for (int j = 0; j < (number - i); j++)
                System.out.print(" "); //üst taraftaki boşlukları belirledik
            for (int y = 1; y <= (2 * i - 1); y++)
                System.out.print("*"); //üst kısımdaki yıldız sayılarını belirledik
            System.out.println();}

        // Alt kısımda tekrarın nden 1 eksik olması ve tekrarın azalarak gitmesi gerekiyor ki döngü sonlanabilsin.
        for (int i = number - 1; i > 0; i--) {
            for (int j = 1; j <= (number - i); j++)
                System.out.print(" "); //Alt taraftaki boşlukları belirledik
            for (int y = 1; y <= (2 * i - 1); y++)
                System.out.print("*"); //Alt kısımdaki yıldız sayılarını belirledik
            System.out.println();}
    }}



