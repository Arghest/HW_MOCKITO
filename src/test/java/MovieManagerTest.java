import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class MovieManagerTest {

    @Test
    public void add0() {
        MovieManager manager = new MovieManager();
        String[] actual = manager.findAll();
        String[] exp = {}; //expected = exp

        Assertions.assertArrayEquals(actual, exp);
    }

    @Test
    public void add1() {
        MovieManager manager = new MovieManager();
        manager.addMovie("film 1");
        String[] actual = manager.findAll();
        String[] exp = {"film 1"}; //expected = exp

        Assertions.assertArrayEquals(actual, exp);
    }

    @Test
    public void add5() {
        MovieManager manager = new MovieManager();
        manager.addMovie("film 1");
        manager.addMovie("film 2");
        manager.addMovie("film 3");
        manager.addMovie("film 4");
        manager.addMovie("film 5");
        String[] actual = manager.findAll();
        String[] exp = {"film 1", "film 2", "film 3", "film 4", "film 5",}; //expected = exp

        Assertions.assertArrayEquals(actual, exp);
    }

    @Test
    public void findlastTest() {
        MovieManager manager = new MovieManager();
        manager.addMovie("film 1");
        manager.addMovie("film 2");
        manager.addMovie("film 3");
        manager.addMovie("film 4");
        manager.addMovie("film 5");
        String[] actual = manager.findLast();
        String[] exp = {"film 5", "film 4", "film 3", "film 2", "film 1",};

        Assertions.assertArrayEquals(actual, exp);
    }

    @Test
    public void findlast4Test() {
        MovieManager manager = new MovieManager();
        manager.addMovie("film 1");
        manager.addMovie("film 2");
        manager.addMovie("film 3");
        manager.addMovie("film 4");
        String[] actual = manager.findLast();
        String[] exp = {"film 4", "film 3", "film 2", "film 1",};

        Assertions.assertArrayEquals(actual, exp);
    }

    @Test
    public void findlast6Test() {
        MovieManager manager = new MovieManager();
        manager.addMovie("film 1");
        manager.addMovie("film 2");
        manager.addMovie("film 3");
        manager.addMovie("film 4");
        manager.addMovie("film 5");
        manager.addMovie("film 6");
        String[] actual = manager.findLast();
        String[] exp = {"film 6", "film 5", "film 4", "film 3", "film 2",};

        Assertions.assertArrayEquals(actual, exp);
    }

    @Test
    public void findlast8Test() {
        MovieManager manager = new MovieManager(8);
        manager.addMovie("film 1");
        manager.addMovie("film 2");
        manager.addMovie("film 3");
        manager.addMovie("film 4");
        manager.addMovie("film 5");
        manager.addMovie("film 6");
        manager.addMovie("film 7");
        manager.addMovie("film 8");
        String[] actual = manager.findLast();
        String[] exp = {"film 8", "film 7", "film 6", "film 5", "film 4", "film 3", "film 2", "film 1",};

        Assertions.assertArrayEquals(actual, exp);
    }

    @Test
    public void findlast9Test() {
        MovieManager manager = new MovieManager(8);
        manager.addMovie("film 1");
        manager.addMovie("film 2");
        manager.addMovie("film 3");
        manager.addMovie("film 4");
        manager.addMovie("film 5");
        manager.addMovie("film 6");
        manager.addMovie("film 7");
        manager.addMovie("film 8");
        manager.addMovie("film 9");
        String[] actual = manager.findLast();
        String[] exp = {"film 9", "film 8", "film 7", "film 6", "film 5", "film 4", "film 3", "film 2"};

        Assertions.assertArrayEquals(actual, exp);
    }

    @Test
    public void findlast7Test() {
        MovieManager manager = new MovieManager(8);
        manager.addMovie("film 1");
        manager.addMovie("film 2");
        manager.addMovie("film 3");
        manager.addMovie("film 4");
        manager.addMovie("film 5");
        manager.addMovie("film 6");
        manager.addMovie("film 7");
        String[] actual = manager.findLast();
        String[] exp = {"film 7", "film 6", "film 5", "film 4", "film 3", "film 2", "film 1",};

        Assertions.assertArrayEquals(actual, exp);
    }


}