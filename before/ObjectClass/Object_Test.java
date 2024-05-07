package object;

class Car {
	String brand;
	
	public Car(String brand) {
		super();
		this.brand = brand;
	}
	// 재정의를 해줘서 내가 원하는 대로 뽑아올 수 있게 해준다.
	@Override
	public String toString() {
		return "브랜드 : " + brand;
	}
}
public class Object_Test {

	public static void main(String[] args) {
		Car mycar = new Car("Ferrari");
		// 보기에는 mycar만 있어보이지만 출력을 하면 컴퓨터가 자동으로 mycar.toString으로
		// 되게 변경한다. 그래서 toString을 재정의를 하지 않으면 Object class에 있는
		// toString을 가져와서 hashCode가 반환 된다.
		System.out.println(mycar);	// 출력 : 브랜드 : Ferrari
	}

}
