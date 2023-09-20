import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Insert number: ");
        int sayi1 = scan.nextInt();
        double sayi1casting = sayi1; //integerdan doublea
        System.out.println(sayi1casting);

        System.out.print("Insert number: ");
        double sayi2 = scan.nextDouble();
        int sayi2casting = (int) sayi2; //doubledan integera
        System.out.print(sayi2casting);

    }
}