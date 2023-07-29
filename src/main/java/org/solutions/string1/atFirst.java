class atFirst {
	public static void main(String... args) {
		System.out.println("atFirst");
	}

	/*
	 *	Given a string, return a string length 2 made of its first 2 chars. 
	 *	If the string length is less than 2, use '@' for the missing chars.
	 */

	public String solution(String str) {
  		if (str.equals("")) {
    			return "@@";
  		}
  		if (str.length() < 2) {
    			return str + "@";
  		}
  		return str.substring(0, 2);
	}
}
