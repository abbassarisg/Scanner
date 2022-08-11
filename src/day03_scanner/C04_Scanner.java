package day03_scanner;

import java.util.Scanner;

public class C04_Scanner {
    public static void main(String[] args) {
        //kullanıcıdan ismşini isteyin.girilen ismi isminiz: İsmail şeklinde yazdırın

        Scanner scan= new Scanner(System.in);

        System.out.println("Lütfen isminiz giriniz: ");

        String kullaniciIsmi=scan.next();

        System.out.println("İsminiz: "+ kullaniciIsmi);




    }
}
