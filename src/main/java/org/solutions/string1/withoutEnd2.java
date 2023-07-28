class withoutEnd2 {
	public static void main(String... args) {
		System.out.println("withoutEnd2");
	}

	/*
	 *	Given a string, return a version without both the first and last char of the string. 
	 *	The string may be any length, including 0.
	 */

	public String solution(String str) {
  		if (str.length() <= 1) {
    			return "";
  		}
  
  		return str.substring(1, str.length() - 1);
	}
}
