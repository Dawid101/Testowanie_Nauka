package pl.coderslab.week2;

import org.junit.jupiter.api.Test;
import pl.coderslab.week2.enums.Genre;
import pl.coderslab.week2.enums.Movie;

import static org.junit.jupiter.api.Assertions.*;

class MovieTest {

    @Test
    void checkMovieDetails(){
        Movie comedy = new Movie("Comedy film", Genre.COMEDY, "Dawid Tyrka");
        Movie horror = new Movie("Horror film", Genre.HORROR, "Dawid Tyrka1");
        Movie cartoon = new Movie("Cartoon film", Genre.CARTOON, "Dawid Tyrka2");
        comedy.displayDetails();
        horror.displayDetails();
        cartoon.displayDetails();
    }

    @Test
    void checkDisplayDescription(){
        assertEquals("Funny movies", Genre.COMEDY.displayDescription());
        assertEquals("Scary movies", Genre.HORROR.displayDescription());
        assertEquals("Animated movies", Genre.CARTOON.displayDescription());
    }

}