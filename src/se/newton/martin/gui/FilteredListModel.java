package se.newton.martin.gui;

import java.util.ArrayList;

public class FilteredListModel extends MyListModel {

    ArrayList<String> originalList = new ArrayList<>();
    boolean filtering;

    /**
     * Call this function to filter the available data.
     * Filter will try to find the requested text anywhere in the stored strings
     * and will show all posts with a match.
     * @param filterText Text to search for. If empty or null all posts will be shown.
     */
    public void filter(String filterText){

        if( !filtering ) {
            originalList.clear();
            for (String s : listItems) {
                originalList.add(s);
            }
            filtering = true;
        }
        else
        {
            clear();
            for ( String s : originalList ) {
                add(s);
            }
        }

       if( filterText == null || filterText.isEmpty())
       {
           //Show all posts
           filtering = false;

           System.out.println("Nothing to filter.. Show all.");
           return;
       }
       //Filter
        for (int i = 0; i < getSize(); ) {
            String post = getElementAt(i);
            if( post.contains(filterText) )
            {
                //It's a match. Keep
                i++;
            }
            else
            {
                super.remove(i);
            }
        }
    }

    @Override
    public void remove(int index) {
        String obj = getElementAt(index);
        super.remove(index);
        originalList.remove(obj);
    }
}
