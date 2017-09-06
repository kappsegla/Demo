package se.newton.martin.animalgame;

public class Cat extends Mammal{

    public Cat()
    {
        setHungry(true);
    }

    @Override
    public void talk() {
        super.talk();
        System.out.println("Mjau");
    }
}
