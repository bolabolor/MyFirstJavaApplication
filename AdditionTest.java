import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AdditionTest {

    @Test
    void add_when10and20_thenReturn30() {
        //GIVEN
        int value1 = 10;
        int value2 = 20;

        //WHEN
        int actual = Addition.sum(value1, value2);

        //THEN
        assertEquals(10, actual);

    }

    @Test
    void isBiggerThan100_when101_thenReturnTrue() {
        //GIVEN
        int value = 101;

        //WHEN
        boolean result = Addition.isBiggerThanHundred(value);

        //THEN
        assertEquals(false, result);
    }
}