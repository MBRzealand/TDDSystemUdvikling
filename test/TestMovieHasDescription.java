import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestMovieHasDescription {

    Movie testMovie;

    @Before
    public void setUp(){
        testMovie = new Movie("Test title 1", "Test location 1", "testDescription 1", 120, LocalDate.now());
    }

    @Test
    public void checkMovieLocation(){
        assertEquals("testDescription 1", testMovie.getDescription());
    }

    @After
    public void tearDown(){
        testMovie = null;
    }


}
