class minCat {
	public static void main(String... args) {
		System.out.println("minCat");
	}

	/*
	 *	Given two strings, append them together (known as "concatenation") and return the result. 
	 *	However, if the strings are different lengths, omit chars from the longer string 
	 *	so it is the same length as the shorter string. So "Hello" and "Hi" yield "loHi". 
	 *	The strings may be any length.
	 */

	public String solution(String a, String b) {
  		if (a.length() > b.length()) {
    			return a.substring(a.length() - b.length(), a.length()) + b;
  		} else if (b.length() > a.length()) {
    			return a + b.substring(b.length() - a.length(), b.length());
  		}
  		return a + b;
	}
}
