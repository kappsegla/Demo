package se.newton.martin.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Undantag {
    public static void doSometing() throws Exception {
        System.out.println("Another round");

        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();
        if(value == 0)
            throw new MyException(value);
        int i = 3 / value;


    }

    public static void main(String[] args) {
        try {
            doSometing();
            //Massa kodrader
            throw new Exception("Thrown just to move us to the catch");
            //Massa mer kodrader
        }
        catch(InputMismatchException ipx){
            System.out.println("Use a number");
        }catch(ArithmeticException arex){
            System.out.println(arex.getMessage());
        }catch(Exception e){
            System.out.println(e);
        }
        finally {
            System.out.println("This code will always run!");
        }

//        System.out.println("Another round");
//        try {
//            Scanner sc = new Scanner(System.in);
//            int value = 0;
//            try {
//                value = sc.nextInt();
//            }catch(InputMismatchException ipx){
//                System.out.println("Use a number");
//            }
//
//            int i = 3 / value;
//        } catch (ArithmeticException arex) {
//            System.out.println(arex.getMessage());
//        }
    }
}
