package put_in;

import java.util.LinkedList;
import java.util.Queue;

public class Queue_Exam {

	public static void main(String[] args) {
		// Queue는 LinkedList하고 같이 객체를 생성해야 한다.
		Queue<Integer> qu = new LinkedList<>();
		
		// Queue 값 추가
		qu.add(1);
		qu.add(2);
		qu.add(3);
		qu.offer(4);
		qu.offer(5);
		
		// qu에 첫번째 값을 반환하고 제거, 비어있다면 null
		System.out.println(qu.poll());
		System.out.println(qu.poll());
		System.out.println(qu.peek());
		
		qu.remove();
		qu.clear();
	}

}
