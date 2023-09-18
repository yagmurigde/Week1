import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N, sayi;
        int enbuyuk=0;


        System.out.println("Kaç tane sayı gireceksiniz? ");
        N = scan.nextInt();


        //Kaç sayı gireceğiz onu soruyoruz.
        for (int i = 1; i <= N; i++) {
            System.out.println(i + ". sayıyı giriniz: ");
            sayi = scan.nextInt();
            if (sayi>enbuyuk){enbuyuk=sayi;}}
        System.out.println("En büyük sayı: " + enbuyuk);

        }}