package SlidingWindow.easy;

public class countSubstrThatSatisfyKConstraint {
    public static void main(String[] args) {
        String s = "10101";
        int k = 1;
        char[] ch = s.toCharArray();
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            int one = 0;
            int zero = 0;
            for (int j = i; j < s.length(); j++) {
                if (ch[j] == '1')
                    one++;
                else if (ch[j] == '0')
                    zero++;
                if (one <= k || zero <= k)
                    count++;

            }
            System.out.println(count);
        }

    }
}
