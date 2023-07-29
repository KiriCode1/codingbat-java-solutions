class comboString {
	public static void main(String... args) {
		System.out.println("comboString");
	}

	/*
	 *	Given 2 strings, a and b, return a string of the form short+long+short, 
	 *	with the shorter string on the outside and the longer string on the inside. 
	 *	The strings will not be the same length, but they may be empty (length 0).
	 */

	public String solution(String a, String b) {
  		if (a.length() > b.length()) {
    			return b + a + b;
  		}
  		return a + b + a;
	}
}
