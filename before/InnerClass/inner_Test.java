package put_in;


public class inner_Test {
	public static void main(String[] args) {		
		Shop2 shop2 = new Shop2();
//		Customer2 customer2 = shop2.new Customer2();
//		customer2.getProduct();
	
		Shop2.Customer2 customer2 = shop2.hiCustomer();
		customer2.getProduct();
	}

	
}
// Alt + Shift + R : 선언부와 사용부 동시에 이름 변경하기
// 여기서 수정하면 전부 바뀜
// InnerClass사용
// ① 외부 클래스
class Shop2 {
 int product = 10; // ② 필드 만들기
	
	// ⑥ 외부 클래스에서 void 메소드가 아니라 내부 클래스 이름으로 메소드 만들기
	public Customer2 hiCustomer() {
		// ⑦ return으로 내부 클래스 객체 생성
		return new Customer2();
		// 이렇게 하는 이유 : 내부 클래스는 외부에서 만들 수 없는데 내부에서 만들려고 하면 쉽기 때문에 내부에서 내부 클래스를 객체를 
		// 생성해서 내부 클래스를 사용할 수 있게 해준다. 
	}
	// ③ shop2 class안에 만들어진 내부 클래스
	class Customer2 {
		//  ④ 내부 클래스 안에 만들어진 메소드
		void getProduct() {
			// product를 상속받은 것처럼 사용할 수 있다.
			System.out.println("받은 상품의 개수 : " + product);  	// ⑤
			// 아직 이상태에서는 객체를 생성할 수 없다. 내부 클래스라서 숨겨져 있기 때문에
		}
	}
}