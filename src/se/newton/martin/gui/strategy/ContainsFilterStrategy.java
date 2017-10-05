package se.newton.martin.gui.strategy;

public class ContainsFilterStrategy implements FilterStrategy {

    private String filtertext;

    public ContainsFilterStrategy(String filtertext){
        this.filtertext = filtertext;
    }

    @Override
    public boolean filter(String s) {
        return s.contains(filtertext);
    }
}
