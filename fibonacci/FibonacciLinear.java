public class FibonacciLinear {

    public static Integer fibo(Integer N) {
        if (N <= 1) {
            return N;
        }

        int anterior = 0;
        int fibonacci = 1;
        int temp = 0;

        for (int i = 0; i < N-1; i++) {
            temp = fibonacci;
            fibonacci += anterior;
            anterior = temp;
        }

        return fibonacci;

    }
}
