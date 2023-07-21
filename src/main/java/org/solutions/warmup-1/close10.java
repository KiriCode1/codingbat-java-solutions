class close10 {
	public static void main(String... args) {
		System.out.println("close10");
	}

	/*
	 *	Given 2 int values, return whichever value is nearest to the value 10, 
	 *	or return 0 in the event of a tie. Note that Math.abs(n) returns the absolute value of a number.
	 */

	public int solution(int a, int b) {
  		int x = Math.abs(a - 10);
  		int y = Math.abs(b - 10);
  
  		if (x < y) {
   			return a;
  		} else if (y < x) {
    			return b;
  		}
  		return 0;
	}
}
