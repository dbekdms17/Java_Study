package put_in;

import java.util.Stack;

public class Stack_Exam {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		
		// Stack 값 추가
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		
		// Stack 값 삭제
		// 뒤에서 부터 한개씩 사라짐
		// 후입선출이라서 나중에 들어온 것이 먼저 나간다.
		stack.pop();
		System.out.println(stack); 		// 출력 : [1, 2, 3, 4]
		stack.pop();
		System.out.println(stack);		// 출력 : [1, 2, 3]
//		stack.clear();
		
		// Stack의 상단의 값 출력
		// 밑으로 쌓이는 구조이기 때문에 1이 가장먼저 들어가고, 그 다음이 2, 그 다음이 3
		// 4, 5는 삭제해서 3이 출력된다.
		System.out.println(stack.peek());
		
		// Stack의 기타 메소드
		System.out.println(stack.size());
		System.out.println(stack.isEmpty());
		System.out.println(stack.contains(1));
		
		

}
}