package day03_scanner;

import java.util.Scanner;

public class C06_scanner {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        System.out.println("Lütfen isminiz giriniz: ");
        String isim= scan.nextLine();

        System.out.println("Lütfen isminiz giriniz: ");
        String soyisim=scan.nextLine();

        System.out.println("Lütfen Yaşınızı Giriniz: ");
        int yas= scan.nextInt();

        System.out.println("Girilen bilgiler = "+isim+ " "+soyisim+ " "+yas );
    }
}
