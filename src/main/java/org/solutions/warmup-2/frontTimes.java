class frontTimes {
	public static void main(String... args) {
		System.out.println("frontTimes");
	}

	/*
	 *	Given a string and a non-negative int n, 
	 *	we'll say that the front of the string is the first 3 chars, 
	 *	or whatever is there if the string is less than length 3. Return n copies of the front;
	 */

	public String solution(String str, int n) {
  		int frontLen = 3;
  		if (frontLen > str.length()) {
    			frontLen = str.length();
  		}

  		String front = str.substring(0, frontLen);
  
  		String result = "";
  		for (int i = 0; i < n; i++) {
    			result = result + front;
  		}
  		return result;
	}
}
