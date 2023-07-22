import java.util.List;

class no9 {
	public static void main(String... args) {
		System.out.println("no9");
	}

	/*
	 *	Given a list of non-negative integers, return a list of those numbers except 
	 *	omitting any that end with 9. (Note: % by 10)
	 */

	public List<Integer> solution(List<Integer> nums) {
  		nums.removeIf(num -> num % 10 == 9);
  		return nums;
	}
}
