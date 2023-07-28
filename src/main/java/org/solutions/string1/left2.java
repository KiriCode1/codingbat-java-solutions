class left2 {
	public static void main(String... args) {
		System.out.println("left2");
	}

	/*
	 *	Given a string, return a "rotated left 2" version where the first 2 chars are moved to the end. 
	 *	The string length will be at least 2.
	 */

	public String solution(String str) {
  		if (str.length() <= 2) {
    			return str;
  		}
  
  		String start = str.substring(0, 2);
  		String midToEnd = str.substring(2, str.length());
  
  		return midToEnd + start;
}
}
