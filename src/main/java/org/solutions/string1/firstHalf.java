class firstHalf {
	public static void main(String... args) {
		System.out.println("firstHalf");
	}

	/*
	 *	Given a string of even length, return the first half. So the string "WooHoo" yields "Woo".
	 */

	public String solution(String str) {
  		return str.substring(0, str.length() / 2);
	}
}
