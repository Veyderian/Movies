import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoviePosterManagerTest {

    @Test
    public void shouldMovieAdded() {
        MoviePosterManager manager = new MoviePosterManager();
        manager.add("film 1");
        manager.add("film 2");
        manager.add("film 3");

        String[] expected = {"film 1", "film 2", "film 3"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldMovieAdded1() {
        MoviePosterManager manager = new MoviePosterManager();
        manager.add("film 1");

        String[] expected = {"film 1"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldMovieAdded0() {
        MoviePosterManager manager = new MoviePosterManager();

        String[] expected = {};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldLastMovieAdded() {
        MoviePosterManager manager = new MoviePosterManager(5);
        manager.add("film 1");
        manager.add("film 2");
        manager.add("film 3");
        manager.add("film 4");
        manager.add("film 5");

        String[] expected = {"film 5", "film 4", "film 3", "film 2", "film 1"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }


    @Test
    public void shouldLastMovieAdded5() {
        MoviePosterManager manager = new MoviePosterManager();
        manager.add("film 1");
        manager.add("film 2");
        manager.add("film 3");
        manager.add("film 4");
        manager.add("film 5");

        String[] expected = {"film 5", "film 4", "film 3", "film 2", "film 1"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldLastMovieBelowLimitAdded3() {
        MoviePosterManager manager = new MoviePosterManager();
        manager.add("film 1");
        manager.add("film 2");
        manager.add("film 3");
        manager.add("film 4");

        String[] expected = {"film 4", "film 3", "film 2", "film 1"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldLastMovieAddedBelowLimit() {
        MoviePosterManager manager = new MoviePosterManager(5);
        manager.add("film 1");
        manager.add("film 2");
        manager.add("film 3");
        manager.add("film 4");

        String[] expected = {"film 4", "film 3", "film 2", "film 1"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldLastMovieAddedAboveLimit() {
        MoviePosterManager manager = new MoviePosterManager(5);
        manager.add("film 1");
        manager.add("film 2");
        manager.add("film 3");
        manager.add("film 4");
        manager.add("film 5");
        manager.add("film 6");

        String[] expected = {"film 6", "film 5", "film 4", "film 3", "film 2"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldLastMovieAddedAboveLimit1() {
        MoviePosterManager manager = new MoviePosterManager();
        manager.add("film 1");
        manager.add("film 2");
        manager.add("film 3");
        manager.add("film 4");
        manager.add("film 5");
        manager.add("film 6");

        String[] expected = {"film 6", "film 5", "film 4", "film 3", "film 2"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

}
