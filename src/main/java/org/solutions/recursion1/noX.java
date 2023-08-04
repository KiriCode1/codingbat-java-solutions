class noX {
	public static void main(String... args) {
		System.out.println("noX");
	}

	/*
	 *	Given a string, compute recursively a new string where all the 'x' chars have been removed.
	 */

	public String solution(String str) {
  		if (str.equals("")) {
    			return str;
  		} else if (str.charAt(0) == 'x') {
    			return noX(str.substring(1));
  		}
  
  		return str.charAt(0) + noX(str.substring(1));
	}
}
