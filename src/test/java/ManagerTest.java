import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ManagerTest {

    @Test
    public void addSomeMovie() {

        Manager manager = new Manager();

        manager.addMovies("Film 1");
        manager.addMovies("Film 2");
        manager.addMovies("Film 3");
        manager.addMovies("Film 4");
        manager.addMovies("Film 5");


        String[] expected = {"Film 1", "Film 2", "Film 3", "Film 4", "Film 5"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastMovies() {
        Manager manager = new Manager();
        manager.addMovies("Film 1");
        manager.addMovies("Film 2");
        manager.addMovies("Film 3");
        manager.addMovies("Film 4");
        manager.addMovies("Film 5");

        String[] actual = manager.findLast();
        String[] expected = {"Film 5", "Film 4", "Film 3", "Film 2", "Film 1"};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void addingOneMovie() {
        Manager manager = new Manager();
        manager.addMovies("Film 1");

        String[] actual = manager.findLast();
        String[] expected = {"Film 1"};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void withoutAddingAMovie() {
        Manager manager = new Manager();

        String[] actual = manager.findLast();
        String[] expected = {};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void additionFromFifteenToSix() {
        Manager manager = new Manager();
        manager.addMovies("Film 1");
        manager.addMovies("Film 2");
        manager.addMovies("Film 3");
        manager.addMovies("Film 4");
        manager.addMovies("Film 5");
        manager.addMovies("Film 6");
        manager.addMovies("Film 7");
        manager.addMovies("Film 8");
        manager.addMovies("Film 9");
        manager.addMovies("Film 10");
        manager.addMovies("Film 11");
        manager.addMovies("Film 12");
        manager.addMovies("Film 13");
        manager.addMovies("Film 14");
        manager.addMovies("Film 15");
        manager.addMovies("Film 16");


        String[] actual = manager.findLast();
        String[] expected = {"Film 15", "Film 15", "Film 14", "Film 13", "Film 12", "Film 11", "Film 10", "Film 9", "Film 8", "Film 7"};

        Assertions.assertArrayEquals(expected, actual);
    }
}
