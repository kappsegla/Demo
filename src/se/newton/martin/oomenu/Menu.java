package se.newton.martin.oomenu;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    ArrayList<String> textalternativ = new ArrayList<>();
    ArrayList<MenuOption> menuOptions = new ArrayList<>();

    public void add(String s, MenuOption o) {
        textalternativ.add(s);
        menuOptions.add(o);
    }

    public void show() {
        for (int i = 0; i < textalternativ.size(); i++) {
            System.out.println(i + 1 + ". " + textalternativ.get(i));
        }

    }

    public int val() {
        System.out.print("Gör ett val: ");
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    public void execute(int val) {
        menuOptions.get(val - 1).execute();
    }
}
