package se.newton.martin.testning;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MovieTest {

    @Test
    void createNewMovieReturnsEmptyObject(){
        Movie movie = new Movie();
        assertNotNull(movie);
    }

    @Test
    @DisplayName("Change Movie Title with setter and check that stored movie title has been set.")
    void setMovieTitleChangesMovieObjectTitle(){
        Movie movie = new Movie();
        String title = "Batman";
        movie.setTitle(title);

        assertEquals(title,movie.getTitle());
    }

    @Test
    void setInvalidNullTitleThrowsIllegalArgumentException(){
        Movie movie = new Movie();

        assertThrows(IllegalArgumentException.class,() -> { movie.setTitle(null);} );
    }

    @Test
    void setEmptyStringTitleThrowsIllegalArgumentException(){
        Movie movie = new Movie();
        assertThrows(IllegalArgumentException.class,() -> movie.setTitle(""));
    }

    @Test
    void createObjectStringTitleConstructorReturnsObjectWithTitle()
    {
        Movie movie = new Movie("Batman");
        assertEquals("Batman", movie.getTitle());
    }

    @Test
    void createObjectStringConstructorWithEmptyTitleReturnsIllegalArgumentException()
    {

        assertThrows(IllegalArgumentException.class, ()-> new Movie(""));

    }

}
