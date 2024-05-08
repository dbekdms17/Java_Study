package put_in;

// 내부 클래스 던지기 2
public class Test {
	// Data data를 받아와야지 doSomething이 실행되게 만든 메소드
	public void f(Data data) {
		// Main에서 이미 재정의가 다 끝난 data가 와서 여기서는
		// 오류 없이 data.doSomething이 가능하다.
		data.doSomething();
		
	}
}
