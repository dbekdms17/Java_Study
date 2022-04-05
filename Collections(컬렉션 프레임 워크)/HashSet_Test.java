package put_in;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet_Test {

	public static void main(String[] args) {
		HashSet<Integer> set1 = new HashSet<>();
		
		set1.add(10);
		set1.add(10);
		set1.add(10);
		set1.add(10);
		set1.add(20);
		set1.add(20);
		set1.add(30);
		set1.add(30);
		set1.add(30);
		set1.add(40);
		set1.add(50);
		set1.add(50);
		
		// HashSet 구조 간단히 파악하기
		System.out.println(set1);   		// 출력 : [50, 20, 40, 10, 30]
		
		// HashSet의 요소 개수(길이)
		System.out.println(set1.size()); 	// 출력 : 5
		
		// HashSet의 요소 포함여부 확인하기
		System.out.println(set1.contains(30));  	// 출력 : true 	

		// HashSet의 요소 삭제
		set1.remove(30);
		System.out.println(set1);
		
		HashSet<User> set2 = new HashSet<User>();
		// HashSet은 기존의 객체와 같은 객체인지 판별할 때 hashCode()로 비교를 한다.
		// 정상적으로 이용하려면 우리가 담아줄 객체의 타입 클래스에서 hasCode()도 재정의 해야한다.
		set2.add(new User("apple"));
		set2.add(new User("banana"));
		set2.add(new User("apple"));
		
		// HashSet은 HashCode로 본다. 
		// 그래서 HashCode로 재정의해줘야 한다.
		System.out.println(set2); 				
		// 재정의 전 - 출력 : [아이디 : apple, 아이디 : apple, 아이디 : banana]
		// 재정의 후 - 출력 : [아이디 : apple, 아이디 : banana]
		System.out.println("====================");
		
		// iter에 있는 모든 값을 가져온다.
		Iterator<Integer> iter = set1.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
	}

}
