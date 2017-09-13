package se.newton.martin.ovning2;

public class Hus {
    private int floors;
    private long value;

    public Hus(int floors){
        this.setFloors(floors);
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    public long getValue() {
        return value;
    }

    public void setValue(long value) {
        this.value = value;
    }

    public void increaseValue() {
        value = (long)(value * 1.05);
    }

}
