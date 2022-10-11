package generic;
// 1-2
// 이 클래스를 사용할 사람에게 <>안에 있는거를 사용하라고 알려주는것
// 제네릭 클래스
public class GClassTest<T> {
	T data;
	
	T getData() {
		return data;
	}
}
