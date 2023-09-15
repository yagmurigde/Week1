import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int heat;
        Scanner inp = new Scanner(System.in);
        System.out.print("Insert heat: ");
        heat=inp.nextInt();
        if (heat<5){
            System.out.print("Acitivity name: Ski");}
        else if (heat>5 && heat<15) {
            System.out.print("Activity name: Cinema");}
        else if (heat>15 && heat<25) {System.out.print("Activity name: Picnic");}
        else {System.out.print("Activity name: Swimming");}

        }

    }

