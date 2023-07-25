class make2 {
	public static void main(String... args) {
		System.out.println("make2");
	}

	/*
	 *	Given 2 int arrays, a and b, return a new array length 2 containing, as much as will fit, 
	 *	the elements from a followed by the elements from b. The arrays may be any length, including 0, 
	 *	but there will be 2 or more elements available between the 2 arrays.
	 */

	public int[] solution(int[] a, int[] b) {
  		int[] array = new int[2];
  		if (a.length == 2) {
    			return a;
  		} else if (a.length == 1) {
    			array[0] = a[0];
    			array[1] = b[0];
  		} else if (a.length == 0) {
    			return b;
  		} else if (b.length == 0) {
    			array[0] = a[0];
    			array[1] = a[1];
  		} else {
    			array[0] = a[0];
   			array[1] = a[1];
  		}
  		return array;
	}
}
