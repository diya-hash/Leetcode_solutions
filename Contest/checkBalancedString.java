public class checkBalancedString {
    public static void main(String[] args) {
        String num = "24123";
        int countOdd = 0;
        int countEven = 0;

        for (int i = 0; i < num.length(); i++) {
            if (i % 2 == 0) {
                int n = num.charAt(i) - '0';
                countEven += n;
            } else {
                int n = num.charAt(i) - '0';
                countOdd += n;
            }
        }
        if (countEven == countOdd)
            System.out.println(true);
        else
            System.out.println(false);
    }
}
