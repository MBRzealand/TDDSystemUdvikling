import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import java.time.LocalDate;
import java.util.ArrayList;

@RunWith(Suite.class)

@Suite.SuiteClasses({
        TestMovieHasTitle.class,
        TestMovieHasLocation.class,
        TestForMovieListExisting.class,
        TestMovieListNotEmpty.class,
        TestMovieAtRightIndex.class
})

public class TestSuite {
}

class DefaultData {
    public ArrayList<Movie> movies = new ArrayList<>();
    public Movie testMovie1 = new Movie("Test title 1", "Test location 1", "testDescription 1", 120, LocalDate.now());
    public Movie testMovie2 = new Movie("Test title 2", "Test location 2", "testDescription 2", 90, LocalDate.now());
}



