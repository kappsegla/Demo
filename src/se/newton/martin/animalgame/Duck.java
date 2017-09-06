package se.newton.martin.animalgame;

public class Duck extends Mammal {
    public Duck(boolean hungry)
    {
        super(hungry);
    }

    @Override
    public void talk() {
        System.out.println("Quack");
    }
}
