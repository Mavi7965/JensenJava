package assignment;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;



public class UnitTests  {

    //name might be multiple string or single
    //boundray value analysis for Age
    //name is Empty
    //after couple invalid input , try valid input
    @Test
    void testValidAge() {
        assertTrue(YearOfBirthCalculator.isValidAge(25), "Age 25 should be valid");
        assertTrue(YearOfBirthCalculator.isValidAge(1), "Age 1 should be valid");
        assertTrue(YearOfBirthCalculator.isValidAge(130), "Age 130 should be valid");
        assertTrue(YearOfBirthCalculator.isValidAge(25), "Age 25 should be valid");
        assertEquals("Hello Kalle! You were born in 1947", "Hello Kalle! You were born in 1947");
    }

    @Test
    void testInvalidAge() {
        assertFalse(YearOfBirthCalculator.isValidAge(0), "Age 0 should be invalid");
        assertFalse(YearOfBirthCalculator.isValidAge(131), "Age 131 should be invalid");
    }

    @Test
    void testAgeInvalidHigh() {
        assertFalse(YearOfBirthCalculator.isValidAge(150), "Age 150 should be invalid");
    }

    @Test
    void testValidName() {
        YearOfBirthCalculator calculator = new YearOfBirthCalculator();
        assertDoesNotThrow(() -> calculator.isValidName("John"), "Name 'John' should be valid");
    }

    @Test
    void testInvalidName() {
        YearOfBirthCalculator calculator = new YearOfBirthCalculator();

        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> calculator.isValidName(""), "Empty name should throw IllegalArgumentException");

        assertEquals("Name cannot be empty. Enter a valid name.", exception.getMessage());
    }
}







