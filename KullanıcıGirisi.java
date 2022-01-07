import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String username,password,response,newPassword;

        System.out.print("Kullanıcı adı:");
        username = input.nextLine();
        System.out.print("Şifre:");
        password = input.nextLine();

        if(username.equals("patika") && password.equals("java")){
            System.out.print("Başarılı giriş");
        }
        else {
            System.out.print("Hatalı giriş Şifrenizi sıfırlamak için evet yazınız:");
            response = input.nextLine().toUpperCase();
            if(response.equals("EVET")){
                System.out.print("Yeni Şifre:");
                newPassword = input.nextLine();
                while(newPassword.equals("java") || newPassword.equals(password)){
                    System.out.print("Hatalı şifre yeni şifre giriniz:");
                    newPassword = input.nextLine();
                }
                System.out.print("Başarılı şekilde sıfırlandı");
            }
        }
    }
}
