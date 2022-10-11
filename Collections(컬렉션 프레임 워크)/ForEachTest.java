package put_in;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ForEachTest {

	public static void main(String[] args) {
		int[] arData = { 10, 20, 30, 40, 50};
		
		for(int data : arData) {
			System.out.println(data);
		}
		
		HashSet<String> redVelvet = new HashSet<>();
		redVelvet.add("아이린");
		redVelvet.add("슬기");
		redVelvet.add("웬디");
		redVelvet.add("조이");
		redVelvet.add("예리");
		
		for(String name : redVelvet) {
			System.out.println(name);
		}
		
		HashMap<String, Integer> shinee = new HashMap<>();
		shinee.put("온유", 34);
		shinee.put("종현", 33);
		shinee.put("키", 32);
		shinee.put("민호", 32);
		shinee.put("태민", 30);
		
		Set<Entry<String, Integer>> entrySet = shinee.entrySet();
		for(Entry<String, Integer> entry : entrySet) {
			System.out.println("이름 : " + entry.getKey() + " / 나이 : " + entry.getValue());
		}
		System.out.println("=============");
		// for-map사용
		for(Map.Entry<String, Integer> entry : shinee.entrySet()) {
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println("이름 : " + key + ", 나이 : " +value );
		}
	}
	
	
		
//		Set<Entry<String, Integer>> entryset = shinee.entrySet();
//		

}
