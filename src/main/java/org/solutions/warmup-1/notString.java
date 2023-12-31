class notString {
	public static void main(String... args) {
		System.out.println("notString");
	}

	/*
	 *	Given a string, return a new string where "not " has been added to the front. 
	 *	However, if the string already begins with "not", return the string unchanged. 
	 *	Note: use .equals() to compare 2 strings.
	 */

	public String solution(String str) {
  		if (str.length() < 3) {
    			return "not " + str;
  		}
  		if (str.substring(0, 3).equals("not")) {
    			return str;
  		} else {
    			return "not " + str;
  		}
	}
}
