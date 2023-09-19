
public class Main {


    public static void main(String[] args) {

        int sumOfTwo = add(1,2);
        System.out.println(sumOfTwo);
        int sumOfFour = add(1,2,3,4);
        System.out.println(sumOfFour);
        String morning = morningGreeting("Angus");
        System.out.println(morning);
        String afternoon = afternoonGreeting("Amboise");
        System.out.println(afternoon);
        String three = triple("oohlala");
        System.out.println(three);
        double overTwo = half(20);
        System.out.println(overTwo);
        int roundPositive = roundPositiveValueToNearestInteger(15);
        System.out.println(roundPositive);
        int roundNegative = roundNegativeValueToNearestInteger(-2);
        System.out.println(roundNegative);

    }

    // 1. add
    public static int add(int a, int b) {
        return a+b;
    }

    // 2. add
    public static int add(int a, int b, int c, int d) {
        return add(add(add(a,b),c),d);
    }

    // 3. morningGreeting
    public static String morningGreeting(String name) {
        return "早上好, " + name + "!";
    }


    // 4. afternoonGreeting
    public static String afternoonGreeting(String name) {
        return "下午好, " + name + "!";
    }

    // 5. triple
    public static String triple(String input) {
        System.out.println(input + input + input);
        return input + input + input;

    }


    // 6. half
    public static double half(int a) {
        return (double) a /2;
    }

    // 7. roundPositiveValueToNearestInteger
    public static int roundPositiveValueToNearestInteger(double a) {
        return (int) (a+0.5);
    }

    // 8. roundNegativeValueToNearestInteger
    public static int roundNegativeValueToNearestInteger(double a) {
        return (int) (a-0.5);
    }


}