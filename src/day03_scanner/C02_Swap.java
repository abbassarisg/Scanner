package day03_scanner;

public class C02_Swap {
    public static void main(String[] args) {


        int sayi1 = 10;  //kod çalıştıktan sonra sayi1=20, sayi2=10 olsun
        int sayi2 = 20;
        int sayi3 = 0;

        sayi3 = sayi2;

        sayi2 = sayi1;

        sayi1 = sayi3;

        System.out.println("sayi1= " + sayi1);
        System.out.println("sayi2= " + sayi2);


    }
}
