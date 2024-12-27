package SlidingWindow.easy;

import java.util.Arrays;

public class alternatingGroups1 {
    public static void main(String[] args) {
        int[] colors = { 0, 1, 0, 0, 1 };
        int left = colors.length - 1;
        int right = 1;
        int alternatingGroups = 0;
        for (int i = 0; i < colors.length; i++) {
            if (colors[left] != colors[i] && colors[i] != colors[right]) {
                alternatingGroups++;
            }
            right++;
            left++;
            if (left >= colors.length)
                left = left % colors.length;
            else if (right >= colors.length)
                right = right % colors.length;
        }
        System.out.println(alternatingGroups);
    }
}