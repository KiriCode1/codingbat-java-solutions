class front3 {
	public static void main(String... args) {
		System.out.println("front3");
	}

	/*
	 *	Given a string, we'll say that the front is the first 3 chars of the string. 
	 *	If the string length is less than 3, the front is whatever is there. 
	 *	Return a new string which is 3 copies of the front.
	 */

	public String solution(String str) {
  		if (str.length() < 3) {
    			return str + str + str;
  		} else {
    			return str.substring(0, 3) + str.substring(0, 3) + str.substring(0, 3);
  		}
	}
}
