class front11 {
	public static void main(String... args) {
		System.out.println("front11");
	}

	/*
	 *	Given 2 int arrays, a and b, of any length, return a new array with 
	 *	the first element of each array. If either array is length 0, ignore that array.
	 */

	public int[] solution(int[] a, int[] b) {
  		if (a.length != 0 && b.length != 0) {
    			int[] array = new int[2];
    			array[0] = a[0];
    			array[1] = b[0];
    			return array;
  		} 
  
  		int[] newArr = new int[1];
  		if (a.length == 0 && b.length != 0) {
    			newArr[0] = b[0];
    			return newArr;
  		} else if (a.length != 0 && b.length == 0) {
    			newArr[0] = a[0];
    			return newArr;
  		}
  
  		int[] lst = new int[0];
  		return lst;
	}
}
