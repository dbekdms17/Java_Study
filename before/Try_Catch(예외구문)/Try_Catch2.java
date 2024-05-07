package put_in;

import java.util.Scanner;

public class Try_Catch2 {

	public static void main(String[] args) {
		// 사용자정의 예외처리
		// 예외가 발생할 경우가 아님에도 불구하고 조건에 해당하면 강제로 예외처리
		// throws 	: 호출한 영역으로 예외처리를 던짐
		// throw	: 강제로 예외를 발생시킨다.
		
		//
		try {
			scoreInput();
		} catch (Exception e) {
			System.out.println("오류메세지 : " + e.getMessage());
		}
		System.out.println("정상종료");
		
		
		
		
	}
	// throws Exception가 main으로 scoreInput 오류를 던져서 거기서 처리하게 만듬
	// 즉, 해당 메서드가 실행되는 곳에서 오류를 잡아내는 겁니다.
	// 에러가 일어난 곳에서 잡아내는것이 아니라
	public static void scoreInput() throws Exception {
		// 점수가 0~100점 아니라면 강제로 익셉션 발생하게
		Scanner sc = new Scanner(System.in);
		int score = 0;
		
		System.out.print("점수를 입력하세요 : ");
		score = sc.nextInt();
		
		if(score < 0|| score > 100) {
			throw new Exception("점수가 잘못 입력되었습니다.");
		} else {
			System.out.println("나의 점수는 " + score + "입니다.");
		}
	}
}
