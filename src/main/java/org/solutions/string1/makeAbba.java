class makeAbba {
	public static void main(String... args) {
		System.out.println("makeAbba");
	}

	/*
	 *	Given two strings, a and b, return the result of putting them together in the order abba, 
	 *	e.g. "Hi" and "Bye" returns "HiByeByeHi".
	 */

	public String solution(String a, String b) {
  		return a + b + b + a; 
	}
}
