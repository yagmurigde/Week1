import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        //Değişkenlerimizi tanımlıyoruz.
        int n1, n2, select;

        Scanner input = new Scanner(System.in);

        //Değişkenlerimize girilecek değerleri soralım.
        System.out.print("Lütfen n1 değerini giriniz: ");
        n1 = input.nextInt();

        System.out.print("Lütfen n2 değerini giriniz: ");
        n2 = input.nextInt();

        //Yapacağımız seçimleri girelim.

        System.out.println("1-Toplama \n2-Çıkarma \n3-Çarpma \n4-Bölme");
        System.out.println("Seçiminizi yapınız: ");
        select = input.nextInt();

        //Switch caselerimizi belirleyelim.
        switch (select) {
            case 1 :
                // seçim 1 ise toplama işlemi yapılacak.
                System.out.print("Toplama işleminin sonucu: " + (n1+n2));
                break;

            case 2 :
                // seçim 2 ise çıkarma işlemi yapılacak.
                System.out.print("Çıkarma işleminin sonucu: " + (n1-n2));
                break;

            case 3 :
                // seçim 3 ise çarpma işlemi yapılacak.
                System.out.print("Çarpma işleminin sonucu: " + (n1*n2));
                break;

            case 4 :
                // seçim 4 ise bölme işlemi yapılacak. Bu durumda n2 değerinin sıfırdan farklı bir değer olması gerekiyor.
                switch (n2) {
                    case 0 :
                        // Tanımsız gelecektir.
                        System.out.print("Bir sayı sıfıra bölünemez, sonuç tanımsızdır.");
                        break;

                     default:
                         //n2 değeri sıfırdan farklı ise bölme işlemi yapılacaktır.
                         System.out.print("Bölme işleminin sonucu: " + (n1/n2));
                         break;}
                break;

            default:
                //Birden dörde bir işlem seçilmemişse yanlış seçim yapıldığına dair uyarı gider.
                System.out.print("Yanlış seçim yaptınız. Lütfen tekrar deneyiniz.");


        }

    }
}