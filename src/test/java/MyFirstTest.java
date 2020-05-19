import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class MyFirstTest {

    // todo Create a test method that uses assertEquals or assertNotEquals
    //  to verify if the String Codeup is the same as CodeUp.
    @Test
    public void testIfStringMatches() {
        String company = "Codeup";
        String testing = "Codeup";

        assertEquals(company, testing);
    }

    // todo Create a test method that uses assertNotSame
    //  to verify that the following ArrayLists are not the same:
    @Test
    public void mySecondTest() {
        List<String> languages = new ArrayList<>();
        List<String> moreLanguages = new ArrayList<>();

        assertNotSame(languages, moreLanguages);
    }

    // todo Create a test method that uses assertArrayEquals to verify the following arrays are equal.
//    @Test
//    public void myThirdTest() {
//        int[] numbers = {1, 2, 3};
//        int[] otherNumbers = new int[3];
//        otherNumbers[0] = 1;
//        otherNumbers[1] = 2;
//        otherNumbers[2] = 3;
//
//        assertArrayEquals
//    }
}
