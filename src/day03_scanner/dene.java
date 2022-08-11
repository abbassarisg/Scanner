package day03_scanner;


import java.util.Scanner;

public class dene {

    public static void main(String[] args) {
        Scanner tara= new Scanner(System.in);

        System.out.println("Lütfen nesneyi giriniz: ");

        char harf= tara.next().toLowerCase().charAt(3);

        System.out.println(harf);
    }
    }


