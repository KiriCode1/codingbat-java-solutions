class stringTimes {
	public static void main(String... args) {
		System.out.println("stringTimes");
	}

	/*
	 *	Given a string and a non-negative int n, 
	 *	return a larger string that is n copies of the original string.
	 */

	public String solution(String str, int n) {
  		String result = "";
  		for (int i = 0; i < n; i++) {
    			result += str;
  		}
  		return result;
	}
}
