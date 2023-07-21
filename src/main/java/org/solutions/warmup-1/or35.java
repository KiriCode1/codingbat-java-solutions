class or35 {
	public static void main(String... args) {
		System.out.println("or35");
	}

	/*
	 *	Return true if the given non-negative number is a multiple of 3 or a multiple of 5.
	 */

	public boolean solution(int n) {
  		if ((n % 5 == 0) || (n % 3 == 0)) {
    			return true;
  		}
  		return false;
	}
}
