class less20 {
	public static void main(String... args) {
		System.out.println("less20");
	}

	/*
	 *	Return true if the given non-negative number is 1 or 2 less than a multiple of 20. 
	 *	So for example 38 and 39 return true, but 40 returns false.
	 */

	public boolean solution(int n) {
  		if ((n - 2) % 20 == 0 && (n - 1) % 20 == 0) {
    			return true;
  		} else if ((n + 2) % 20 == 0 || (n + 1) % 20 == 0) {
    			return true;
  		}
  		return false;
	}
}
