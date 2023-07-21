class frontBack {
	public static void main(String... args) {
		System.out.println("frontBack");
	}

	/*
	 *	Given a string, return a new string where the first and last chars have been exchanged.
	 */

	public String solution(String str) {
  		if (str.length() <= 1) {
    			return str;
  		}
  		String mid = str.substring(1, str.length() - 1);
  		return str.charAt(str.length() - 1) + mid + str.charAt(0);
	}
}
