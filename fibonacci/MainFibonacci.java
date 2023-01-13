import java.util.Scanner;

public class MainFibonacci {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("N: ");
        int N = sc.nextInt();

        if (N < 0) {
            throw new IllegalArgumentException("N deve ser maior ou igual a 0");
        }

        System.out.println(FibonacciLinear.fibo(N));
        System.out.println(FibonacciRecursivo.fibo(N));
    }
}
