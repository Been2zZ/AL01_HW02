package FibonacciNumberSequence;

import java.util.Scanner;

public class TestFibonacciNumberSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("몇 번째 피보나치 수를 구하시겠습니까? : ");
        int n = sc.nextInt();

        System.out.println("\n< Recursive >");
        Recursive r = new Recursive();
        for(int i = 0; i <= n; i++) System.out.println(i + "번째 : " + r.Fibonacci(i));
        System.out.println("\n" + n + "번째 피보나치 수는 " + r.Fibonacci(n) + "입니다.");

        System.out.println("\n< Bottom up >");
        BottomUp b = new BottomUp();

        System.out.println("\n" + n + "번째 피보나치 수는 " + b.Fibonacci(n) + "입니다.");

        System.out.println("\n< Recursive Squaring >");
        RecursiveSquaring rs = new RecursiveSquaring();

        System.out.println("\n" + n + "번째 피보나치 수는 " + rs.Fibonacci(n) + "입니다.");
    }
}
