import java.util.Map;

class topping2 {
	public static void main(String... args) {
		System.out.println("topping2");
	}

	/*
	 *	Given a map of food keys and their topping values, modify and return the map as follows: 
	 *	if the key "ice cream" has a value, set that as the value for the key "yogurt" also. 
	 *	If the key "spinach" has a value, change that value to "nuts".
	 */

	public Map<String, String> solution(Map<String, String> map) {
  		if (map.get("ice cream") != null) {
    			map.put("yogurt", map.get("ice cream"));
  		}
  
  		if (map.get("spinach") != null) {
    			map.remove("spinach");
    			map.put("spinach", "nuts");
  		}
  
  		return map;
	}
}
