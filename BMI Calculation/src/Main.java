import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Değişkenlerimizi tanımlıyoruz.
        int weight;
        double height, bmi;
        //Scanner sınıfımızı tanımlayalım.
        Scanner input = new Scanner(System.in);
        //Değişkenlerimize değer atıyoruz.
        System.out.print("Lütfen boyunuzu (metre cinsinden) giriniz: ");
        height=input.nextDouble();
        System.out.print("Lütfen kilonuzu giriniz: ");
        weight=input.nextInt();
        //BMI(vücut kitle indeksi) formülünü yazıyoruz.
        bmi = (weight) / (height*height);
        //Sonucu yazdıralım.
        System.out.print("Vücut Kitle Indeksiniz: " + bmi);

    }
}