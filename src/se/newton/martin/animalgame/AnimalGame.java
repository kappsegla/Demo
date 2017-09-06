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
        }





        /*
        Mammal cat = new Cat();
        cat.talk();

        Mammal dog = new Dog();
        dog.talk();*/



    }
}
