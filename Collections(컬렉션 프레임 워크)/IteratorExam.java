package Exam01;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IteratorExam {

	public static void main(String[] args) {
		ArrayList<String> cars = new ArrayList<>();
		cars.add("벤츠");
		cars.add("람보르기니");
		cars.add("롤스로이드");
		cars.add("페라리");
		
		// for문 이용
		for (Iterator<String> iterator = cars.iterator(); iterator.hasNext();) {
			String hi = (String) iterator.next();
			System.out.println(hi);
				}
		System.out.println("====================");
		// iterator 획득
		Iterator<String> iterator = cars.iterator();
		
		// while문을 사용한 경우
		while(iterator.hasNext()) {
			String str = iterator.next();
			System.out.println(str);
		}
		System.out.println("====================");
		
		// for-each문을 사용한 경우
		for(String str : cars) {
			System.out.println(str);
		}
		System.out.println("====================");
		
		Set<String> phone = new HashSet<>();
		phone.add("s10");
		phone.add("z플랩");
		phone.add("v30");
		phone.add("아이폰");
		
		// while문을 사용한 경우
		Iterator<String> iterator2 = phone.iterator();
		
		while(iterator2.hasNext()) {
			System.out.println("phone : " + iterator2.next());
		}
		System.out.println("====================");
		
		// for-each문을 사용한 경우(보통 이걸 사용)
		for(String handphone : phone) {
			System.out.println("phone : " + handphone);
		}
		System.out.println("====================");
		
		
		
		
		
		
		
	}

}
