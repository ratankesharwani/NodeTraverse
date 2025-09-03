package org.example.fibonacci;

public class Main {
    public static void main(String[] args) {
        int n = 10;
        int sum = 0;

        System.out.println("Fibonacci series up to " + n + " terms:");

        for (int i = 0; i < n; i++) {
            int fib = fibonacci(i);
            System.out.print(fib + " ");
            sum += fib;
        }

        System.out.println("\nSum of the series: " + sum);
    }

    // Recursive Fibonacci function
    public static int fibonacci(int n) {
        if (n == 0)
            return 0;
        else if (n == 1)
            return 1;
        else
            return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
