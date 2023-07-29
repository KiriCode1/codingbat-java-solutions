class withoutX2 {
	public static void main(String... args) {
		System.out.println("withoutX2");
	}

	/*
	 *	Given a string, if one or both of the first 2 chars is 'x', 
	 *	return the string without those 'x' chars, and otherwise return the string unchanged. 
	 *	This is a little harder than it looks.
	 */

	public String solution(String str) {
  		if (str.length() <= 1) {
    			return "";
  		}

  		if (str.charAt(0) == 'x' && str.charAt(1) == 'x') {
    			return str.substring(2, str.length());
  		}  
  
  		if (str.charAt(0) == 'x') {
    			return str.substring(1, str.length());
  		} else if (str.charAt(1) == 'x') {
    			return str.substring(0, 1) + str.substring(2, str.length());
  		}
  		return str;
	}
}
