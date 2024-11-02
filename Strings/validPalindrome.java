class validPalindrome {
	public boolean isPalindrome(String s) {
		String result = "";

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z' || s.charAt(i) >= 'a' && s.charAt(i) <= 'z'
					|| s.charAt(i) >= '0' && s.charAt(i) <= '9') {
				if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')
					result += Character.toLowerCase(s.charAt(i));
				else
					result += s.charAt(i);
			}
		}
		String rev = "";
		for (int i = result.length() - 1; i >= 0; i--) {
			rev += result.charAt(i);
		}

		if (rev.equals(result))
			return true;
		else
			return false;
	}
}