class RepeatEnd {
	public static void main(String... args) {
		System.out.println("RepeatEnd");
	}

	/*
	 *	Given a string and an int n, return a string made of n repetitions of the last n 
	 *	characters of the string. 
	 *	You may assume that n is between 0 and the length of the string, inclusive.
	 */

	public String repeatEnd(String str, int n) {
  		String repeated = new String(new char[n]).replace("\0", str.substring(str.length() - n, str.length()));

  		return repeated;
	}
}
