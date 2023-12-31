class right2 {
	public static void main(String... args) {
		System.out.println("right2");
	}

	/*
	 *	Given a string, return a "rotated right 2" version where the last 2 chars are 
	 *	moved to the start. The string length will be at least 2.
	 */

	public String solution(String str) {
  		if (str.length() <= 2) {
    			return str;
  		}
  
  		String end = str.substring(str.length() - 2, str.length());
  		String startToMid = str.substring(0, str.length() - 2);
  
  		return end + startToMid;
	}
}
