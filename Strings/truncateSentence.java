public class truncateSentence {
    public static void main(String[] args) {
        String s = "chopper is not a tanuki";
        String result = "";
        int k = 5;
        int count = 0;
        int indx = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ')
                count++;
            if (count == k) {
                indx = i;
                break;
            }
            result += s.charAt(i);
        }
        System.out.println(result);

    }

}
