package se.newton.martin.animalgame;

import java.util.ArrayList;

public class AnimalGame {
    public static void main(String[] args)
    {
        ArrayList<Mammal> animals = new ArrayList<>();

        animals.add( new Cat() );
        animals.add( new Cat() );
        animals.add( new Dog() );
        animals.add( new Cat() );
        animals.add(new Duck());

        for (int i = 0; i < animals.size() ; i++) {
            animals.get(i).talk();
            if( animals.get(i).isHungry()) {
                animals.get(i).feed();
                animals.get(i).talk();
            }
        }
    }

    public static ArrayList<Mammal> initialize()
    {
        //initiera ett slumpmässigt antal djur till en arraylist
        //Slumpa vilka olika djur som ska skapas
        //Slupma om djuret från början ska vara hungrigt eller inte
    }

    private static void takeTurn(ArrayList<Mammal> animals)
    {
        //Anropa alla djurs talk()
        //Låt djuren även meddela om de är hungriga
        //Be användaren trycka enter för att mata djuren
        //Mata alla djuren
        //Slumpa vilka djur som ska vara hungriga
    }



}
