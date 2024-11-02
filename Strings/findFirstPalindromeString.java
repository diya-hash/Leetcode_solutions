//problem link: https://leetcode.com/problems/find-first-palindromic-string-in-the-array/description/
class findFirstPalindromeString {
	public String firstPalindrome(String[] words) {
		String rev = "";
		String result = "";
		for (int i = 0; i < words.length; i++) {
			rev = "";
			String s = words[i];

			for (int j = 0; j < s.length(); j++)
				rev = s.charAt(j) + rev;

			if (s.equals(rev)) {
				result = s;
				break;
			}
		}
		return result;
	}
}