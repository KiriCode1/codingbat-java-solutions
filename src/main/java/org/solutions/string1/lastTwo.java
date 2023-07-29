class lastTwo {
	public static void main(String... args) {
		System.out.println("lastTwo");
	}

	/*
	 *	Given a string of any length, return a new string where the last 2 chars, 
	 *	if present, are swapped, so "coding" yields "codign".
	 */

	public String solution(String str) {
  		if (str.equals("") || str.length() == 1) {
    			return str;
  		}
  		String preLast = str.substring(str.length() - 2, str.length() - 1);
  		String last = str.substring(str.length() - 1, str.length());
  		String startToMid = str.substring(0, str.length() - 2);
  
  		return startToMid + last + preLast;
	}
}
