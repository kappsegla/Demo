package se.newton.martin;

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
            seatOccupation = new boolean[this.seats];
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
