package hashSet;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class HashSet_Exam {

	public static void main(String[] args) {
		HashSet<String> colors = new HashSet<>(); // 타입 생략 가능
		HashSet<Integer> num = new HashSet<Integer>();
		colors.add("Black");
		colors.add("White");
		colors.add("Green");
		colors.add("Red");
		
		num.add(1);
		num.add(2);
		num.add(3);
		num.add(4);
		num.add(5);
		num.add(5);
		
		System.out.println(colors);  // [Red, White, Black, Green] ← 순서가 없다.
		// 순서가 없기 때문에 특정 위치에 값을 추가하거나 할 수 없다.
		System.out.println("===========");
		System.out.println(num);
		
		System.out.println("===========");
		// addAll()로 한번에 추가
		HashSet<String> otherColors = new HashSet<String>(Arrays.asList("Black", "Yellow", "Purple"));
		colors.addAll(otherColors);
		System.out.println(colors); 
		// 출력 : [Red, White, Yellow, Purple, Black, Green]
		// Black이 중복되지만 한번만 표시된다.
		System.out.println("===========");
		HashSet<Integer> otherNum = new HashSet<>(Arrays.asList(10, 7));
		num.addAll(otherNum);
		System.out.println(num);
		System.out.println("===========");
		
		// HashSet 엘레멘트 삭제
		// HashSet에 추가된 값을 삭제할 때는 remove(), removeAll(), removeIf()를 호출하면 됩니다.
		colors.remove("Red");
		System.out.println(colors);
		// 출력 : [White, Yellow, Purple, Black, Green]
		System.out.println("===========");
		num.remove(10);
		System.out.println(num);
		System.out.println("===========");
		
		//  HashSet 전체 값 확인
		// 방법 1 : for-each문
		for(String color : colors) {
			System.out.println(color + " ");
		}
		System.out.println();
		System.out.println("===========");
		
		for(Integer nu : num) {
			System.out.println(num);
		}
		System.out.println();
		System.out.println("===========");
		
		
		// 방법 2 : Iterator 생성 후 while문 사용
		Iterator<String> type = colors.iterator();
		while(type.hasNext()) {
			System.out.println(type.next() + " ");
		}
		System.out.println();
		System.out.println("===========");
		
		
		Iterator<Integer> nu2 = num.iterator();
		while(nu2.hasNext()) {
			System.out.println(nu2.next());
		}
		System.out.println();
		System.out.println("===========");
		
		// 값 존재 유무 확인
		// HashSet은 컬렉션 내에 값이 존재하는지 여부를 확인하는데 최적화된 자료 구조입니다.
		// contains() 메소드를 호출해서 값이 존재하는지 여부를 빠르게 확인할 수 있습니다.
		System.out.println(colors.contains("Green"));   // true
		System.out.println(colors.contains("Red"));   	// false
		
		
		
		
		
	}

}
