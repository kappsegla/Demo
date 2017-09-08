package se.newton.martin.animalgame;

public abstract class Mammal {
    private boolean hungry;

    public Mammal(boolean hungry)
    {
        this.hungry = hungry;
    }

    public abstract void talk();

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

