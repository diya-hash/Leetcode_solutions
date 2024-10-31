public class ReverseString {
    public static void swap(char[] s, int left, int right) {
        char temp = s[left];
        s[left] = s[right];
        s[right] = temp;
    }

    public static void main(String[] args) {
        char[] s = { 'h', 'e', 'l', 'p' };
        int left = 0;
        int right = s.length - 1;
        while (left < right) {
            System.out.println("left: " + left);
            System.out.println("right" + right);
            swap(s, left, right);
            System.out.println(s);
            left++;
            right--;

        }
        System.out.println(s);
    }
}
