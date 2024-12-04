public class validPalindromeII {

    public static void main(String[] args) {
        String s = "abc";

        char[] ch = s.toCharArray();
        int right = s.length() - 1;
        int left = 0;
        boolean isPalindrome = true;
        StringBuilder sb = new StringBuilder();
        // StringBuilder sb1 = new StringBuilder();
        // StringBuilder sb2 = new StringBuilder();
        while (left < right) {
            if (ch[left] != ch[right]) {
                String ns1 = sb.append(s).deleteCharAt(left).toString();
                sb.setLength(0);
                String ns1_r = sb.append(s).deleteCharAt(left).reverse().toString();
                System.out.println(ns1 + "\t" + ns1_r);
                if (ns1.equals(ns1_r)) {
                    isPalindrome = true;
                    break;
                }
                sb.setLength(0);
                ns1 = sb.append(s).deleteCharAt(right).toString();
                sb.setLength(0);
                ns1_r = sb.append(s).deleteCharAt(right).reverse().toString();
                System.out.println(ns1 + "\t" + ns1_r);
                if (ns1.equals(ns1_r)) {
                    isPalindrome = true;
                    break;
                } else {
                    isPalindrome = false;
                    break;
                }
            }
            left++;
            right--;
        }
        System.out.println(isPalindrome);
    }
}
// StringBuilder sb = new StringBuilder();
// String r = "";
// boolean isPresent = false;
// int left = 0;
// int right = s.length() - 1;
// r = sb.append(s).reverse().toString();
// if (s.equals(r)) {
// isPresent = true;
// } else {
// while (left < right) {
// if (s.charAt(right) != s.charAt(left)) {
// if (isPalindrome(s, right)) {
// isPresent = true;
// break;
// }else if(isPalindrome(s, left)){
// isPresent = true;
// break;
// }
// }
// left++;
// right--;
// }

// }
// System.out.println(isPresent);

// public static boolean isPalindrome(String s, int n) {
// StringBuilder sb1 = new StringBuilder();
// StringBuilder sb2 = new StringBuilder();
// String r = sb1.append(s).deleteCharAt(n).reverse().toString();
// s = sb2.append(s).deleteCharAt(n).toString();

// System.out.println(r + "\t " + s);
// if (s.equals(r)) {
// return true;
// } else {
// return false;
// }
// }