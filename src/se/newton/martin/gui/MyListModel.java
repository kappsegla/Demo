package se.newton.martin.gui;

import javax.swing.*;
import javax.swing.event.ListDataEvent;
import javax.swing.event.ListDataListener;
import java.util.ArrayList;

public class MyListModel implements ListModel<String> {
    String[] listItems = {"Item1", "Item2", "Item3", "Lisa", "Pelle", "Martin"};
    ArrayList<ListDataListener> listener = new ArrayList<>();

    @Override
    public int getSize() {
        return listItems.length;
    }

    @Override
    public String getElementAt(int index) {
        return listItems[index];
    }

    @Override
    public void addListDataListener(ListDataListener l) {
        listener.add(l);
    }

    @Override
    public void removeListDataListener(ListDataListener l) {
        listener.remove(l);
    }

    public void update(int i, String text) {
        listItems[i] = text;
        for (ListDataListener l : listener ) {
            l.contentsChanged(new ListDataEvent(this,ListDataEvent.CONTENTS_CHANGED,i,i));
        }


    }
}

