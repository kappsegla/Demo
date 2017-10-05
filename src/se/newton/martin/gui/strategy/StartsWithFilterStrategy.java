package se.newton.martin.gui.strategy;

public class StartsWithFilterStrategy implements FilterStrategy {

    private String filtertext;

    public StartsWithFilterStrategy(String filtertext){
        this.filtertext = filtertext;
    }

    @Override
    public boolean filter(String s) {
        return s.startsWith(filtertext);
    }
}
