package romannumerals;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RomanNumeralsShould {

    @Test
    void convert_1_to_I() {
        RomanNumerals romanNumerals = new RomanNumerals();

        String result = romanNumerals.convert(1);

        assertEquals("I", result);
    }

    @Test
    void convert_2_to_II() {
        RomanNumerals romanNumerals = new RomanNumerals();

        String result = romanNumerals.convert(2);

        assertEquals("II", result);
    }

    @Test
    void convert_3_to_III() {
        RomanNumerals romanNumerals = new RomanNumerals();

        String result = romanNumerals.convert(3);

        assertEquals("III", result);
    }

}
