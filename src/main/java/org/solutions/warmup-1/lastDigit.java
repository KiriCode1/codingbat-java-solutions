class lastDigit {
	public static void main(String... args) {
		System.out.println("lastDigit");
	}

	/*
	 *	Given two non-negative int values, return true if they have the same last digit, 
	 *	such as with 27 and 57. Note that the % "mod" operator computes remainders, so 17 % 10 is 7.
	 */

	public boolean solution(int a, int b) {
  		if (a % 10 == b % 10) {
    			return true;
  		}
  		return false;
	}
}
