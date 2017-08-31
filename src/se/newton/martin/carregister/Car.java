package se.newton.martin.carregister;

public class Car {
    private int weight;
    private int seats;
    private Person owner;

    //Default Constructor
    public Car(int seats, int weight, Person owner) {
        this.seats = seats;
        this.weight = weight;
        this.setOwner(owner);
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
        }
    }

    public int getSeats() {
        return seats;
    }

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Weight: " + weight + " Seats: " + seats;
    }
}
