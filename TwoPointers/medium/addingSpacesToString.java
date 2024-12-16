public class addingSpacesToString {
    public static void main(String[] args) {
        String s = "LeetcodeHelpsMeLearn";
        int[] spaces = { 8, 13, 15 };
        StringBuilder sb = new StringBuilder();
        int j = 0;
        for (int i = 0; i < spaces.length; i++) {

            sb.append(s.substring(j, spaces[i]));
            sb.append(" ");
            j = spaces[i];
        }
        sb.append(s.substring(j, s.length()));
        System.out.println(sb.toString());
    }
}