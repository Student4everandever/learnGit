package fizzbuzz;

public class ReplaceWithFizzIfDivisibleByFive implements NumberReplacement {
    private static final String FIZZ = "Fizz";

    @Override
    public String replaceNumberWithString(int num) {
        if(num % 3 == 0) {
            return FIZZ;
        }
        return "";
    }
}
