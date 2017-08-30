package se.newton.martin;

public class CarRegisterMain {
    public static void main(String[] args){

        System.out.println("Välkommen till bilregistret.");
        Car wagon = new Car();
        wagon.setWeight(2000);
        wagon.setFuelAmount(50);
        wagon.setMpg(1.0);

        Car sportscar = new Car();
        sportscar.setSeats(2);
        sportscar.setWeight(1000);
        sportscar.setFuelAmount(50);
        sportscar.setMpg(2.0);

        System.out.println("Wagon");
        System.out.println("Seats: " + wagon.getSeats());
        System.out.println("Weight: " + wagon.getWeight());
        System.out.println("Sportscar");
        System.out.println("Seats: " + sportscar.getSeats());
        System.out.println("Weight: " + sportscar.getWeight());
        System.out.println("Range: " + sportscar.getRange());

        sportscar.setFuelAmount(30);
        System.out.println("Range: " + sportscar.getRange());


//        Car wagon2 = wagon;
//        wagon2.seats = 6;
//        System.out.println("Seats: " + wagon.seats);
    }
}
