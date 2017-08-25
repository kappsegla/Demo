package se.newton.martin;

import java.util.Scanner;

public class Main2 {


    public static void gissatalet() {
        int secretNumber = (int) (Math.random() * 50) + 1;
        int yourGuess = 0;

        Scanner sc = new Scanner(System.in);

        //for( int i = 1; yourGuess != secretNumber; i++) {
        int i = 1;
        while (yourGuess != secretNumber) {
            System.out.println("Välj ett tal mellan 1-50");
            yourGuess = sc.nextInt();

            if (yourGuess == secretNumber)
                System.out.println("Grattis, du gissade rätt på " + i + " försök!");
            else if (yourGuess > secretNumber)
                System.out.println("För stort");
            else
                System.out.println("För litet");
            i++;
        }
    }

    public static void utskriftermedloop() {
        //Skriver ut: 10 20 30 40 50 60 70 80 90 100
        for (int r = 1; r <= 10; r++) {
            System.out.println(r * 10);
        }
        //Skriver ut baklänges: 10 9 8 ... 0
        for (int r = 10; r >= 0; r--) {
            System.out.println(r);
        }

        //Skriver ut alfabetet a till z med små bokstäver
        char c = 'a';
        while (c < 'z' + 1) {
            System.out.print(c);
            c++;
        }
    }

    public static int readANumber() {
        Scanner sc = new Scanner(System.in);
        int temp = sc.nextInt();
        return temp;
    }

    public static void main(String[] args) {

        while (true) {
            System.out.println("1. Gissa talet");
            System.out.println("2. Utskrift med loopar");
            System.out.println("0. Avsluta");

            switch (readANumber()) {
                case 0:
                    return;
                case 1:
                    gissatalet();
                    break;
                case 2:
                    utskriftermedloop();
                    break;
                default:
                    System.out.println("Ej giltigt val");
            }

        }
    }
}
