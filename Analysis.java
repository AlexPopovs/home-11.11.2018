package lv.sdacademy.lesson1;

public class Analysis {

    public static void constantComplexity(int n) {
        System.out.println("**** n = " + n + " ****");
        System.out.println();

        // Constant Time
        System.out.println("**** Constant time ****");

        System.out.println("Hey - your input is: " + n);
        System.out.println("Running time not dependent on input size!");
        System.out.println();
    }

    public static void logarithmicComplexity(int n) {

        // Logarithmic Time
        System.out.println("**** Logarithmic Time ****");
        int total = 0;
        for (int i = 1; i < n; i = i * 2) {
            // System.out.println("Hey - I'm busy looking at: " + i);
            total++;
        }
        System.out.println("Total amount of times run: " + total);
        System.out.println();
    }


    public static void linearComplexity(int n) {

        // Linear Time
        System.out.println("**** Linear Time ****");
        int total = 0;
        for (int i = 0; i < n; i++) {
            // System.out.println("Hey - I'm busy looking at: " + i);
            total++;
        }
        System.out.println("Total amount of times run: " + total);
        System.out.println();

    }

    public static void nLogNComplexity(int n) {

        // N Log N Time
        System.out.println("**** nlogn Time ****");
        int total = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < n; j = j * 2) {
                // System.out.println("Hey - I'm busy looking at: " + i + " and " + j);
                total++;
            }
        }
        System.out.println("Total amount of times run: " + total);
        System.out.println();
    }

    public static void quadraticComplexity(int n) {
        // Quadratic Time
        System.out.println("**** Quadratic Time ****");
        int total = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                // System.out.println("Hey - I'm busy looking at: " + i + " and " + j);
                total++;
            }
        }
        System.out.println("Total amount of times run: " + total);
        System.out.println();
    }


    public static void cubicComplexity(int n) {
        // Cubic Time
        System.out.println("**** Cubic Time ****");
        int total = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                for (int k = 1; k <= n; k++) {
                    // System.out.println("Hey - I'm busy looking at: " + i + " and " + j + " and " + k);
                    total++;
                }
            }
        }
        System.out.println("Total amount of times run: " + total);
        System.out.println();
    }

    public static void exponentialComplexity(int n) {
        // Exponential Time
        System.out.println("**** Exponential Time ****");
        int total = 0;
        for (int i = 1; i <= Math.pow(2, n); i++) {
            // System.out.println("Hey - I'm busy looking at: " + i);
            total++;
        }
        System.out.println("Total amount of times run: " + total);
        System.out.println();
    }

    public static void factorialComplexity(int n) {
        // Factorial Time
        System.out.println("**** Factorial Time ****");
        int total = 0;
        for (int i = 1; i <= factorial(n); i++) {
            // System.out.println("Hey - I'm busy looking at: " + i);
            total++;
        }
        System.out.println("Total amount of times run: " + total);
    }

    private static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}
