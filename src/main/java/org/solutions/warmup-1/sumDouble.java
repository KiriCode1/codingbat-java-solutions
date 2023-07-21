class sumDouble {
	public static void main(String... args) {
		System.out.println("sumDouble");
	}

	/*
	 *	Given two int values, return their sum. 
	 *	Unless the two values are the same, then return double their sum.
	 */

	public int solution(int a, int b) {
  		if (a == b) {
    			return (a + b) * 2;
  		} else {
    			return a + b;
  		}
	}
}
