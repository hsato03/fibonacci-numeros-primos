import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class FibonacciRecursivo {

    // Memoization cache
    private static final Map<Integer, Integer> cache = new ConcurrentHashMap<>();

    public static Integer fibo(Integer N) {
        if (N <= 1) {
            return N;
        }

        if (cache.containsKey(N)) {
            return cache.get(N);
        }

        int value = fibo(N-1) + fibo(N-2);
        cache.put(N, value);
        return value;
    }
}
