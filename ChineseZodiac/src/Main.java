import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int birthyear;
        String zodiac = "";


        Scanner input = new Scanner(System.in);

        System.out.print("Insert birth year: ");
        birthyear= input.nextInt();


        switch (birthyear % 12) {
            case 0:
                zodiac = "Monkey";
                break;
            case 1:
                zodiac = "Rooster";
                break;
            case 2:
                zodiac = "Dog";
                break;
            case 3:
                zodiac = "Pig";
                break;
            case 4:
                zodiac = "Rat";
                break;
            case 5:
                zodiac = "Ox";
                break;
            case 6:
                zodiac = "Tiger";
                break;
            case 7:
                zodiac = "Rabbit";
                break;
            case 8:
                zodiac = "Dragon";
                break;
            case 9:
                zodiac = "Snake";
                break;
            case 10:
                zodiac = "Horse";
                break;
            case 11:
                zodiac = "Goat";

        }
        System.out.print("Your Chinese Zodiac is: " + zodiac);}}
