class middleThree {
	public static void main(String... args) {
		System.out.println("middleThree");
	}

	/*
	 *	Given a string of odd length, return the string length 3 from its middle, 
	 *	so "Candy" yields "and". The string length will be at least 3.
	 */

	public String solution(String str) {
  		if (str.length() <= 3) {
    			return str;
  		}
  
  		return str.substring(str.length() / 2 - 1, str.length() / 2 + 2);
	}
}
