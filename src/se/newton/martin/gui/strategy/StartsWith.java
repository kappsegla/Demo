package se.newton.martin.gui.strategy;

public class StartsWith implements FilterStrategy {

    private String filtertext;

    public StartsWith(String filtertext){
        this.filtertext = filtertext;
    }

    @Override
    public boolean filter(String s) {
        return s.startsWith(filtertext);
    }
}
