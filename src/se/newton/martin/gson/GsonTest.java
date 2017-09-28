package se.newton.martin.gson;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Type;
import java.util.ArrayList;

public class GsonTest {
    public static void main(String[] args) {
        Document doc = null;
        try {
            doc = Jsoup.connect("http://gp.se/").get();
            Elements newsHeadlines = doc.select(".teaser__body__heading");

            for ( Element e: newsHeadlines ) {
                System.out.println(e.ownText());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        Gson gson = new Gson();

        ArrayList<Movie> movies = new ArrayList<>();
        movies.add(new Movie("Pulp Fiction", 1994, 2.34));
        movies.add(new Movie("Spiderman", 2002, 2.01));

        String jsoncode = gson.toJson(movies);
        System.out.println(jsoncode);
        // Deserialization
        Type collectionType = new TypeToken<ArrayList<Movie>>(){}.getType();
        ArrayList<Movie> movies1 = gson.fromJson(jsoncode, collectionType);

        System.out.println(movies1.get(0).getTitle());

    }
}
