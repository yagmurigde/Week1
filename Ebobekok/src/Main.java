import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        /*Bu pratiği öklid algoritması ile yapacağız. Yani n1 ve n2 sayılarının en büyük ortak
        böleni n1-n2 yi de tam bölecektir. Örnek: n1=18 ve n2=24 olsun. 24-18=6, 18-6=12, 12-6=6, 6-6=0
        Bu işlemi daha büyük sayılar için yapamayacağımız için kalan 0 olana kadar döngüde sürekli
        mod aldırıyoruz. Son kalan bizim ebobumuz oluyor.*/

        int n1, n2;
        int ebob, ekok, pay, payda, kalan;

        System.out.print("n1 değerini giriniz: ");
        n1 =scan.nextInt();

        System.out.print("n2 değerini giriniz: ");
        n2 =scan.nextInt();

        if (n1>n2){pay=n1; payda=n2;}
        else {pay=n2 ; payda=n1;}

        kalan=pay%payda;

        while (kalan!=0) {
            pay = payda;
            payda = kalan;
            kalan = pay % payda;
        }
        ebob = payda;
        System.out.println("EBOB: " + ebob);
    ekok = (n1*n2)/ebob;
        System.out.println("EKOK: " + ekok);}}

