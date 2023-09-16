import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int n, k;
        int total = 1;

        Scanner scan = new Scanner(System.in);

        System.out.println("Üssü alınacak sayıyı giriniz: ");
        n =scan.nextInt();

        System.out.println("Üs değerini giriniz: ");
        k =scan.nextInt();

        for(int i=0; i<k; i++){total*=n;}
        System.out.println("Sonuç: " + total);

    }
}