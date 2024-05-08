package put_in;

public class Ground {
	public static void main(String[] args) {
		// 익명 구현 객체
		// new Animal()부터 { };까지는 생성되는 객체다.
		// 익명클래스 영역은 {부터 };까지
		// 부모 클래스에서 추상 클래스로 만들어주면 자동으로 오버라이드가 생성
		// 익명 클래스 영역은 앞에 있는 생성자를 상속받고 있다.
		// 즉, 익명 클래스는 앞에 있는 생성자의 자식 클래스라고 볼 수 있다.
		// 그 앞에 있는 생성자를 통해 만드는 객체 딱 하나만을 위한 클래스이고
		// 그 때 만들어지는 객체는 익명 클래스 안에서 구현한 메소드 내용을 가지게 된다.
		// 이렇게 만들어지는 객체를 익명 구현 객체라고 한다.
		Animal dog = new Animal() {
			@Override
			public void makeSomeNoise() {
			System.out.println("왈왈!!");
			}
			
		};
		Animal cat = new Animal() {
			@Override
			public void makeSomeNoise() {
				System.out.println("냐옹!!");
			}
		};
		
		Animal bird = new Animal() {
			// 익명 클래스 안에서 메소드를 만들어서 이 메소드는 Animal이라는 부모 클래스에
			// 넣어진다. 즉, 업 캐스팅되는 것이다. 그래서 fly메소드는 잘려나간다.
			// 보통의 경우 fly를 사용하려면 다운 캐스팅을 해서 사용해야지만 
			//익명 클래스는 클래스 이름이 없어서 다운 캐스팅을 사용할 수 없다. 
			// 즉, 익명 클래스에서 메소드를 추가하는 것은 의미가 없다.
			// 새로운 메소드는 이 영역 내부에서만 사용 가능하다.
			public void fly() {
				System.out.println("오리날다");
			}
			
			@Override
			public void makeSomeNoise() {
				System.out.println("끼요욧");
			}
		};
		
		// 부모 클래스에 있던 메소드를 익명 클래스에서 오버라이딩해서 사용
		dog.makeSomeNoise();
		cat.makeSomeNoise();
		bird.makeSomeNoise();
	}
}
