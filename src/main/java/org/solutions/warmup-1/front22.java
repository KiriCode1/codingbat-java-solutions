class front22 {
	public static void main(String... args) {
		System.out.println("front22");
	}

	/*
	 *	Given a string, take the first 2 chars and 
	 *	return the string with the 2 chars added at both the front and back, 
	 *	so "kitten" yields"kikittenki". If the string length is less than 2, use whatever chars are there.
	 */

	public String solution(String str) {
  		if (str.length() <= 1) {
    			return str + str + str;
  		} else {
    			String front = str.substring(0, 2);
    			return front + str + front;
  		}
	}
}
