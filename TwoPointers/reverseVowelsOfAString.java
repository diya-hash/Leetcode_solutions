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

    public static String toString(char[] arr) {
        String s = "";
        for (int i = 0; i < arr.length; i++) {
            s += arr[i];
        }
        return s;
    }

    public static boolean isVowel(char ch) {
        if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'O' || ch == 'U') {
            return true;
        } else if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        String str = "IceCreAm";
        char[] ch = str.toCharArray();
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (isVowel(ch[right]) && isVowel(ch[left])) {
                char temp = ch[left];
                ch[left] = ch[right];
                ch[right] = temp;
                left++;
                right--;
            } else if (!isVowel(ch[right])) {
                right--;
            } else if (!isVowel(ch[left])) {
                left++;
            }
        }
        str = toString(ch);
        System.out.println(str);
    }
}
