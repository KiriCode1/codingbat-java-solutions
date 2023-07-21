class stringBits {
	public static void main(String... args) {
		System.out.println("stringBits");
	}

	/*
	 *	Given a string, return a new string made of every other char starting with the first, 
	 *	so "Hello" yields "Hlo".
	 */

	public String solution(String str) {
  		String result = "";
  		for (int i = 0; i < str.length(); i += 2) {
    			result += str.substring(i, i + 1);
  		}
  		return result;
	}
}
