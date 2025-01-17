package medium;

import java.util.HashSet;

public class reportSpamMsg {
    public static void main(String[] args) {
        String[] message = { "l", "i", "l", "i", "l" };
        String[] bannedWords = { "l", "i", "l", "i", "l" };
        HashSet<String> set = new HashSet<>(bannedWords.length + bannedWords.length / 3 + 1);
        int count = 0;
        boolean isSpam = false;

        for (String words : bannedWords) {
            set.add(words);
        }
        for (int i = 0; i < message.length; i++) {
            if (set.contains(message[i])) {
                count++;
                if (count == 2) {
                    isSpam = true;
                    break;
                }
            }
        }
        System.out.println(isSpam);
    }
}