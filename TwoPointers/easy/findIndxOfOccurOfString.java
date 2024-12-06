package easy;

public class findIndxOfOccurOfString {
    public static void main(String[] args) {
        String haystack = "baabbbbababbbabab";
        String needle = "abbab";
        int result = -1;

        if (needle.length() > haystack.length())
            result = -1;
        else if (haystack.equals(needle))
            result = 0;
        else {
            for (int i = 0; i < haystack.length(); i++) {
                int right = i + needle.length();
                if (right <= haystack.length()) {
                    if (haystack.substring(i, right).equals(needle)) {
                        result = i;
                        System.out.println(needle);
                        break;
                    }
                }
            }
        }
        System.out.println(result);
    }
}
