import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Öncelikle değişkenlerimizi tanımlayalım.
        int a,b,c;
        double u, ucgenAlan;
        //Scanner sınıfımızı getirelim.
        Scanner triangle = new Scanner(System.in);
        //Değişkenlerimize kullanıcı değeri girdiriyoruz.
        System.out.print("1. kenar uzunluğunu giriniz: ");
        a = triangle.nextInt();
        System.out.print("2. kenar uzunluğunu giriniz: ");
        b = triangle.nextInt();
        System.out.print("3. kenar uzunluğunu giriniz: ");
        c = triangle.nextInt();
        u = (a+b+c)/2;
        //Formülümüz alan*alan=u*(u-a)*(u-b)*(u-c)
        ucgenAlan = Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.println("Üçgenimizin alanı: " + ucgenAlan);

    }
}