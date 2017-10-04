package se.newton.martin.gui;

import java.util.ArrayList;

public class FilteredListModel extends MyListModel {

    ArrayList<String> backupList = new ArrayList<>();
    boolean filtering;

    /**
     * Call this function to filter the available data.
     * Filter will try to find the requested text anywhere in the stored strings
     * and will show all posts with a match.
     *
     * @param filterText Text to search for. If empty or null all posts will be shown.
     */
    public void filter(String filterText) {

        //Återställ listan till ofiltrerad version
        for (String s : backupList) {
            add(s);
        }
        backupList.clear();
        listItems.sort( (o1, o2) -> o1.compareToIgnoreCase(o2));

        if (filterText == null || filterText.isEmpty())
            return;

        //Filter
        for (int i = 0; i < getSize(); ) {
            String post = getElementAt(i);
            if (post.contains(filterText)) {
                //It's a match. Keep
                i++;
            } else {
                backupList.add(post);
                super.remove(i);
            }
        }
    }
//    public void filter(String filterText){
//
//        if( !filtering ) {
//            backupList.clear();
//            for (String s : listItems) {
//                backupList.add(s);
//            }
//            filtering = true;
//        }
//        else
//        {
//            //clear();
//            for ( String s : backupList ) {
//                add(s);
//            }
//        }
//
//       if( filterText == null || filterText.isEmpty())
//       {
//           //Show all posts
//           filtering = false;
//
//           System.out.println("Nothing to filter.. Show all.");
//           return;
//       }
//       //Filter
//        for (int i = 0; i < getSize(); ) {
//            String post = getElementAt(i);
//            if( post.contains(filterText) )
//            {
//                //It's a match. Keep
//                i++;
//            }
//            else
//            {
//                super.remove(i);
//            }
//        }
//    }


    @Override
    public void add(String text) {
        super.add(text);
        listItems.sort((o1, o2) -> o1.compareToIgnoreCase(o2));
    }

    @Override
    public void remove(int index) {
        String obj = getElementAt(index);
        super.remove(index);
        backupList.remove(obj);
    }
}
