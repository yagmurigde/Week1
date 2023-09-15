import java.util.Scanner;
public class Main {
    public static void main(String[] args) {


        int math, phy, tur, che, music;
        double averageGpa;


        Scanner input = new Scanner(System.in);


        System.out.print("Math grade: ");
        math=input.nextInt();

        System.out.print("Physics grade: ");
        phy=input.nextInt();

        System.out.print("Turkish grade: ");
        tur=input.nextInt();

        System.out.print("Chemistry grade: ");
        che=input.nextInt();

        System.out.print("Music grade: ");
        music=input.nextInt();

        averageGpa=(math+phy+tur+che+music)/5;

        if(averageGpa>=55){
            System.out.println("Average GPA: " + averageGpa + " Passed");}
        else {
            System.out.print("Average GPA: " + averageGpa + " Failed");}








    }
}