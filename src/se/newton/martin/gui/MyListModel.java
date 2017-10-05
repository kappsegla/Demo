package se.newton.martin.gui;

import se.newton.martin.gui.strategy.FilterStrategy;

import javax.swing.event.ListDataEvent;
import javax.swing.event.ListDataListener;
import java.util.ArrayList;

public class MyListModel implements IMyListModel {

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

    @Override
    public void update(int index, String text) {
        listItems.set(index, text);
        for (ListDataListener l : listener ) {
            l.contentsChanged(new ListDataEvent(this,ListDataEvent.CONTENTS_CHANGED,index,index));
        }
    }

    @Override
    public void add(String text) {
        if( !listItems.contains(text))
            listItems.add(text);
        for (ListDataListener l : listener ) {
            l.intervalAdded(new ListDataEvent(this,ListDataEvent.INTERVAL_ADDED,listItems.size()-1,listItems.size()-1));
        }
    }

    @Override
    public void remove(int index){
        listItems.remove(index);
        for (ListDataListener l : listener ) {
            l.intervalRemoved(new ListDataEvent(this,ListDataEvent.INTERVAL_REMOVED,index, index));
        }
    }

    @Override
    public void clear() {
        int size = listItems.size();
        listItems.clear();
        for (ListDataListener l : listener ) {
            l.intervalRemoved(new ListDataEvent(this,ListDataEvent.INTERVAL_REMOVED,0, size));
        }
    }

    @Override
    public void filter(FilterStrategy strategy) {

    }
}

