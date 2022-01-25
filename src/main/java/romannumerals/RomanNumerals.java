package romannumerals;

public class RomanNumerals {
    public String convert(int input) {
        StringBuilder result = new StringBuilder();

        for (RomanTranslator romanTranslator : RomanTranslator.values()) {
            while (input >= romanTranslator.translation) {
                result.append(romanTranslator);
                input -= romanTranslator.translation;
            }
        }

        return result.toString();
    }

    private enum RomanTranslator {
        L(50), X(10), V(5), IV(4), I(1);
        private final int translation;

        RomanTranslator(int translation) {
            this.translation = translation;
        }
    }
}
