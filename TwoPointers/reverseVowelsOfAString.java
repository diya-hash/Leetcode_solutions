package Leetcode_solutions.TwoPointers;

//problem link: https://leetcode.com/problems/reverse-vowels-of-a-string/description/
public class reverseVowelsOfAString {
    public static void main(String[] args) {
        String str = "IceCreAm";
        StringBuilder s = new StringBuilder(str);
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            System.out.println("at first right = " + right);
            System.out.println("at first left = " + left);
            if (str.charAt(left) != 'I' || str.charAt(left) != 'e' || str.charAt(left) != 'A') {
                left++;
            }
            if (str.charAt(right) != 'I' || str.charAt(right) != 'e' || str.charAt(right) != 'A') {
                right--;

            }
            System.out.println("right = " + right);
            System.out.println("left = " + left);
            char temp = s.charAt(left);
            s.insert(left, s.charAt(right));
            s.insert(left, temp);

        }
        str = s.toString();
        System.out.println(str);

    }
}
