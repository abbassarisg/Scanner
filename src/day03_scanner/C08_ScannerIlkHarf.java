package day03_scanner;


import java.util.Scanner;

public class C08_ScannerIlkHarf {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        System.out.println("Lütfen isminizi giriniz:");

        char ilkHarf=scan.next().toLowerCase().charAt(5);
        System.out.println("İsmin ilk harfi:"+ ilkHarf);
    }
}
