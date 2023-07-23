import java.util.Map;

class mapBully {
	public static void main(String... args) {
		System.out.println("mapBully");
	}

	/*
	 *	Modify and return the given map as follows: 
	 *	if the key "a" has a value, set the key "b" to have that value, 
	 *	and set the key "a" to have the value "". 
	 *	Basically "b" is a bully, taking the value and replacing it with the empty string.
	 */

	public Map<String, String> solution(Map<String, String> map) {
  		if (!(map.get("a") == null)) {
    			map.put("b", map.get("a"));
    			map.put("a", "");
  		}
  		return map;
	}
}
