package se.newton.martin;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Car {
    private int weight;
    private int seats;
    private int fuelAmount;
    private double mpg;
    private boolean[] seatOccupation;


    //Default Constructor
    //Used for initialization. No returntype, Same name as Class
    //If not written, compiler creates automatically.
    public Car() {
        seats = 5;
        seatOccupation = new boolean[seats];
    }


    //Setter method for weight in kg
    public void setWeight(int weight) {
        if (weight > 0 && weight <= 3500)
            this.weight = weight;
    }

    //Getter method for weight
    public int getWeight() {
        return weight;
    }

    public void setSeats(int seats) {
        if (seats > 0 && seats <= 9 && this.seats != seats) {
            this.seats = seats;

            seatOccupation = Arrays.copyOf(seatOccupation,this.seats);
            //copyOf array with our code...
            /*boolean[] oldSeatsArray = seatOccupation;
            seatOccupation = new boolean[this.seats];
            for (int i = 0; i < oldSeatsArray.length && i < seatOccupation.length; i++) {
                seatOccupation[i] = oldSeatsArray[i];
            }*/
        }
    }

    public int getSeats() {
        return seats;
    }

    public int getFuelAmount() {
        return fuelAmount;
    }

    public void setFuelAmount(int fuelAmount) {
        this.fuelAmount = fuelAmount;
    }

    public double getMpg() {
        return mpg;
    }

    public void setMpg(double mpg) {
        this.mpg = mpg;
    }

    public double getRange() {
        return fuelAmount / mpg;
    }

}
