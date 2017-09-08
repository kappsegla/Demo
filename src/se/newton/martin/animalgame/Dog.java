package se.newton.martin.animalgame;

public class Dog extends Mammal implements IPet{
    public Dog(boolean hungry)
    {
        super(hungry);
    }
    @Override
    public void talk() {
       System.out.println("Voff");
    }

    @Override
    public boolean isCute() {
        return false;
    }
}
