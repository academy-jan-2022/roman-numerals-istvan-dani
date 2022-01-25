package romannumerals;

public class RomanNumerals {
    public String convert(int input) {
        if (input == 5)
            return "V";

        return "I".repeat(input);
    }
}
