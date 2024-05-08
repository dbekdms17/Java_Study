package put_in;

class Main {
	int number = 1;
}


public class ObjectClass_HashCode_Exam {

	public static void main(String[] args) {
		Main a = new Main();
		Main b = new Main();
		
		System.out.println("객체 변경전 a hashCode값 → " + a.hashCode()); // → 1651191114
		System.out.println("객체 변경전 b hashCode값 → " + b.hashCode()); // → 1586600255
		
		b.number = 2;
		System.out.println("객체 변경후 b hashCode값 → " +b.hashCode()); // → 1586600255
		// b의 객체를 1에서 2로 변경했지만, hashCode는 변경이 되지 않았다.
	}

}
