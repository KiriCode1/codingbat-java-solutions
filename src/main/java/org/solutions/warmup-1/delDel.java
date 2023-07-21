class delDel {
	public static void main(String... args) {
		System.out.println("delDel");
	}

	/*
	 *	Given a string, if the string "del" appears starting at index 1, 
	 *	return a string where that "del" has been deleted. 
	 *	Otherwise, return the string unchanged.
	 */

	public String solution(String str) {
  		for (int i = 1; i < str.length() - 2; i++) {
    			if (str.substring(1, 4).equals("del")) {
      				return str.replace(str.substring(1, 4), "");
    			}
  		}
  		return str;
	}
}
