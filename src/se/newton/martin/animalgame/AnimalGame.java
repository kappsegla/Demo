package se.newton.martin.animalgame;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class AnimalGame {

    //Create a static random objekt for use in all methods.
    private static Random random = new Random();

    public static void main(String[] args) {
        ArrayList<Mammal> animals = initialize();

        //Spela 4 rundor
        for (int i = 0; i < 4; i++) {
            takeTurn(animals);
        }

        System.out.println("You are done playing with the Mammals!");

    }

    public static ArrayList<Mammal> initialize() {
        //Skapa en ny ArrayList
        ArrayList<Mammal> array = new ArrayList<>();
        //Slumpa antalet djur mellan 1 och 10
        int antal = random.nextInt(10)+1;

        for (int i = 0; i < antal; i++) {
            //Skapa djuren av slumpmässig typ
            int type = random.nextInt(3)+1;
            //Slupma om djuret från början ska vara hungrigt eller inte 50% chans
            boolean hungry = random.nextBoolean();

            switch (type) {
                case 1:
                    array.add(new Cat(hungry));
                    break;
                case 2:
                    array.add(new Dog(hungry));
                    break;
                case 3:
                    array.add(new Duck(hungry));
                    break;
            }
        }
        return array;
    }

    private static void takeTurn(ArrayList<Mammal> animals) {

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < animals.size(); i++) {
            //Anropa alla djurs talk()
            animals.get(i).talk();
            //Låt djuren även meddela om de är hungriga
            if (animals.get(i).isHungry()) {
                System.out.println("  - Is hungry!");
            }
        }
        //Be användaren trycka enter för att mata djuren
        System.out.println("Press enter to feed your animals");
        sc.nextLine();


        for (Mammal m : animals ) {
            //Mata alla djuren
            m.feed();

            //Slumpa vilka djur som ska vara hungriga
            boolean hungry = random.nextBoolean();
            m.setHungry(hungry);
        }
    }


}
