package se.newton.martin.carregister;

public class Menu {

    private String[] menuoptions;

    public Menu(String[] options) {
        menuoptions = options;
    }

    public void showMenu() {
        for (int i = 0; i < menuoptions.length; i++) {
            System.out.println(i + ". " + menuoptions[i]);
        }
    }
}
