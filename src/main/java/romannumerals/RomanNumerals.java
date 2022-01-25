package romannumerals;

public class RomanNumerals {
    public String convert(int input) {
        StringBuilder result = new StringBuilder();

        if (input >= 5) {
            result.append("V");
            input = input -5;
        }
        result.append("I".repeat(input));

        return result.toString();
    }
}
