package deneme;

import java.util.Scanner;

public class HesapMakinesi {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Hesaplamak istediğiniz 2 sayıyı giriniz : ");
        double sayıBir = input.nextDouble();
        double sayıİki = input.nextDouble();
        System.out.println("Hangi işlemi yapmak istersiniz? (*,/,+,-)");
        char işlem = input.next().charAt(0);
        double sonuç;
        switch(işlem) {

            case '+':
                        sonuç = sayıBir + sayıİki;
                        System.out.println(sayıBir + "+" + sayıİki + "=" + sonuç);
                        break;

            case '-':
                        sonuç = sayıBir - sayıİki;
                        System.out.println(sayıBir + "-" + sayıİki + "=" + sonuç);
                        break;

            case '*':
                        sonuç = sayıBir * sayıİki;
                        System.out.println(sayıBir + "*" + sayıİki + "=" + sonuç);
                        break;

            case '/':
                        sonuç = sayıBir / sayıİki;
                        System.out.println(sayıBir + "/" + sayıİki + "=" + sonuç);
                        break;

            default : System.out.println("Çarpma, bölme , çıkarma"
                            + "veya toplama işlemi seçiniz.");
        }
        input.close();

    }
}
