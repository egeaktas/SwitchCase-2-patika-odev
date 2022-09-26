import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        String sifre = "pass", sifre_input, yeni_sifre, select;

        System.out.print("Şifre: ");
        sifre_input = input.nextLine();

        if(sifre_input.equals(sifre)){
            System.out.println("Şifre doğru, sisteme girdiniz.");
        }else{
            System.out.println("Şifrenizi sıfırlamak istiyor musunuz? (Y/N)");
            select = input.nextLine();

        if(select.equals("N")){
            System.out.println("Şifre hatalı. Girmek için şifrenizi değiştirmelisiniz.");
            }else if (select.equals("Y")){
                System.out.println("Yeni şifrenizi giriniz: ");
                yeni_sifre = input.nextLine();
                if((yeni_sifre.equals(sifre)) || (yeni_sifre.equals(sifre_input))){
                    System.out.println("Şifreniz eski şifrenizle veya hatalı olarak girdiğiniz şifrenizle aynı olamaz.");
                }else{
                    System.out.println("Yeni şifreniz oluşturuldu.");
                    sifre = yeni_sifre;
                }
            }else{
            System.out.println("Seçeneğiniz Y ve N'den başka bir şey olamaz.");
        }
        }

    }
}