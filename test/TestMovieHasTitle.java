import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestMovieHasTitle extends DefaultData {

    Movie testMovie;

    @Before
    public void setUp(){
        testMovie = new Movie("Test title 1", "Test location 1", "testDescription 1", 120, LocalDate.now());
    }

    @Test
    public void checkMovieTitle(){
        assertEquals("Test title 1", testMovie.getTitle());
    }

    @After
    public void tearDown() {
        testMovie = null;
    }

}
