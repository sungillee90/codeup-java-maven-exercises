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

        assertEquals(company, testing); // to compare the values (individual values)
    }

    // todo Create a test method that uses assertNotSame
    //  to verify that the following ArrayLists are not the same:
    @Test
    public void testIfListsAreNotTheSame() {
        List<String> languages = new ArrayList<>();
        List<String> moreLanguages = new ArrayList<>();

        assertNotSame(languages, moreLanguages); // SAME for the Objects (LIST, hashMap, etc)
    }

    // todo Create a test method that uses assertArrayEquals to verify the following arrays are equal.
    @Test
    public void testIfArraysAreEqual() {
        int[] numbers = {1, 2, 3};
        int[] otherNumbers = new int[3];
        otherNumbers[0] = 1;
        otherNumbers[1] = 2;
        otherNumbers[2] = 3;

        assertArrayEquals(numbers, otherNumbers);
    }

    // todo Create a test method that uses both assertFalse and assertTrue
    //  to verify the following statements:
    @Test
    public void testIfWordContains() {
        String language = "PHP";
        assertTrue(language.contains("H")); // use assertTrue for this statement
        assertFalse(language.contains("J")); // use assertFalse for this statement
    }

}
