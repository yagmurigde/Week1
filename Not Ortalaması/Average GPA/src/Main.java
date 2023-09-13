import java.util.Scanner;
public class Main {
    public static void main(String[] args) { //Değişkenleri tanımlıyoruz.
        int mat, fiz, kimya, tur, tarih, muzik ;
        //Daha sonra Scanner sayfamızı tanımlıyoruz.
        Scanner grade = new Scanner (System.in);
        //Kullanıcı değerlerini her bir değişken için alacağız.
        System.out.print("Matematik notunu giriniz: ");
        mat = grade.nextInt();

        System.out.print("Fizik notunu giriniz: ");
        fiz = grade.nextInt();

        System.out.print("Kimya notunu giriniz: ");
        kimya = grade.nextInt();

        System.out.print("Türkçe notunu giriniz: ");
        tur = grade.nextInt();

        System.out.print("Tarih notunu giriniz: ");
        tarih = grade.nextInt();

        System.out.print("Müzik notunu giriniz: ");
        muzik = grade.nextInt();

        //Notların toplamını alıyoruz.
        int notToplami = (mat + fiz + kimya + tur + tarih + muzik) ;
        System.out.println("Notlarınızın toplamı: " + notToplami);

        //Notların ortalamasını alıyoruz. Total GPA /# of courses = Average GPA
        double notOrtalamasi = notToplami/6 ;
        System.out.println("Not ortalamanız: " + notOrtalamasi);

        //Koşullarımızı yazalım. Eğer not ortalamamız 60tan büyükse Sınıfı Geçiyoruz, küçük eşitse Sınıfta Kalıyoruz.
        //Bir diğer alternatif ise kalma şartını yazmak notOrtalamasi <=60 Kaldı : Geçti olarak da bakılabilir.
        boolean gecmeSarti = notOrtalamasi > 60;
        String str = (gecmeSarti) ? "Sınıfı Geçti" : "Sınıfta Kaldı" ;

        //Sınıf geçme statüsünü gösterelim.
        System.out.println("Geçme Statüsü: " + str);


    }}