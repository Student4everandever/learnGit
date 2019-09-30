package fizzbuzz;

public class ReplaceWithNumberAsStringIfNotDivisibleByThreeOrFive implements NumberReplacement {
    @Override
    public String replaceNumberWithString(int num) {
        if(num % 3 != 0 && num % 5 != 0) {
            return String.valueOf(num);
        }
        return "";
    }
}
