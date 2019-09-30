package fizzbuzz;

public class ReplaceWithBuzzIfDivisibleByThree implements NumberReplacement {
        private static final String BUZZ = "Buzz";

        @Override
        public String replaceNumberWithString(int num) {
            if(num % 5 == 0) {
                return BUZZ;
            }
            return "";
        }
    }

