package Recursion;

import java.util.HashMap;

public class memoization_example {
    private static HashMap<Integer, Integer> map = new HashMap<>();

    public static int fib(int n) {
        map.put(1, 1);
        map.put(0, 0);
        if (map.containsKey(n)) {
            return map.get(n);
        }
        int result = fib(n - 1) + fib(n - 2);
        map.put(n, result);
        return result;
    }

    public static void main(String[] args) {
        int fib = fib(6);
        System.out.println(fib);
    }
}
// reference: https://www.youtube.com/watch?v=IJDJ0kBx2LM