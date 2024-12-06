package Leetcode_solutions.TwoPointers;

//problem link: https://leetcode.com/problems/reverse-vowels-of-a-string/description/
public class reverseVowelsOfAString {

    // public static char[] swap(String str, int i, int j) {
    // char[] ch = str.toCharArray();
    // char temp = ch[i];
    // ch[i] = ch[j];
    // ch[j] = temp;
    // return ch;
    // }

    // removed to optimize code and use built in function to convert char array to
    // string this change significantly improved time complexity
    // public static String toString(char[] arr) {
    // String s = "";
    // for (int i = 0; i < arr.length; i++) {
    // s += arr[i];
    // }
    // return s;
    // }

    public static boolean isVowel(char ch) {
        if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'O' || ch == 'U') {
            return true;
        } else if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            return true;
        } else {
            return false;
        }
        // another way to check if char is vowel or not
        // boolean[] isVowel = new boolean[128];
        // for (char v : "aeiuoAEIOU".toCharArray()) {
        // isVowel[v] = true;
        // }
        // return isVowel[ch];
    }

    public static void main(String[] args) {
        String str = "IceCreAm";
        char[] ch = str.toCharArray();
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            while (left < right && !isVowel(ch[left])) {
                left++;
            }
            while (left < right && !isVowel(ch[right])) {
                right--;
            }
            if (isVowel(ch[right]) && isVowel(ch[left])) {
                char temp = ch[left];
                ch[left] = ch[right];
                ch[right] = temp;
                left++;
                right--;
            }
        }
        System.out.println(String.valueOf(ch));
    }
}
