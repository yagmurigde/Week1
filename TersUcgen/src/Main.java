import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //N basamak sayısı olsun.
        System.out.println("Insert number: ");
        int N = scan.nextInt();

        /*Üçgeninimiz sağ ve sol olmak üzere iki simetrik parça olarak düşünelim.
        Bu sebeple N değerini ikiyle çarparak sağ ve sol olmak üzere iki üçgen yapmış olduk.*/

        for(int i=2*N ; i>0 ; i--) {
            for (int b = 0; b < (2*N-i); b++) {
                System.out.print(" ");
            }
        for (int y = 1 ; y< (2*i-2*N); y++) {
            System.out.print("*");
              }

        System.out.println(" ");



    }
}}