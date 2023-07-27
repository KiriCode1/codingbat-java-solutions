class nonStart {
	public static void main(String... args) {
		System.out.println("nonStart");
	}

	/*
	 *	Given 2 strings, return their concatenation, except omit the first char of each. 
	 *	The strings will be at least length 1.
	 */

	public String solution(String a, String b) {
  		String aCut = a.replace(a.substring(0, 1), "");
  		String bCut = b.replace(b.substring(0, 1), "");
  
  		return aCut + bCut;
	}
}
