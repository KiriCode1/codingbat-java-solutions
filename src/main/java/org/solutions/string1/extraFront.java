class extraFront {
	public static void main(String... args) {
		System.out.println("extraFront");
	}

	/*
	 *	Given a string, return a new string made of 3 copies of the first 2 chars of 
	 *	the original string. The string may be any length. 
	 *	If there are fewer than 2 chars, use whatever is there.
	 */

	public String solution(String str) {
  		if (str.length() < 2) {
    			return str + str + str;
  		}
  		return str.substring(0, 2) + str.substring(0, 2) + str.substring(0, 2);
	}
}
