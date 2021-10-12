import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestMovieListNotEmpty extends DefaultData{

    @Before
    public void setUp(){
        movies.add(testMovie1);
        movies.add(testMovie2);
    }

    @Test
    public void IsListPopulated(){

        assertEquals(2,movies.size());

    }

    @After
    public void tearDown(){
        movies.clear();
    }

}






