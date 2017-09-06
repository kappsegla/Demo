package se.newton.martin.animalgame;

public class Mammal {
    private boolean hungry;

    public Mammal(boolean hungry)
    {
        this.hungry = hungry;
    }

    public void talk(){
    }

    public boolean isHungry() {
        return hungry;
    }
    public void setHungry(boolean hungry) {
        this.hungry = hungry;
    }

    public final void feed() {
        setHungry(false);
    }
}
