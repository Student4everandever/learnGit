package fizzbuzz;

public class App {

    public static void main(String[] args) {

        App test = new App();
        System.out.println(test.convert(0));
        System.out.println(test.convert(1));
        System.out.println(test.convert(3));
        System.out.println(test.convert(5));
        System.out.println(test.convert(15));

    }

    private String convert(int number){

        return new ReplaceWithBuzzIfDivisibleByThree().replaceNumberWithString(number) +
               new ReplaceWithFizzIfDivisibleByFive().replaceNumberWithString(number) +
               new ReplaceWithNumberAsStringIfNotDivisibleByThreeOrFive().replaceNumberWithString(number);
    }
}
