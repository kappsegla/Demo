package se.newton.martin.gui.strategy;

public class CombinedOr implements FilterStrategy {

    //Kombinerad sökning där två filterstrategier måster uppfyllas för att det hela ska fungera

    private final FilterStrategy f1;
    private final FilterStrategy f2;

    public CombinedOr(FilterStrategy f1, FilterStrategy f2) {
        this.f1 = f1;
        this.f2 = f2;
    }

    @Override
    public boolean filter(String s) {
        return f1.filter(s) || f2.filter(s);
    }
}
