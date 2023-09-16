import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        //Değişkenlerimizi tanımlıyoruz.
        int age, km, type;
        double perkm=0.1, total;


        //Scanner sınıfını tanımlıyoruz.
        Scanner input = new Scanner(System.in);

        //Değişkenlerimiz için değer girdiriyoruz.
        System.out.print("Insert age: ");
        age = input.nextInt();

        System.out.print("Insert distance: ");
        km = input.nextInt();

        System.out.print("Insert flight type 1-One way 2-Return: ");
        type = input.nextInt();

        total = km * perkm;


        // Koşullarımızı yazıyoruz.


        if (age>0 && km>0)
        {if (type==1){
                if(age<12) {
                    System.out.print("Total: " + (total*0.5));
                }
                else if (age>=12 && age<24) {
                    System.out.print("Total: " + (total*0.9));}
                else if (age>65) {
                    System.out.print("Total: " + (total*0.7));}
                else {
                    System.out.print("Total: " +total);}}
            else if (type==2){
               if(age<12) {
                   System.out.print("Total: " + (2*total*0.5)*0.8);}
               else if (age>=12 && age<24){
                   System.out.print("Total: " + (2*total*0.9)*0.8);}
               else if (age>65) {
            System.out.print("Total: " + (2*total*0.7)*0.8);}
               else {
            System.out.print("Total: " + (2*total*0.8));}}
            else {
                System.out.println("Invalid flight type. Try again."); }}
        else {
            System.out.println("Error. Try again.");}}}


