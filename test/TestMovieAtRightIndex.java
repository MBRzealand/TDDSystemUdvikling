import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class TestMovieAtRightIndex extends DefaultData {

    Movie actualTestMovie;

    @Before
    public void setUp(){
        actualTestMovie = new Movie("Test title", "Test location", "testDescription", 120, LocalDate.now());
        movies.add(testMovie1);
        movies.add(actualTestMovie);
        movies.add(testMovie2);
    }

    @Test
    public void checkMovieIndex() {
        assertEquals("Test title",movies.get(1).getTitle());
        assertNotEquals("Test title 1", movies.get(1).getTitle());
        assertNotEquals("Test title 2", movies.get(1).getTitle());
    }

    @After
    public void tearDown(){
        movies.clear();
    }


}