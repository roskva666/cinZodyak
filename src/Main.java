import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //DEĞİŞKENLER
        int tarih;

        //GİRDİLER

        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen Doğum Yılınızı Giriniz: ");
        tarih = input.nextInt();
        if (tarih > 2024) {
            System.out.println("Çocuğunun zodyağı şu olacak.");
        }

        switch (tarih % 12) {
            case 0:
                System.out.println("Çin Zodyağı Burcu: Maymun.");
                break;
            case 1:
                System.out.println("Çin Zodyağı Burcu: Horoz.");
                break;
            case 2:
                System.out.println("Çin Zodyağı Burcu: Köpek.");
                break;
            case 3:
                System.out.println("Çin Zodyağı Burcu: Domuz.");
                break;
            case 4:
                System.out.println("Çin Zodyağı Burcu: Fare.");
                break;
            case 5:
                System.out.println("Çin Zodyağı Burcu: Öküz.");
                break;
            case 6:
                System.out.println("Çin Zodyağı Burcu: Kaplan.");
                break;
            case 7:
                System.out.println("Çin Zodyağı Burcu: Tavşan.");
                break;
            case 8:
                System.out.println("Çin Zodyağı Burcu: Ejderha.");
                break;
            case 9:
                System.out.println("Çin Zodyağı Burcu: Yılan.");
                break;
            case 10:
                System.out.println("Çin Zodyağı Burcu: At.");
                break;
            case 11:
                System.out.println("Çin Zodyağı Burcu: Koyun.");
                break;
            default:
                System.out.println("HATALI GİRİŞ YAPTINIZ!");
                break;
        }

    }
}