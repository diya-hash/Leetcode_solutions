public class removeTrailingZeroes {
    public static void main(String[] args) {
        String s = "51230100";
        String r = "";
        int indx = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != '0') {
                indx = i;
                break;
            }
        }
        for (int i = 0; i <= indx; i++) {
            r += s.charAt(i);
        }
        System.out.println(r);
    }

}
