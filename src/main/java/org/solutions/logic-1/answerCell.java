class answerCell {
	public static void main(String... args) {
		System.out.println("answerCall");
	}

	/*
	 *	Your cell phone rings. Return true if you should answer it. 
	 *	Normally you answer, except in the morning you only answer if it is your mom calling. 
	 *	In all cases, if you are asleep, you do not answer.
	 */

	public boolean solution(boolean isMorning, boolean isMom, boolean isAsleep) {
  		if (isMorning) {
    			if (isMom) {
      				if (isAsleep) {
        				return false;
      				}
      				return true;
    			}
    			return false;
  		}
  		if (isAsleep) {
    			return false;
  		}
  		return true;
	}
}
