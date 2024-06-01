package org.example;



public class Fibonacci {
    static String fib(int n) {
        String f = "";

        if (n < 0)
            f = "Invalid";
        if (n == 0)
            f = "0";
        if (n >= 1) {
            int i = 0;
            int j = 1;
            f = "0 1";
            for (int k = 2; k < n; k++) {
                int sum = i + j;
                f = f.concat(String.valueOf(" " + sum));
                i = j;
                j = sum;
            }

        }
        return f;
    }
}








