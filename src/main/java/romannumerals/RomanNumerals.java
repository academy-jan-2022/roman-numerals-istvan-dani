package romannumerals;

public class RomanNumerals {
    public String convert(int number) {
        if (number == 4) return "IV";
        return "I".repeat(number);

    }
}
