import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        //Değişkenimizi tanımlayalım.
        int year;

        //Scanner sınıfı oluşturalım.
        Scanner input = new Scanner(System.in);

        //Yıl değeri girdirelim.
        System.out.print("Yıl: ");
        year=input.nextInt();

        int dordunkati =year%4;
        int yuzunkati =year%100;
        int dortyuzunkati =year%400;


        //Koşullarımızı yazalım. Yıl dördün katı olmalı, 100ün katı ise sadece 400e bölünmeli
        if (dordunkati==0) {if(yuzunkati==0){if(dortyuzunkati==0){
            System.out.print(year + " bir artık yıldır.");}
        else {
            System.out.print(year + " bir artık yıl değildir.");}}
        else {
            System.out.print(year + " bir artık yıldır.");}}}}



<<<<<<<< HEAD:Leapyear/src/Main.java
========
    }
}
>>>>>>>> origin/main:ArtikYil/src/Main.java
