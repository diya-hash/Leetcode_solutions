class scoreOfAString {
	public int scoreOfString(String s) {
		int count = 0;
		for (int i = 0; i < s.length() - 1; i++) {
			int diff = Math.abs((int) s.charAt(i) - (int) s.charAt(i + 1));
			count += diff;
		}
		return count;
	}
}