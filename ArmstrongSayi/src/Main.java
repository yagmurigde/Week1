import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int number;
        int toplam = 0;



        Scanner scan = new Scanner(System.in);

        System.out.print("Sayı giriniz: ");
        number =scan.nextInt();

        int tempnumber = number; // sayı her aşamada değişeceği için geçici değer tanımlıyoruz.

        while (tempnumber != 0) { int basamak = tempnumber % 10 ; //sayının 10a bölümünden kalan basamak değerini veriyor.
            toplam += basamak; //her defasında bu sayı toplama ekleniyor.
            tempnumber /= 10;} // bölme işlemi tempnumber sıfır olana kadar devam ediyor.

        System.out.println(number + " sayısının basamak değerleri toplamı: " + toplam);

    }
}