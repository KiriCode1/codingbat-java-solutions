class more20 {
	public static void main(String... args) {
		System.out.println("more20");
	}

	/*
	 *	Return true if the given non-negative number is 1 or 2 more than a multiple of 20.
	 */

	public boolean solution(int n) {
  		if ((n - 1) % 20 == 0 || (n - 2) % 20 == 0) {
    			return true;
  		}
  		return false;
	}
}
