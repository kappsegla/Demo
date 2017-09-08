package se.newton.martin.animalgame;

public class Cat extends Mammal implements IPet {

    public Cat(boolean hungry)
    {
        super(hungry);
    }

    @Override
    public void talk() {
        System.out.println("Mjau");
    }

    @Override
    public boolean isCute() {
        return true;
    }
}
