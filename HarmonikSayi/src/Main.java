import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int number;
        double result = 0;

        Scanner scan =new Scanner(System.in);

        System.out.print("Insert number: ");
        number=scan.nextInt();

        for (double i=1 ; i <= number ; i++) {
            result += (1/i);
        }
        System.out.println("Result: " + result);

    }
}