package romannumerals;

public class RomanNumerals {
    public String convert(int input) {
        StringBuilder result = new StringBuilder();

        for (int i = 1; i<=input; i++) {
            result.append("I");
        }
//
//        if(input == 2){
//            return "II";
//        }

        return result.toString();
    }
}
