class SameStarChar {
	public static void main(String... args) {
		System.out.println("SameStarChar");
	}

	/*
	 *	Returns true if for every '*' (star) in the string, 
	 *	if there are chars both immediately before and after the star, they are the same.
	 */

	public boolean sameStarChar(String str) {
  		String index = "*";
  
  		if (str.equals("") || str.equals("*") || str.equals("**")) {
    			return true;
  		}
  
  		int count = 0;
  		int countInx = 0;
  
  		for (int i = 1; i < str.length() - 1; i++) {
    			if (str.substring(i, i + 1).equals(index)) {
      				countInx++;
    			}

    			String beforeStar = str.substring(i - 1, i);
    			String afterStar = str.substring(i + 1, i + 2);

    			if (str.substring(i, i + 1).equals(index) && beforeStar.equals(afterStar)) {
      				count++;
    			}
  		}
  		return count == countInx;
	}
}
