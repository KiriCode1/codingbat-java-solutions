class endsLy {
	public static void main(String... args) {
		System.out.println("endsLy");
	}

	/*
	 *	Given a string, return true if it ends in "ly".
	 */

	public boolean solution(String str) {
  		if (str.length() < 2) {
    			return false;
  		}
  
  		if (str.substring(str.length() - 2, str.length()).equals("ly")) {
    			return true;
  		}
  		return false;
	}
}
