import java.util.List

class square {
	public static void main(String... args) {
		System.out.println("square");
	}

	/*
	 *	Given a list of integers, return a list where each integer is multiplied with itself.
	 */

	public List<Integer> solution(List<Integer> nums) {
  		nums.replaceAll(n -> n * n);
  		return nums;
	}
}
