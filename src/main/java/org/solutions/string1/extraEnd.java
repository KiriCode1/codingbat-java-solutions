class extraEnd {
	public static void main(String... args) {
		System.out.println("extraEnd");
	}

	/*
	 *	Given a string, return a new string made of 3 copies of the last 2 chars of the original string. 
	 *	The string length will be at least 2.
	 */

	public String solution(String str) {
  		if (str.length() == 2) {
    			return str + str + str;
  		}
  		return (str.substring(str.length() - 2, str.length()) 
				+ str.substring(str.length() - 2, str.length()) 
				+ str.substring(str.length() - 2, str.length()));
	}
}
