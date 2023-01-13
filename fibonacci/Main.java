import java.nio.charset.IllegalCharsetNameException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        try {
            Scanner sc = new Scanner(System.in);

            System.out.print("N: ");
            int N = sc.nextInt();

            System.out.println(FibonacciLinear.fibo(N));
            System.out.println(FibonacciRecursivo.fibo(N));
            System.out.println(FibonacciRecursivo.fibo(6));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
