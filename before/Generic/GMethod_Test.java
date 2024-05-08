package generic;

// Generic 1-3
public class GMethod_Test {
	// 제네릭 메소드
	// <키워드> 리턴타입 메소드명()
	<T>T f(T data) {
		System.out.println(data);
		return data;
	}
}
