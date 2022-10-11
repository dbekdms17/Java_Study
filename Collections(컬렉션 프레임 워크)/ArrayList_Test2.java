package put_in;

import java.util.ArrayList;
import java.util.Iterator;

class User {
	String userId;

	public User(String userId) {
		this.userId = userId;
	}

	@Override
	public String toString() {
		return "아이디 : " + this.userId ;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof User) {
			User target = (User)obj;
			
			if(this.userId.equals(target.userId)) {
				return true;
			}
			return false;
		}
	
	return false;
	}

	@Override
	public int hashCode() {
		return this.userId.length();
	}
	
	
}

public class ArrayList_Test2 {

	public static void main(String[] args) {
		ArrayList<Integer> arr1 = new ArrayList<>();
		
		arr1.add(10);
		arr1.add(20);
		arr1.add(30);
		arr1.add(40);
		arr1.add(50);
		
		
		// 40을 remove(40)으로 삭제하려면 remove(int index)가 아니라
		// remove(Object o)로 해줘야 객체로 받아서 삭제해야 한다.
		// remove(int index)는 40이 int타입이라 int index가 와야 하는데
		// 40이 int니 자동으로 int index로 되서 없는 index를 불러오니 오류발생
//		arr1.remove(40);
//		System.out.println(arr1);
		
		// Object o에서 객체를 가져오라고 했으니
		// 40을 박싱해서 객체화 시켜준다.  
		arr1.remove((Integer)40);
		System.out.println(arr1);
		
		// 클래스 User도 하나의 타입이라고 볼 수 있어서 ArrayList<User> 가능하다.
		ArrayList<User> arr2 = new ArrayList<User>();
		arr2.add(new User("apple"));
		arr2.add(new User("banana"));
		arr2.add(new User("cherry"));
		
		// class User에 toString하지 않으면 해쉬코드가 나온다.
		// class User에 toString에서 오버라이딩해주면 제대로 나온다.
		System.out.println(arr2);
		
		for (Iterator<User> iterator = arr2.iterator(); iterator.hasNext();) {
			User user = (User) iterator.next();
			System.out.println(user);
		}
		
		// 여기서 User(banana)라는 객체를 받아서 삭제하려고 해서
		// arr2.remove(new User("banana"));로 해주면
		// remove(new User("babana"))는 add(new User("banana")는
		// 아직 여기서는 equals가 주소값을 물어보고 있어서
		// 동위객체로써 같은 취급을 해주지만 다른 객체라서 삭제는 안된다.
		// 여기서 class User에 equals를 오버라이딩해서 ("banana")를 값을 보고
		// 논리적 동일시해서 같은 취급해줘서 삭제가 된다.
		arr2.remove(new User("banana"));
		System.out.println(arr2);
	}

}
