package se.newton.martin.carregister;

import java.util.ArrayList;
import java.util.Scanner;

public class CarRegisterMain {

    ArrayList cars = new ArrayList();
    ArrayList persons = new ArrayList();
    Menu mainmenu;

    public void init() {
        //Create some default persons
        persons.add(new Person("Martin", 40));
        persons.add(new Person("Stina", 23));
        persons.add(new Person("Olle", 57));

        //Create some default cars
        cars.add(new Car(2, 1000, (Person) persons.get(0)));
        cars.add(new Car(5, 1500, (Person) persons.get(1)));
        cars.add(new Car(4, 3500, (Person) persons.get(0)));

        //Create main menu object
        mainmenu = new Menu(new String[]{"Lista alla Bilar", "Lista alla Personer", "Avsluta"});
    }

    public void start() {

        Scanner sc = new Scanner(System.in);
        init();

        do {
            mainmenu.showMenu();

            switch (sc.nextInt()) {
                case 0:
                    System.out.println(cars);
                    break;
                case 1:
                    System.out.println(persons);
                    break;
                case 2:
                    return;
                default:
                    break;
            }
        } while (true);
    }
    public static void main(String[] args) {

        System.out.println("Välkommen till bilregistret.");
        new CarRegisterMain().start();
    }
}
