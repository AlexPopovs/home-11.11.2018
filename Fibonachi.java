package lv.sdacademy.lesson1;

// Implement function that returns n-th element from Fibonacci sequence (1,1,2,3,5,8 ...)
import java.util.Scanner;

public class Fibonachi {

    public static void main(String[] args) {
        Scanner guess = new Scanner(System.in);
        System.out.println("What number you look for?");
        int n = guess.nextInt();

        int second = getIterativeWay(n);
        System.out.println(second);

//   private static int fib(int n) {
//
//        if(n <= 1){
//        return n;
//        }
//        return fib (n - 1) + fib (n - 2);
//        }
    }
    private static int getIterativeWay ( int n){
        if (n == 1 || n == 2) {
            return 1;
        }
        int first = 1;
        int second = 1;

        for (int i = 3; i <= n; i++) {
            int sum = first + second;
            first = second;
            second = sum;
        }

        return second;
    }

}


// iteration (перечисление по порядку)/ recursion (перечисление с возвратом на начало и так по кругу)