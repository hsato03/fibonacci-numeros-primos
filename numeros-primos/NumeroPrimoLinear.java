import java.util.ArrayList;
import java.util.List;

public class NumeroPrimoLinear {

    public static List<Integer> findPrimes(Integer N) {
        List<Integer> primes = new ArrayList<>();

        for (int i = 2; i <= N; i++) {
            if (isPrime(i)) {
                primes.add(i);
            }
        }

        return primes;
    }

    public static boolean isPrime(Integer num) {
        boolean isPrime = true;
        int quotient;

        if (num % 2 == 0 && num != 2) {
            return false;
        }

        for (int i = 3; i < num; i+=2) {
            quotient = num / i;

            if (quotient < i) {
                break;
            } else if (num % i == 0) {
                isPrime = false;
                break;
            }
        }

        return isPrime;
    }
}
