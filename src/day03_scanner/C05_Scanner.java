package day03_scanner;

import java.util.Scanner;

public class C05_Scanner {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen 1. sayıyı giriniz");
        double sayi1= scan.nextDouble();

        System.out.println("Lütfen 2. sayıyı giriniz");
        double sayi2= scan.nextDouble();
        System.out.println("carpım= " +(sayi1 * sayi2));
    }}
