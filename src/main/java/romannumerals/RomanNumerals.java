package romannumerals;

import java.util.List;

public class RomanNumerals {

    List<RomanTranslation> romanTranslations = List.of(
        new RomanTranslation("X", 10),
        new RomanTranslation("V", 5),
        new RomanTranslation("I", 1)
    );

    public String convert(int number) {
        return getConversion(new RomanNumeralResult(number, "")).result;
    }

    private RomanNumeralResult getConversion(RomanNumeralResult romanNumeralResult) {
        if (romanNumeralResult.decimalRest == 0) {
            return romanNumeralResult;
        }

        RomanTranslation romanTranslation = romanTranslations.stream()
            .filter(x -> romanNumeralResult.decimalRest >= x.translation)
            .findFirst()
            .orElseThrow();

        int decimalRest = romanNumeralResult.decimalRest - romanTranslation.translation;
        String result = romanNumeralResult.result + romanTranslation.romanNumeral;

        return this.getConversion(new RomanNumeralResult(decimalRest, result));
    }

    private record RomanNumeralResult(int decimalRest, String result) {
    }

    private record RomanTranslation(String romanNumeral, int translation) {
    }
}
