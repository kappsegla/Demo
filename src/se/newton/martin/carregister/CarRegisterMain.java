package se.newton.martin.carregister;

import java.util.ArrayList;
import java.util.Scanner;

public class CarRegisterMain {

    ArrayList cars = new ArrayList();
    ArrayList persons = new ArrayList();
    Menu mainmenu;
    Menu personmenu;
    Menu carmenu;

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
        mainmenu = new Menu(new String[]{"Lista alla Bilar", "Lista alla Personer", "Hantera bilar","Hantera personer", "Avsluta"});
        personmenu = new Menu(new String[]{"Lägg till ny person", "Ta bort person", "Huvudmeny"});
        carmenu = new Menu(new String[]{"Lägg till ny bil", "Ta bort bil", "Ändra bil" ,"Huvudmeny"});
    }

    public void start() {

        Scanner sc = new Scanner(System.in);
        init();

        do {
            mainmenu.showMenu();

            switch (sc.nextInt()) {
                case 0:
                    //Print all cars
                    System.out.println(cars);
                    break;
                case 1:
                    //Print all persons
                    System.out.println(persons);
                    break;
                case 2:
                    //Show menu for modifying persons
                    personmenu(sc);
                    break;
                case 3:
                    //Show menu for modifying cars
                    carsmenu(sc);
                    break;
                    case 4:
                    //Avsluta
                    return;
                default:
                    break;
            }
        } while (true);
    }

    private void carsmenu(Scanner sc) {
        do {
            carmenu.showMenu();

            switch (sc.nextInt()) {
                case 0:
                    //Skapa ny bil

                    break;
                case 1:
                    //Ta bort bil
                    System.out.println("Ange bil att ta bort: ");
                    cars.remove(sc.nextInt());
                case 2:
                    //Åter till huvudmeny
                    return;
                default:
                    break;
            }
        } while (true);
    }

    private void personmenu(Scanner sc) {
        do {
            personmenu.showMenu();

            switch (sc.nextInt()) {
                case 0:
                    //Skapa ny person
                    System.out.println("Namn:");
                    String name = sc.next();
                    System.out.println("Age:");
                    int age = sc.nextInt();
                    persons.add(new Person(name, age));
                    break;
                case 1:
                    //Ta bort person
                    System.out.println("Ange person att ta bort: ");
                    persons.remove(sc.nextInt());
                case 2:
                    //Åter till huvudmeny
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
