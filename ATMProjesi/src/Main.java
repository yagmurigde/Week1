import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        //Kullanıcıdan alacağımız değişkenlerimizi ve sabit parametreleri tanımlayalım.
        int withdraw, money;
        int balance = 3000;
        int select;
        int right=3;
        String userName, password;



        //Scanner nesnesini tanımlayalım.
        Scanner scan = new Scanner(System.in);

        System.out.println( "Hoşgeldiniz! Lütfen kullanıcı adınızı ve şifrenizi giriniz. ");



        //Deneme hakkını 3 olarak tanımlıyoruz ve döngüyü tanımlıyoruz.
        while (right > 0) {
            System.out.println("Kullanıcı adınız: ");
            userName=scan.nextLine();
            System.out.println("Şifreniz: ");
            password=scan.nextLine();

                if (userName.equals("yagmurigde") && password.equals("java123")) { //Şifre ve kullanıcı adı doğru ise
                    System.out.println("Giriş Başarılı!");

                    do {
                        System.out.println("1-Para Yatırma");
                        System.out.println("2-Para Çekme");
                        System.out.println("3-Bakiye Sorgula");
                        System.out.println("4-Çıkış Yap");
                        System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz: ");
                        select = scan.nextInt();

                        switch (select) {
                            case 1:
                                System.out.print("Yatırmak istediğiniz para miktarını giriniz: ");
                                money = scan.nextInt();
                                balance += money;
                                break;

                            case 2:
                                System.out.print("Çekmek istediğiniz para miktarını giriniz: ");
                                withdraw = scan.nextInt();
                                if (withdraw>balance) {
                                   System.out.println("Bakiyeniz yetersizdir.");
                                } else {
                                    balance -= withdraw;}
                                break;

                            case 3:
                                System.out.println("Bakiyeniz: " + balance);
                                break;

                            case 4:
                                System.out.println("İyi günler!");
                                break;

                            default:
                                System.out.println("Lütfen tekrar deneyiniz!");
                                break;
                        }
                    } while (select != 4);

                    break;
                } else { //Şifre ya da kullanıcı adı yanlış ise:
                    right--;
                    System.out.println("Hatalı kullanıcı adı veya şifre! Lütfen tekrar deneyiniz.");
                    if (right == 0) {
                        System.out.println("Hesabınız bloke olmuştur. Lütfen banka ile iletişime geçiniz.");
                    } else {
                        System.out.println("Kalan Deneme Hakkınız: " + right);
                    }
                }
            }
        }
    }