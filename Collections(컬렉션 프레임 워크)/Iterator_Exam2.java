package Exam01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Iterator_Exam2 {

	public static void main(String[] args) {
		// iterator을 이용해 값을 수정하는 예제
		// 컬렉션 생성
		ArrayList<String> list = new ArrayList<>();
		list.add("h");
		list.add("e");
		list.add("l");
		list.add("l");
		list.add("o");
		System.out.println("while문 지나가기 전 리스트에 들어있던 값 : " +list);
		// 출력 : [h, e, l, l, o]
		System.out.println("=====================");
		
		/**
		 * ListIterator<E> 인터페이스
		 * ListIterator 인터페이스는 Iterator 인터페이스를 상속받아 여러 기능을 추가한 인터페이스입니다.
		 * Iterator 인터페이스는 컬렉션의 요소에 접근할 때 한 방향으로만 이동할 수 있습니다.
		 * 하지만 JDK 1.2부터 제공된 ListIterator 인터페이스는 컬렉션 요소의 대체, 추가 그리고 인덱스 검색 등을 위한 작업에서 
		 * 양방향으로 이동하는 것을 지원합니다. 단, ListIterator 인터페이스는 List 인터페이스를 구현한 List 컬렉션 클래스에서만 
		 * listIterator() 메소드를 통해 사용할 수 있습니다.
		 */
		
		
		// 리스트에 들어있는 값에 각각 '+' 붙이기(수정)
		ListIterator<String> listIterator = list.listIterator();
		while(listIterator.hasNext()) {
			Object element = listIterator.next();
			listIterator.set(element + "+");
		}
		System.out.println("while문 지난 후 수정된 결과 : " + list);
		// 출력 : [h+, e+, l+, l+, o+]
		
		// 리스트에 들어있는 값을 역순으로 표시
		System.out.print("역순 출력 결과 : ");
		while(listIterator.hasPrevious()) {
			Object element2 = listIterator.previous();
			System.out.print(element2 + " ");
		}
		System.out.println();
		// 출력 : o+ l+ l+ e+ h+ 
	}

}
