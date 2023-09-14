import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Değişkenlerimizi tanımlıyoruz.
        int r, alpha;
        double pi = 3.14, daireDilimi;
        Scanner input = new Scanner(System.in);
        //Kullanıcıya değerleri tanımlatalım.
        System.out.print("Daire yarıçapını giriniz: ");
        r = input.nextInt();
        System.out.print("Dairenin merkez açısını giriniz: ");
        alpha=input.nextInt();
        //Formülümüzü yazalım.
        daireDilimi = (pi*(r*r)*alpha) / 360;
        System.out.print("Daire diliminin alanı: " +daireDilimi);


    }
}