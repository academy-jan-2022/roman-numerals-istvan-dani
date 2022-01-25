package romannumerals;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RomanNumeralsShould {

    @Test
    void convert_1_to_I() {
        RomanNumerals romanNumerals = new RomanNumerals();
        assertEquals("I",romanNumerals.convert(1));
    }

    @Test
    void convert_2_to_II() {
        RomanNumerals romanNumerals = new RomanNumerals();

        assertEquals("II", romanNumerals.convert(2));
    }

}
