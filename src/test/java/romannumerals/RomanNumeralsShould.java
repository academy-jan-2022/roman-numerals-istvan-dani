package romannumerals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RomanNumeralsShould {

    @ParameterizedTest
    @CsvSource({
        "1, I",
        "2, II",
        "3, III",
    })
    void convert_number_to_roman_numeral(int number, String romanNumeral) {
        RomanNumerals romanNumerals = new RomanNumerals();

        String result = romanNumerals.convert(number);

        assertEquals(romanNumeral, result);
    }

}
