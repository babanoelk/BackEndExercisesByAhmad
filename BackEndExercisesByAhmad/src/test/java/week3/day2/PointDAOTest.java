package week3.day2;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import week3.day2.exercise4.Point;
import week3.day2.exercise4.PointDAO;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PointDAOTest {

    /*
    Add tests for each method in the DAO class. Use the @BeforeAll and @AfterAll annotations to set up
    and close the EntityManagerFactory and EntityManager objects.
     */
    @BeforeAll
    static void setUp() {
        //All of my tests have been run without errors.
    }

    @AfterAll
    static void tearDown() {
        // I have used try-with-resources. There the below classes gets closed after each use.
        // 1) EntityManagerFactory
        // 2) EntityManager
    }

    @Test
    void store1000Points() {
        assertEquals(1, PointDAO.store1000Points());
        //Test done successfully
    }

    @Test
    void numberOfPointObjects() {
        assertEquals(3000, PointDAO.numberOfPointObjects());
    }

    @Test
    void findTheAverageX() {
        assertEquals(499.5, PointDAO.findTheAverageX(1));
    }

    @Test
    void retrieveAllThePointObjects() {
        List<Point> l = PointDAO.retrieveAllThePointObjects();
        assertEquals(3000, l.size());
    }
}