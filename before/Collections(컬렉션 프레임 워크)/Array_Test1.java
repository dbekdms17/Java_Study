package put_in;

import java.util.ArrayList;
import java.util.Iterator;

public class Array_Test1 {

	public static void main(String[] args) {
		ArrayList<String> arr1 = new ArrayList<String>();
		
		// 요소 추가하기
		arr1.add("Hello");
		arr1.add("Java!");
		arr1.add("Very");
		arr1.add("Sleepy");
		
		// 이 내부에서 toString을 재정의가 되어 있다.
		// ArrayList 구조 간단히 파악하기
		System.out.println(arr1);
		System.out.println(arr1.get(0));
		
		// 수정하기
		arr1.set(3, "Happy");
		System.out.println(arr1);
		
		// ArrayList의 요소 개수(길이)
		for (int i = 0; i < arr1.size(); i++) {
			// 요소 가져오기
			System.out.println(arr1.get(i));
		}
		System.out.println("=======================");
		
		// 삭제
		arr1.remove(2);
		System.out.println(arr1);
		System.out.println("========================");
		
		// for-Iterator문 사용
		for (Iterator<String> iterator = arr1.iterator(); iterator.hasNext();) {
			String item = (String) iterator.next();
			System.out.println(item);
		}
		// for-each문
		for(String item2 : arr1) {
			System.out.println(item2);
		}
	}

}
