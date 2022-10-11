package put_in;

// 내부 클래스 던지기 3
public class Main {

	public static void main(String[] args) {
		Test t = new Test();
		// Test클래스에서 doSomething메소드를 사용하려면 Data data를 받아서 보내야는데
		// Data data = new Data()를 생성하지 않으면 보낼 data가 없다. 
		// 그래서 Data타입 객체를 만들어주는데 추상 클래스라서 자동적으로 내부 클래스가 열린다.
		// 방법 1
		Data data = new Data() {
			
			@Override
			void doSomething() {
				System.out.println("두썸씽");
				
			}
		};
		// 메소드에 넘기는 data라는 객체는 이미 전부 재정의가 되어있다.
		t.f(data);
		
		// 방법 2
		// 객체를 바로 생성하며 메소드의 매개변수로 넘길 수 있다.
		// Data 타입은 추상클래스이기 때문에 바로 생성하면서
		// 익명 클래스로 오버라이딩해서 넘겨준다.
		t.f(new Data() {
			@Override
			void doSomething() {
				System.out.println("객체를 생성하며 매개변수로 넘기기");
			}
		});
	}

}
