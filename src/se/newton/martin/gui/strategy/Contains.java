package se.newton.martin.gui.strategy;

public class Contains implements FilterStrategy {

    private String filtertext;

    public Contains(String filtertext){
        this.filtertext = filtertext;
    }

    @Override
    public boolean filter(String s) {
        return s.contains(filtertext);
    }
}
