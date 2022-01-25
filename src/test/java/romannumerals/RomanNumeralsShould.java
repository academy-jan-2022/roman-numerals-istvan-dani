package romannumerals;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RomanNumeralsShould {

    @Test
    void convert_1_to_I() {
        RomanNumerals romanNumerals = new RomanNumerals();
        assertEquals("I",romanNumerals.convert(1));
    }
}
