class maxMod5 {
	public static void main(String... args) {
		System.out.println("maxMod5");
	}

	/*
	 *	Given two int values, return whichever value is larger. 
	 *	However if the two values have the same remainder when divided by 5, 
	 *	then the return the smaller value. However, in all cases, if the two values are the same, return 0. 
	 *	Note: the % "mod" operator computes the remainder, e.g. 7 % 5 is 2.
	 */

	public int solution(int a, int b) {
  		if (a == b) {
    			return 0;
  		}
  		if (a % 5 == b % 5) {
    			return Math.min(a, b);
  		}
  		return Math.max(a, b);
	}
}
