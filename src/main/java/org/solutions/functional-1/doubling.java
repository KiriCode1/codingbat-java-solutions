import java.util.List;

class doubling {
	public static void main(String... args) {
		System.out.println("doubling");
	}

	/*
	 *	Given a list of integers, return a list where each integer is multiplied by 2.
	 */

	public List<Integer> solution(List<Integer> nums) {
  		nums.replaceAll(n -> n * 2);
  		return nums;
	}
}
