class twoChar {
	public static void main(String... args) {
		System.out.println("twoChar");
	}

	/*
	 *	Given a string and an index, return a string length 2 starting at the given index. 
	 *	If the index is too big or too small to define a string length 2, use the first 2 chars. 
	 *	The string length will be at least 2.
	 */

	public String solution(String str, int index) {
  		if (str.length() <= 5 && index + 1 >= str.length()) {
    			return str.substring(0, 2);
  		}
  
  		if (Math.abs(index) != index) {
    			return str.substring(0, 2);
  		}
  		return str.substring(index, index + 2);
	}
}
