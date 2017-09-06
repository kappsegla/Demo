package se.newton.martin.Ovning2;

public class Main {
    public static void main(String[] args){
        //Ett sätt
        Hus huset = new Hus(2);
        Person martin = new Person(huset);
        System.out.println(huset.getFloors());
        Person kalle = new Person(huset);

        System.out.println(Person.getCount());

        //Ett annat sätt
        //Person martin = new Person(new Hus(2));
        //System.out.println( martin.getHus().getFloors() );

        System.out.println(martin.getAge());
        martin.increaseAgeByOneYear();
        System.out.println(martin.getAge());

        huset.setValue(2000000);
        System.out.println(huset.getValue());

        for (int i = 0; i < 10; i++) {
            huset.increaseValue();
            System.out.println(huset.getValue());
        }
    }
}
