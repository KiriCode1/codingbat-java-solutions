class conCat {
	public static void main(String... args) {
		System.out.println("conCat");
	}

	/*
	 *	Given two strings, append them together (known as "concatenation") and return the result. 
	 *	However, if the concatenation creates a double-char, then omit one of the chars, 
	 *	so "abc" and "cat" yields "abcat".
	 */

	public String solution(String a, String b) {
  		if (a.equals("") || b.equals("")) {
    			return a + b;
  		}
  
  		if (a.charAt(a.length() - 1) == b.charAt(0)) {
    			return a.substring(0, a.length() - 1) + b;
  		}
  		return a + b;
	}
}
