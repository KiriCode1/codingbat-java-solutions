import java.util.Map;

class mapAB {
	public static void main(String... args) {
		System.out.println("mapAB");
	}

	/*
	 *	Modify and return the given map as follows: 
	 *	for this problem the map may or may not contain the "a" and "b" keys. 
	 *	If both keys are present, append their 2 string values together 
	 *	and store the result under the key "ab".
	 */

	public Map<String, String> solution(Map<String, String> map) {
  		if (map.get("a") != null && map.get("b") != null) {
    			map.put("ab", map.get("a") + map.get("b"));
  		}
  		return map;
	}
}
