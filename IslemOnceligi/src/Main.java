import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b, c;

        System.out.print("a sayısını giriniz: ");
        a= input.nextInt();
        System.out.print("b sayısını giriniz: ");
        b= input.nextInt();
        System.out.print("c sayısını giriniz: ");
        c= input.nextInt();

        int sonuc = a+b*c-b;
        System.out.println(sonuc);



    }
}