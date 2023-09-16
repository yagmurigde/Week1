import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int N, r;
        int anakume=1;
        int altkume=1;
        int elemanfarki=1;

        Scanner scan = new Scanner(System.in);

        System.out.print("Anaküme eleman sayısı: ");
        N =scan.nextInt();

        System.out.print("Altküme eleman sayısı: ");
        r =scan.nextInt();

        for(int i=1; i<=N; i++) {anakume*=i;}
        for(int j=1; j<=r; j++) {altkume*=j;}
        for(int k=1; k<=(N-r); k++) {elemanfarki*=k;}

        int combination = anakume / (altkume * elemanfarki);
        System.out.println(r + " elemanlı küme kaç farklı kombinasyonda oluşur: " + combination);
    }
}