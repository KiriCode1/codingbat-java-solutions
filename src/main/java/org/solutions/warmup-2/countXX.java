class countXX {
	public static void main(String... args) {
		System.out.println("countXX");
	}

	/*
	 *	Count the number of "xx" in the given string. 
	 *	We'll say that overlapping is allowed, so "xxx" contains 2 "xx".
	 */

	int solution(String str) {
  		int count = 0;
  		for (int i = 0; i < str.length() - 1; i++) {
    			if (str.length() == 3) {
      				if (str.charAt(i) == 'x' && str.charAt(i + 1) == 'x') {
        				count += 1;
      				}
    			} else {
      				if (str.charAt(i) == 'x' && str.charAt(i + 1) == 'x') {
        				count++;
      				}
    			}
  		}
  		return count;
	}
}
