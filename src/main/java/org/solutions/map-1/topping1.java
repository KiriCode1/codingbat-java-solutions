import java.util.Map;

class topping1 {
	public static void main(String... args) {
		System.out.println("topping1");
	}

	/*
	 *	Given a map of food keys and topping values, modify and return the map as follows: 
	 *	if the key "ice cream" is present, set its value to "cherry". 
	 *	In all cases, set the key "bread" to have the value "butter".
	 */

	public Map<String, String> solution(Map<String, String> map) {
  		if (!(map.get("ice cream") == null)) {
    			map.put("ice cream", "cherry");
  		}
  		map.put("bread", "butter");
  		return map;
	}
}
