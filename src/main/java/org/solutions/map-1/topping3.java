import java.util.Map;

class topping3 {
	public static void main(String... args) {
		System.out.println("topping3");
	}

	/*
	 *	Given a map of food keys and topping values, modify and return the map as follows: 
	 *	if the key "potato" has a value, set that as the value for the key "fries". 
	 *	If the key "salad" has a value, set that as the value for the key "spinach".
	 */

	public Map<String, String> solution(Map<String, String> map) {
  		if(map.get("potato") != null) {
    			map.put("fries", map.get("potato"));
  		}
  
  		if (map.get("salad") != null) {
    			map.put("spinach", map.get("salad"));
  		}
  
  		return map;
	}
}
