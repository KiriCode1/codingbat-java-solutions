class strDist {
	public static void main(String... args) {
		System.out.println("strDist");
	}

	/*
	 *	Given a string and a non-empty substring sub, compute recursively the largest substring 
	 *	which starts and ends with sub and return its length.
	 */

	public int solution(String str, String sub) {
  		return findMiddleSub(str, sub).length();
	}

	private String findMiddleSub(String str, String sub) {
  		if (str.equals("")) {
    			return str;
  		}
  
  		int strlen = str.length();
  		int sublen = sub.length();
  
  		if (str.startsWith(sub)) {
    			if (str.substring(strlen - sublen, strlen).equals(sub))
      				return str;
    			else
      				return findMiddleSub(str.substring(0, strlen - 1), sub);
  		}
  		else
    			return findMiddleSub(str.substring(1), sub);
	}
}
