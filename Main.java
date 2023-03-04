import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String name="Irmak",ps="1234";
        String usurName,password,reset;


       Scanner input =new Scanner(System.in);
       System.out.print("Kullanıcı Adını Giriniz :");
       usurName = input.nextLine();
       System.out.print("Şifrenizi Giriniz :");
       password= input.nextLine();

         if (usurName.equals(name) && password.equals(ps)) {
             System.out.print("Giriş Yapıldı.");
        }
        else{
             System.out.println("Yanlış Kullanıcı Adı Veya Şifre !");
             System.out.print("Şifrenizi Sıfırlamak İster Misiniz ?\nEvet(1)\nHayır(2)");
            reset = input.nextLine();

              switch (reset) {
                  case "1" : System.out.print("Yeni Şifrenizi Girin :") ;
                      password = input.nextLine();
                      if(password.equals(ps)){
                          System.out.print("Eski Şifreyle Aynı Oılamaz...");
                      }
                      else {
                          System.out.print("Yeni Şifre Olusturuldu.");
                      }
                      break;
                  case "2" :
                      System.out.print("Sifirlama İptal Edildi...");
                      break;
                  default:
                      System.out.print("Gecersiz Giris Yapildi...");


              }
        }
        }
    }
    www.patika.dev
