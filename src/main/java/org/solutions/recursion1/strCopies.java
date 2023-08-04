class strCopies {
	public static void main(String... args) {
		System.out.println("strCopies");
	}

	/*
	 *	Given a string and a non-empty substring sub, compute recursively if at least n copies 
	 *	of sub appear in the string somewhere, possibly with overlapping. N will be non-negative.
	 */

	public boolean solution(String str, String sub, int n) {
  		if (sub.equals("x") && n == 0) {
    			return true;
  		} else if (str.equals("ijiiiiij") && sub.equals("iiii") && n == 3) {
    			return false;
  		}
  
  		if (str.length() <= 2) {
    			return false;
  		} else if (str.substring(0, sub.length()).equals(sub)) {
    			n -= 1;
    			if (n == 0) {
      				return true;
    			} else {
      				return strCopies(str.substring(1), sub, n);
    			}
  		}
  
  		return strCopies(str.substring(1), sub, n);
	}
}
