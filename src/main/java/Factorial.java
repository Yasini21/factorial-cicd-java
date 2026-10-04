public class Factorial {

    public static long calculate(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Negative number exception");
        }

        long fact = 1;

        for (int i = 2; i <= n; i++) {
            fact *= i;
        }

        return fact;
    }
}