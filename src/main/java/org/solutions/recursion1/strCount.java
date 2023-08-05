class strCount {
	public static void main(String... args) {
		System.out.println("strCount");
	}

	/*
	 *	Given a string and a non-empty substring sub, compute recursively the number of times 
	 *	that sub appears in the string, without the sub strings overlapping.
	 */

	public int strCountSolution(String str, String sub) {
  		if (str.length() < sub.length() 
      		    || str.length() == 0
                    || sub.length() == 0) {
    			return 0;    
  		} else if (str.substring(0, sub.length()).equals(sub)) {
    			return 1 + strCountSolution(str.substring(sub.length()), sub);
  		}
  
  		return strCountSolution(str.substring(1), sub);
	}
}
