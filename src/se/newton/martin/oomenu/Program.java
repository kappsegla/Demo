package se.newton.martin.oomenu;

public class Program {

    private Menu menu;

    public void start()
    {
        //Initiera menu
        menu = new Menu();
        menu.add("Alternativ 1", () -> System.out.println("Du valde alternativ 1" + menu.textalternativ.size()));
        menu.add("Alternativ 2", () -> System.out.println("Du valde alternativ 2"));
        menu.add("Alternativ 3", new MenuOption() {
        @Override
        public void execute() {
            System.out.println("Du valde alternativ 3");
        }
    });
        menu.add("Alternativ 4", new Alt4MEnuOption());
        menu.add("Alternativ 5", this::alt5);
        menu.add("Alternativ 6", Program::alt6static);


        MenuOption menuOption = this::alt5;
        menuOption.execute();

        while(true) {
            //Visa menu och gör val
            menu.show();
            menu.execute(menu.val());
        }
    }

    public void alt5(){
        System.out.println("Alternativ 5");
    }
    public static void alt6static()
    {

    }

    public static void main(String[] args) {
        new Program().start();
    }
}
