package Recursion;

import java.util.HashMap;

public class NthTribonacciNumber {
    private static HashMap<Integer, Integer> map = new HashMap<>();

    public static int tribonacci(int n) {
        map.put(0, 0);
        map.put(1, 1);
        map.put(2, 1);
        if (map.containsKey(n))
            return map.get(n);
        int result = tribonacci(n - 1) + tribonacci(n - 2) + tribonacci(n - 3);
        map.put(n, result);
        return result;
    }

    public static void main(String[] args) {
        System.out.println(tribonacci(25));
    }
}
