import java.util.List;

class copies3 {
	public static void main(String... args) {
		System.out.println("copies3");
	}

	/*
	 *	Given a list of strings, return a list where each string is replaced by 3 copies of 
	 *	the string concatenated together.
	 */

	public List<String> solution(List<String> strings) {
  		strings.replaceAll(str -> str + str + str);
  		return strings;
	}
}
