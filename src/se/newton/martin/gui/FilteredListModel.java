package se.newton.martin.gui;

import se.newton.martin.gui.strategy.FilterStrategy;
import se.newton.martin.gui.strategy.ShowAll;

import java.util.ArrayList;

public class FilteredListModel extends MyListModel {

    ArrayList<String> model = new ArrayList<>();
    FilterStrategy filter = new ShowAll();

    /*public void filter(String filterText) {

        //Alternativa lösningar att undersöka..
//        listItems.removeIf(s -> !s.contains(filterText));



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
    }*/
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
    public void filter(FilterStrategy filterStrategy) {
        filter = filterStrategy;
        super.clear();  //Rensar hela listan, prestandan?

        for (String o : model) {
            //if (text == null || text.isEmpty() || o.contains(filter) ) {
            if( filterStrategy.filter(o)){
                    super.add(o);
            }
        }

//        for (String o : model) {
//            if (text == null || text.isEmpty()) {
//                if ( !listItems.contains(o)) {
//                    super.add(o);
//                }
//            } else if (!o.contains(filter)) {
//                if (listItems.contains(o)) {
//                    super.remove(listItems.indexOf(o));
//                }
//            } else {
//                if (!listItems.contains(o)) {
//                    super.add(o);
//                }
//            }
//        }
    }

    @Override
    public void add(String text) {
        model.add(text);
        filter(filter);
    }

    @Override
    public void remove(int index) {
        String obj = getElementAt(index);
        model.remove(obj);
        filter(filter);
    }

    @Override
    public void clear() {
        model.clear();
        filter(filter);
    }
}
