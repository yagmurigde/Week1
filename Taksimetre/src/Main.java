import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mesafe, acilisTutari=10;
        double perKm=2.20, total;
        Scanner yol = new Scanner (System.in);
        System.out.print("Gideceğiniz mesafeyi giriniz: ");
        mesafe = yol.nextInt();
        //Toplam tutarı tanımlayalım.
        total = mesafe*perKm;
        total += acilisTutari;
        total = (total<20) ? 20 : total ;
        System.out.print("Taksimetre tutarı: " + total);


    }
}