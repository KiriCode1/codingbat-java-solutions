class countHi {
	public static void main(String... args) {
		System.out.println("countHi");
	}

	/*
	 *	Given a string, compute recursively (no loops) the number of times lowercase 
	 *	"hi" appears in the string.
	 */

	public int countHiSolution(String str) {
  		if (str.length() == 1 || str.equals("")) {
    			return 0;
  		} else if (str.substring(0, 2).equals("hi")) {
    			return 1 + countHiSolution(str.substring(1));
  		}
  
  		return countHiSolution(str.substring(1));
	}
}
