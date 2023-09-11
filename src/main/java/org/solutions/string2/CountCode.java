class CountCode {
	public static void main(String... args) {
		System.out.println("CountCode");
	}

	/*
	 *	Return the number of times that the string "code" appears anywhere in the given string, 
	 *	except we'll accept any letter for the 'd', so "cope" and "cooe" count.
	 */

	public int countCode(String str) {
  		int count = 0;
  		for (int i = 0; i < str.length() - 3; i++) {
    			if (str.substring(i, i + 2).equals("co") && str.substring(i + 3, i + 4).equals("e")) {
      				count += 1;
    			}
  		}
  		return count;
	}
}
