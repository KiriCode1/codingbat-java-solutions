class seeColor {
	public static void main(String... args) {
		System.out.println("seeColor");
	}

	/*
	 *	Given a string, if the string begins with "red" or "blue" return that color string, 
	 *	otherwise return the empty string.
	 */

	public String solution(String str) {
  		if (str.equals("red")) {
    			return str;
  		}
  		if (str.length() <= 3) {
    			return "";
  		}
  		if (str.substring(0, 3).equals("red")) {
    			return str.substring(0, 3);
  		} else if (str.substring(0, 4).equals("blue")) {
    			return str.substring(0, 4);
  		}
  		return "";
	}
}
