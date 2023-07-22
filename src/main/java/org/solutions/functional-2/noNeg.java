import java.util.List;

class noNeg {
	public static void main(String... args) {
		System.out.println("noNeg");
	}

	/*
	 *	Given a list of integers, return a list of the integers, omitting any that are less than 0.
	 */

	public List<Integer> solution(List<Integer> nums) {
  		nums.removeIf(n -> n < 0);
  		return nums;
	}
}
