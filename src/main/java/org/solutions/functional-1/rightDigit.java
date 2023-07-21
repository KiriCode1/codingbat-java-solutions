import java.util.List;

class rightDigit {
	public static void main(String... args) {
		System.out.println;
	}

	/*
	 *	Given a list of non-negative integers, return an integer list of the rightmost digits. (Note: use %)
	 */

	public List<Integer> solution(List<Integer> nums) {
  		nums.replaceAll(n -> n % 10);
  		return nums;
	}
}
