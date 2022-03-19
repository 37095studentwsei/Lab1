package pl.lublin.wsei.java.cwiczenia;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	System.out.println("Hello Java World\n"); //komentarz
    System.out.println("Ala ma kota");

    int a =3;
    double b =4.21;
    String s = "Nazywalismy to: \"witamina B3\"";

    System.out.printf("a = %d,b = %f, s= %s %n",a,b,s);

        System.out.print("ala");
        System.out.print("ma");
        System.out.print("kota");

        System.out.println("ala");
        System.out.println("ma");
        System.out.println("kota");

        System.out.print("ala\n");
        System.out.print("ma\n");
        System.out.print("kota\n");

        System.out.printf("%s",s);

        Scanner input = new Scanner(System.in);
        int num1=0, num2=0;
        do {
            System.out.print("Podaj pierwsza liczbe");
            num1 = input.nextInt();
            System.out.print("Podaj druga liczbe");
            num2 = input.nextInt();

            if (num1 == 0) break;
            System.out.printf("Wynik dodawania %d + %d = %d%n,",num1,num2,num1+num2);
        }while (true);


        }


    }

/**
 * @author Jakub Cieżko
 * @verison 1.0
 **/