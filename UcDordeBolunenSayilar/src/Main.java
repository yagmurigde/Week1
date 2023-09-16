import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int a;
        int toplam = 0;
        int adet = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen sayıyı giriniz: ");
        a =input.nextInt();

        for (int i = 0; i <=a ; ++i) {if (i%3 ==0 && i%4 ==0) {
            toplam+=i;
            ++adet;}}
        if (adet>0) { double ortalama = toplam/adet ;
            System.out.println("Sayıların ortalaması: " + ortalama);}
        else {
            System.out.println("0");}






    }
}