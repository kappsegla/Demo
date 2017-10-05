package se.newton.martin.gui.strategy;

public class ShowAll implements FilterStrategy {
    @Override
    public boolean filter(String s) {
        return true;
    }
}
