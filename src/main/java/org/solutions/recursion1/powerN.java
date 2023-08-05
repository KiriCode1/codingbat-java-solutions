class powerN {
	public static void main(String... args) {
		System.out.println("powerN");
	}

	/*
	 *	Given base and n that are both 1 or more, compute recursively (no loops) 
	 *	the value of base to the n power, so powerN(3, 2) is 9 (3 squared).
	 */

	public int powerNSolution(int base, int n) {
  		if (n == 1) {
    			return base;
  		}
  
  		return base * powerNSolution(base, n - 1);
	}
}
