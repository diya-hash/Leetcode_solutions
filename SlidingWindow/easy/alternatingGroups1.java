package SlidingWindow.easy;

import java.util.Arrays;

public class alternatingGroups1 {
    public static void main(String[] args) {
        int[] colors = { 0, 1, 0, 0, 1 };
        int n = colors.length;
        int alternatingGroups = 0;
        for (int i = 0; i < n - 2; i++) {
            if (colors[i] == colors[i + 2] && colors[i] != colors[i + 1])
                alternatingGroups++;
        }
        if (colors[0] == colors[n - 2] && colors[0] != colors[n - 1])
            alternatingGroups++;
        if (colors[1] == colors[n - 1] && colors[1] != colors[0])
            alternatingGroups++;
        System.out.println(alternatingGroups);
    }
}