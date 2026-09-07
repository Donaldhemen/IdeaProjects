import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MovieFunctionsTest {

    private MovieFunctions movie;

    @BeforeEach
    public void setUpRatings() {

        movie = new MovieFunctions("Inception");
    }

    @Test
    public void showThatICan_addMovie() {

        assertEquals("Inception", movie.getMovieName());
    }

    @Test
    public void showThat_movieHas_dateAdded() {

        assertNotNull(movie.getDateAdded());
    }

    @Test
    public void showThatICan_addRating() {

        movie.addRating(5);

        assertEquals(5, movie.getAverageRating());
    }
    @Test
    public  void showThatICan_calculateAverageRating() {

        movie.addRating(5);
        movie.addRating(4);
        movie.addRating(3);

        assertEquals(4.0, movie.getAverageRating());
    }
    @Test
    public void showThatI_cannotAddRating_belowOne() {

        movie.addRating(0);

        assertEquals(0, movie.getAverageRating());
    }
    @Test
    public void showThatI_cannotAddRating_aboveFive() {

        movie.addRating(6);

        assertEquals(0, movie.getAverageRating());
    }
    @Test
    public void movieStartsWithZeroRatings() {

        assertEquals(0, movie.getNumberOfRatings());
    }
}
