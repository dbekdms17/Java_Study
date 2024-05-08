package put_in;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMap_Test {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<>();
		
		// HashMap에 데이터 추가하기
		map.put(1, "하나");
		map.put(2, "둘리");
		map.put(3, "셋");
		map.put(4, "넷");
		map.put(5, "다섯");
		
		// HashMap의 데이터 수정하기
		map.put(2, "둘");
		
		// HashMap에서 요소 가져오기
		System.out.println(map.get(2)); 	// 출력 : 둘 → key를 불러오면 출력은 value가 출력
		
		// HashMap에서 요소 삭제하기(키값만 넘기는 경우) - value를 리턴
		map.remove(2);
		System.out.println(map);  			// 출력 : {1=하나, 3=셋, 4=넷, 5=다섯}
	
		// HashMap에서 요소 삭제하기(Key, Value 둘 다 넘기는 경우) 
		// → boolean타입 리턴(정상적으로 넘기면 삭제하며 true)
		System.out.println(map.remove(3, "셋"));
		
		// HashMap의 데이터 개수(길이) - 한 쌍을 하나로 셈
		System.out.println(map.size());
		
		HashMap<String, Integer> map2 = new HashMap<>();
		map2.put("하나",1);
		map2.put("둘",2);
		map2.put("셋",3);
		map2.put("넷",4);
		map2.put("다섯",5);
		
		Set<String> keySet = map2.keySet();
		Iterator<String> keyiter = keySet.iterator();
		while(keyiter.hasNext()) {
			System.out.println(keyiter.next());
		}
		
	}

}
