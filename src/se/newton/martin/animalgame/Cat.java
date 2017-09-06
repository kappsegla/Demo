package se.newton.martin.animalgame;

public class Cat extends Mammal{

    public Cat(boolean hungry)
    {
        super(hungry);
    }

    @Override
    public void talk() {
        System.out.println("Mjau");
    }
}
