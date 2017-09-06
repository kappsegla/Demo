package se.newton.martin.animalgame;

public class Mammal {
    private boolean hungry;

    public void talk(){
        if(isHungry())
            System.out.print("Hungrig ");
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
