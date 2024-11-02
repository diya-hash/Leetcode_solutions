class countNumberOfConsistentStrings {
    public int countConsistentStrings(String allowed, String[] words) {
        int count = 0;
        boolean flag = false;
        for (int i = 0; i < words.length; i++) {
            String s = words[i];
            for (int j = 0; j < s.length(); j++) {
                flag = false;
                for (int k = 0; k < allowed.length(); k++) {
                    if (s.charAt(j) == allowed.charAt(k)) {
                        flag = true;
                        break;
                    }
                }
                if (flag == false)
                    break;
            }
            if (flag == true)
                count++;
            System.out.println(flag);
        }
        return count;
    }
}