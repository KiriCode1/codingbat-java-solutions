class biggerTwo {
	public static void main(String... args) {
		System.out.println("biggerTwo");
	}

	/*
	 *	Start with 2 int arrays, a and b, each length 2. 
	 *	Consider the sum of the values in each array. 
	 *	Return the array which has the largest sum. In event of a tie, return a.
	 */

	public int[] solution(int[] a, int[] b) {
  		int[] arr = new int[2];
  		arr[0] = a[0] + a[1];
  		arr[1] = b[0] + b[1];
  
  		if (arr[0] == arr[1]) return a;
  		if (arr[0] > arr[1]) return a;
  
  		return b;
	}
}
