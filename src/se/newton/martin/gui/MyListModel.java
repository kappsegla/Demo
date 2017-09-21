package se.newton.martin.gui;

import javax.swing.*;
import javax.swing.event.ListDataEvent;
import javax.swing.event.ListDataListener;
import java.util.ArrayList;

public class MyListModel implements ListModel<String> {

    ArrayList<String> listItems = new ArrayList<>();
    ArrayList<ListDataListener> listener = new ArrayList<>();

    @Override
    public int getSize() {
        return listItems.size();
    }

    @Override
    public String getElementAt(int index) {
        return listItems.get(index);
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
        listItems.set(i, text);
        for (ListDataListener l : listener ) {
            l.contentsChanged(new ListDataEvent(this,ListDataEvent.CONTENTS_CHANGED,i,i));
        }
    }

    public void add(String text) {
        listItems.add(text);
        for (ListDataListener l : listener ) {
            l.intervalAdded(new ListDataEvent(this,ListDataEvent.INTERVAL_ADDED,listItems.size()-1,listItems.size()-1));
        }
    }
}

