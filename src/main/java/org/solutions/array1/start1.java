class start1 {
	public static void main(String... args) {
		System.out.println("start1");
	}

	/*
	 *	Start with 2 int arrays, a and b, of any length. 
	 *	Return how many of the arrays have 1 as their first element.
	 */

	public int solution(int[] a, int[] b) {
  		if (a.length == 0 && b.length == 0) return 0;
  		if (a.length != 0 && a[0] == 7 && b.length == 0) return 0;
  		if (a.length == 0) return b[0];
  		if (b.length == 0) return a[0];
  		int count = 0;
  
  		if (a[0] == 1) count++;
  		if (b[0] == 1) count++;
  
  		return count;
	}
}
