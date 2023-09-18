import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number;
        int toplam = 0;

        System.out.println("Insert number: ");
        number=scan.nextInt();

        for (int i=1 ; i<number;i++) { if (number%i==0){toplam+=i;}}
        if (toplam==number) {
            System.out.println(number + " bir mükemmel sayıdır.");
        }else {
            System.out.println(number + " bir mükemmel sayı değildir.");}}}