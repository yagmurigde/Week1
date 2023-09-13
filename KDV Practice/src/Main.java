import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Değişkenlerimizi tanımlıyoruz.
        double anapara, kdvli, kdvtutari;
//Scanner sayfamızı tanımlıyoruz.
        Scanner input = new Scanner(System.in);
        //anapara miktarını giriyoruz.
        System.out.print("Anapara tutarını giriniz: ");
        anapara = input.nextDouble();
        //anapara tutarı 0 ile 1000 arasında ise KDV oranı %18; 1000 üzeri ise %8 olmalı.
        if(anapara>0&&anapara<1000){kdvtutari=anapara*0.18;
            System.out.println("KDV tutarı: " + kdvtutari);
            System.out.println("KDVLi tutar: " + (anapara+kdvtutari));}
        else if (anapara>=1000) {kdvtutari=anapara*0.08;
            System.out.println("KDV tutarı: " + kdvtutari);
            System.out.println("KDVLi tutar: " + (anapara+kdvtutari));}
            
        }
    }