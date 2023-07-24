class count7 {
	public static void main(String... args) {
		System.out.println("count7");
	}

	/*
	 *	Given a non-negative int n, return the count of the occurrences of 7 as a digit, 
	 *	so for example 717 yields 2. (no loops). 
	 *	Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), 
	 *	while divide (/) by 10 removes the rightmost digit (126 / 10 is 12).
	 */

	public int solutionCount7(int n) {
  		if (n < 1) {
    			return 0;
  		} else if (n % 10 == 7) {
    			return 1 + solutionCount7(n / 10);
  		}
  
  			return solutionCount7(n / 10);
	}
}
