package se.newton.martin.gui.strategy;

public class EndsWith implements FilterStrategy {
    private final String filterText;

    public EndsWith(String filterText)
    {
        this.filterText = filterText;
    }

    @Override
    public boolean filter(String s) {
        return s.endsWith(filterText);
    }
}
