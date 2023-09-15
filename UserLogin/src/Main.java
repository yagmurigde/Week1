import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        //Değişkenlerimizi tanımlayalım.
        String userName, password, resetChoice, newPassword ;

        //Scanner sınıfını tanımlıyoruz.
        Scanner input = new Scanner(System.in);

        //Kullanıcıya username ve şifresi girişini yaptırıyoruz.
        System.out.print("Username: ");
        userName = input.nextLine();

        System.out.print("Password: ");
        password = input.nextLine();

        //Kullanıcı adının ve şifrenin doğruluğunu kontrol edeceğiz. Kullanıcı adı: Patika , şifre: java123
        if (userName.equals("Patika") && password.equals("java123")) {
            System.out.println("You are successfully logged in!");

        } //Şifrenin yanlış girildiği durumda uyarı verip şifre resetlemek isteniyor mu istenmiyor mu soracağız.
        else {
            System.out.println("Password is incorrect! Try again or reset: ");
            System.out.println("try again, reset:");
            resetChoice = input.nextLine();
            switch (resetChoice) {
                case "try again" : //Şifre tekrar girilmek isteniyor.
                    System.out.println("Try again: ");
                    break;

                default: //Şifre resetlenmek isteniyor.
                    System.out.println("New Password: ");
                    newPassword = input.nextLine();
                    if (newPassword.equals(password)) {
                        System.out.println("Password is not created, try again!");}
                    else {
                        System.out.println("New password is created!");}
                    break;}


        }

    }
}