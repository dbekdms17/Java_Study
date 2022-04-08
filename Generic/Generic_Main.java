package generic;

import java.util.Scanner;

// generic 1-5
public class Generic_Main {

	public static void main(String[] args) {
//		Storage를 생성하면 자동으로 <BTOB>가 붙어서 나온다.
//		Storage<BTOB> obj = new Storage<BTOB>();
		
		
		// 여기서 <BTOB> → <String>으로 바꿔주면 변한다.
//		Storage<String> obj = new Storage<String>();
//		obj.data = "두번째 고백";
//		Storage<Scanner> obj2 = new Storage<Scanner>();
		// 아예 Scanner타입으로 바뀌기 때문에 다운 케스팅이 필요가 없다.
		
		
		// 1-2
		// GClassTest<T> ← 타입
		GClassTest<Integer> obj = new GClassTest<Integer>(); 
		obj.data = 10; 	 // 오토박싱
		System.out.println(obj.getData() + 5); 		// 15가 나옴(Integer이지만 연산이 가능)
		
		// 1-3
		GMethod_Test obj2 = new GMethod_Test();
		// <T>T f(T data) → 굳이 할 필요가 없다.
		obj2.<String>f("Hello");
		// 제네릭 메소드는 보통 키워드를 유추할 수 있기 때문에 따로 명시적으로 작성해주지 않아도 된다.
		obj2.f(10);
		
		// 1-4
		GInter_Test<Integer, Double> obj3 = new GInter_Test<Integer, Double>() {
			
			@Override
			public Double div(Double num1, Double num2) {
				return num1 / num2;
			}
			
			@Override
			public Integer add(Integer num1, Integer num2) {
				return num1 + num2;
			}
		};
		
	}

}
