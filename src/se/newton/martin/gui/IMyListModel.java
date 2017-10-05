package se.newton.martin.gui;

import se.newton.martin.gui.strategy.FilterStrategy;

import javax.swing.*;

public interface IMyListModel extends ListModel<String> {
    void update(int index, String text);

    void add(String text);

    void remove(int index);

    void clear();

    void filter(FilterStrategy strategy);
}
