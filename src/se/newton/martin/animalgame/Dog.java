package se.newton.martin.animalgame;

public class Dog extends Mammal {
    public Dog(boolean hungry)
    {
        super(hungry);
    }
    @Override
    public void talk() {
       System.out.println("Voff");
    }
}
