package se.newton.martin;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Uppgift 1: Behåll endast en decimal av inläst tal.
        System.out.print("Ange ett decimaltal? ");

        Scanner sc = new Scanner(System.in);
        double number = sc.nextDouble();

        double oneDecimal = (int)(number * 10)/ 10.0;

        System.out.println(oneDecimal);

        //Uppgift2: Summera individuella siffrorna i inläst tal. 123 -> 6
        System.out.print("Ange ett tal mellan 1-999?");
        int tal = sc.nextInt();

        int firstDigit = tal %10;
        int remainingNumber = tal/10;
        int secondDigit = remainingNumber % 10;
        remainingNumber = remainingNumber / 10;
        int thirdDigit = remainingNumber % 10;

        System.out.println(firstDigit + secondDigit + thirdDigit);

        //Uppgift3: Beräkna BMI
        System.out.print("Ange din längd: ");

        double length = sc.nextDouble();

        System.out.print("Ange din vikt: ");

        double weight = sc.nextDouble();

        double BMI = weight / (length * length);

        System.out.println(BMI);
    }

    public short getNumberOfTheBeast() {
        return 666;
    }
}
