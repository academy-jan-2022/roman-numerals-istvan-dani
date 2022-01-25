package romannumerals;

public class RomanNumerals {
    public String convert(int number) {
        StringBuilder result = new StringBuilder();

        while(number > 0){
            if(number == 5){
                result.append("V");
                number -= 5;
            }
            if (number == 4){
                result.append("IV");
                number -= 4;
            }
            if(number >= 1){
                result.append("I");
                number-= 1;
            }
        }
        return result.toString();
    }
}
