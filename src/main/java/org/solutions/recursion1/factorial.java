class factorial {
	public static void main(String... args) {
		System.out.println("factorial");
	}

	/*
	 *	Given n of 1 or more, return the factorial of n, which is n * (n-1) * (n-2) ... 1. 
	 *	Compute the result recursively (without loops).
	 */

	public int factSolution(int n) {
  		if (n == 0) {
    			return 1;
  		}
  		return n * factSolution(n - 1);
	}
}
