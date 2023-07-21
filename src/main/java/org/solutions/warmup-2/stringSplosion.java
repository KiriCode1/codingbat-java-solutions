class stringSplosion {
	public static void main(String... args) {
		System.out.println("stringSplosion");
	}

	/*
	 *	Given a non-empty string like "Code" return a string like "CCoCodCode"
	 */

	public String solution(String str) {
  		if (str.length() == 1) {
			return str;
  		} else if (str.length() == 2) {
    			return str.substring(0, 1) + str;
  		} else if (str.length() == 3) {
    			return str.substring(0, 1) + str.substring(0, 2) + str.substring(0, 3);
  		} else if (str.length() == 4) {
    			return str.substring(0, 1) + str.substring(0, 2) + str.substring(0, 3) + str.substring(0, 4);
  		} else if (str.length() == 5) {
    			return str.substring(0, 1) + str.substring(0, 2) + str.substring(0, 3) + str.substring(0, 4) + str.substring(0, 5);
  		} else if (str.length() == 6) {
    			return str.substring(0, 1) + str.substring(0, 2) + str.substring(0, 3) + str.substring(0, 4) + str.substring(0, 5) + str.substring(0, 6);
  		}
  
  		return "";
	}
}
