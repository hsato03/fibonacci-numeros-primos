import java.util.Scanner;

public class MainPrimo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("N: ");
        int N = sc.nextInt();

        if (N < 2) {
            throw new IllegalArgumentException("N deve ser maior ou igual a 2");
        }

        System.out.println(NumeroPrimoLinear.findPrimes(N));
        System.out.println(NumeroPrimoRecursivo.findPrimes(N));

        sc.close();
    }
}
