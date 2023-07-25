class countAbc {
	public static void main(String... args) {
		System.out.println("countAbc");
	}

	/*
	 *	Count recursively the total number of "abc" and "aba" substrings that appear in the given string.
	 */

	public int countAbcSolution(String str) {
  		int index = 0;
  
  		if (index + 3 > str.length()) {
    			return 0;
  		} else if (str.substring(index, index + 3).equals("abc") 
            		   || str.substring(index, index + 3).equals("aba")) {
    			return 1 + countAbcSolution(str.substring(index + 1));
  		}
  
  		return countAbcSolution(str.substring(index + 1));
	}
}
