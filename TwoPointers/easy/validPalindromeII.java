public class validPalindromeII {

    public static void main(String[] args) {
        String s = "abc";

        char[] ch = s.toCharArray();
        int right = s.length() - 1;
        int left = 0;
        boolean isPalindrome = true;
        StringBuilder sb = new StringBuilder();
        while (left < right) {
            if (ch[left] != ch[right]) {
                String ns1 = sb.append(s).deleteCharAt(left).toString();
                sb.setLength(0);
                String ns1_r = sb.append(s).deleteCharAt(left).reverse().toString();
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