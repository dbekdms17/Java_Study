package object;

class User {
	int userid;
	int userpw;

	
	public User(int userid, int userpw) {
		this.userid = userid;
		this.userpw = userpw;
	}


	@Override
	public boolean equals(Object obj) {
		// 1. 타입비교(해당하는 클래스 타입의 객체가 매개변수로 넘어 왔는지)
		if(obj instanceof User) {
			// 2. 다운캐스팅
			User target = (User)obj;
			// 3. 조건판별
			if(this.userid == target.userid) {
				if(this.userpw == target.userpw) {
					return true;
				}
			}
			
		}
		return false;
	}

	// hashCode를 재정의를 안하면 밑에 hashCode가 주소 값을 반환한다.
	// 그래서 hshCode를 재정의 해줘서 
	@Override
	public int hashCode() {
		return userid;
	}
	
	
}
public class Object_Test2 {

	public static void main(String[] args) {
		String msg1 = "RedVelvet";
		String msg2 = "RedVelvet";
		System.out.println(msg1 == msg2);		// true
		
		String msg3 = new String("RedVelvet");
		String msg4 = new String("RedVelvet");
		System.out.println(msg3 == msg4);		// false
		System.out.println(msg3.equals(msg4)); 	// true
		
		
		// 동위 객체
		User user1 = new User(1, 1234);
		User user2 = new User(1, 1234);
		System.out.println(user1.equals(user2));// false
		
		System.out.println(user1.hashCode());	// 1
		System.out.println(user2.hashCode());	// 1
		
		
	}

}
