import java.util.List;

class math1 {
	public static void main(String... args) {
		System.out.println("math1");
	}

	/*
	 *	Given a list of integers, return a list where each integer is 
	 *	added to 1 and the result is multiplied by 10.
	 */

	public List<Integer> solution(List<Integer> nums) {
  		nums.replaceAll(n -> (n + 1) * 10);
  		return nums;
	}
}
