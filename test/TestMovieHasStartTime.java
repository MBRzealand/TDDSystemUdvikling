import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestMovieHasStartTime extends DefaultData {
    Movie testMovie;

    @Before
    public void setUp(){
        testMovie = new Movie("Test title 1", "Test location 1", "testDescription 1", 120, LocalDate.now());
        testMovie.setStartTime(DefaultData.now());
    }

    @Test
    public void checkMovieLocation(){
        assertEquals("2021-08-10T13:50:00.000", testMovie.getStartTime());
    }

    @After
    public void tearDown(){
        testMovie = null;
    }

}
