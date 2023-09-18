import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N;
        int enbuyuk=0, enkucuk=0;


        System.out.println("Kaç tane sayı gireceksiniz? ");
        N = scan.nextInt();


        //Kaç sayı gireceğiz onu soruyoruz.
        for (int i = 1; i <= N; i++) {
            System.out.println(i + ". sayıyı giriniz: ");
            int sayi = scan.nextInt();
            if (i==1){ enbuyuk=sayi; enkucuk=sayi;}
            if (sayi>enbuyuk){enbuyuk=sayi;}
            if (sayi<enkucuk){enkucuk=sayi;}}
        System.out.println("En büyük sayı: " + enbuyuk);
        System.out.println("En büyük sayı: " + enkucuk);

        }}