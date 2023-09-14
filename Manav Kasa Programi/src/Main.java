import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    //Sabit değerleri ve değişkenlerimizi tanımlayalım.
    double armut=2.14, elma=3.67 , domates=1.11 , muz=0.95 , patlican=5.00, toplam ;
    int armutkg, elmakg, domateskg, muzkg, patlicankg;
    Scanner input = new Scanner(System.in);
    //Değişkenlerimiz için müşteriden hangi üründen hangi miktarda olacağını öğrenelim.
        System.out.print("Kaç kilo armut alındı? : ");
        armutkg=input.nextInt();
        System.out.print("Kaç kilo elma alındı? : ");
        elmakg=input.nextInt();
        System.out.print("Kaç kilo domates alındı? : ");
        domateskg=input.nextInt();
        System.out.print("Kaç kilo muz alındı? : ");
        muzkg=input.nextInt();
        System.out.print("Kaç kilo patlıcan alındı? : ");
        patlicankg=input.nextInt();
        //Toplam tutarı hesaplayalım ve yazdıralım.
        toplam = ((armutkg*armut)+(elmakg*elma)+(domateskg*domates)+(muzkg*muz)+(patlicankg*patlican));
        System.out.print("Toplam tutar: " + toplam + " TL");





    }
}