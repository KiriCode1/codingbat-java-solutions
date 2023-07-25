class plusTwo {
	public static void main(String... args) {
		System.out.println("plusTwo");
	}

	/*
	 *	Given 2 int arrays, each length 2, return a new array length 4 containing all their elements.
	 */

	public int[] solution(int[] a, int[] b) {
  		int[] array = new int[4];
  		array[0] = a[0];
  		array[1] = a[1];
  		array[2] = b[0];
  		array[3] = b[1];
  
  		return array;
	}
}
