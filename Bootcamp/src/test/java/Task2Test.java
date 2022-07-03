import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task2Test {

    @Test
    void compareNumbers() {
        assertEquals(true, Task2.compareNumbers(2,2));

    }

    @Test
    void compareBoolean() {
        assertEquals(true,Task2.compareBoolean(true,true));
    }

    @Test
    void wholeNumber() {
        assertEquals(true, Task2.wholeNumber(4));

    }

    @Test
    void oddNumber() {
        assertEquals(true, Task2.oddNumber(5));
    }

    @Test
    void changeBoolean() {
        assertEquals(true, Task2.changeBoolean(true));
    }

    @Test
    void numberConditions() {

    }


}