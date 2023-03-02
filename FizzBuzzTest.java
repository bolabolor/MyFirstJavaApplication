import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FizzBuzzTest {
    @Test
    void WhenGivenThreeReturnFizz(){
        // GIVEN
        int i = 3;
        // WHEN
        String result = Fizzbuzz.fizzbuzz(i);
        // THEN
        assertEquals("Fizz", result);
    }
    @Test
    void WhenGivenFiveReturnBuzz(){
        // GIVEN
        int i = 5;
        // WHEN
        String result = Fizzbuzz.fizzbuzz(i);
        // THEN
        assertEquals("Buzz", result);
    }

    @Test
    void WhenGiven15ReturnFizzbuzz(){
        // GIVEN
        int i = 15;
        // WHEN
        String result = Fizzbuzz.fizzbuzz(i);
        // THEN
        assertEquals("FizzBuzz", result);
    }

    @Test
    void WhenGiven11Return11(){
        // GIVEN
        int i = 11;
        // WHEN
        String result = Fizzbuzz.fizzbuzz(i);
        // THEN
        assertEquals("11", result);
    }
}
