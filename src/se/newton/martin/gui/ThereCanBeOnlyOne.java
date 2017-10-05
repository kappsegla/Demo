package se.newton.martin.gui;

public class ThereCanBeOnlyOne {
    private static ThereCanBeOnlyOne ourInstance = new ThereCanBeOnlyOne();

    public static ThereCanBeOnlyOne getInstance() {
        return ourInstance;
    }

    private ThereCanBeOnlyOne() {
    }


}
