package Recursion;

import java.util.HashMap;
import java.util.Map;

public class fibonacciNumber {
    private static Map<Integer, Integer> map = new HashMap<>();

    public static int fib(int n) {
        map.put(0, 0);
        map.put(1, 1);
        if (map.containsKey(n))
            return map.get(n);

        int result = fib(n - 1) + fib(n - 2);
        map.put(n, result);
        return result;
    }

    public static void main(String[] args) {
        System.out.println(fib(3));
    }
}
