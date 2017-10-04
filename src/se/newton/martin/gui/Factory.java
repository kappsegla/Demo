package se.newton.martin.gui;

//http://www.oodesign.com/factory-pattern.html
public class Factory {
    public static IMyListModel createListModel(){
        return new FilteredListModel();
    }
}
