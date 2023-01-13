import java.util.ArrayList;
import java.util.List;

public class NumeroPrimoRecursivo {

    public static List<Integer> findPrimes(Integer N) {
        List<Integer> primes = new ArrayList<>();

        for (int i = 2; i <= N; i++) {
            if (isPrime(i, 3)) {
                primes.add(i);
            }
        }

        return primes;
    }

    public static boolean isPrime(Integer num, Integer count) {
        if (num % 2 == 0) {
            return num == 2;
        } else if (num % count == 0 && num != count) {
            return false;
        } else if (num / count < count) {
            return true;
        }
        return isPrime(num, count + 2);
    }
}
