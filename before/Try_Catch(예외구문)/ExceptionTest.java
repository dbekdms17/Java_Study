package put_in;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest {

	public static void main(String[] args) {
		try {
			System.out.println(Integer.parseInt("10"));
			System.out.println(Integer.parseInt("Hello"));
			System.out.println(Integer.parseInt("30"));
		} catch (NumberFormatException e) {
			System.out.println("숫자로 이루어진 문자열만 바꿀 수 있습니다.");
		} finally {
			System.out.println("꼭 해야하는 문장");
		}
		System.out.println("===============================================");
		// 두 수 입력받아서 앞으 수를 뒤의 수로 나눈 결과 출력하기
		// 입력 : 정수 두개 입력받기
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			sc = new Scanner(System.in);
		// 어디서 오류가 발생할지 모르니 전부 try이로 잡아둔다.
		try {
			System.out.print("첫번째 정수 : "); 
			int num1 = sc.nextInt();
			System.out.print("두번째 정수 : ");
			int num2 = sc.nextInt();
			// 처리 : 위에서 입력받은 두 수 가져와서 앞의 수를 뒤의 수로 나누기
			int result = num1 / num2;
			// 출력 : 위에서 처리된 결과값 출력하기
			System.out.println("결과 : " + result);
		
			// ③ 2번에서 확인한 오류로 catch문 만들기
		} catch(ArithmeticException ae) {
			System.out.println("0으로는 나눌 수 없습니다.");
		} catch(InputMismatchException ims) {
			System.out.println("숫자만 입력하세요.");
		}
		catch (Exception e) { 	// Exception은 모든 예외클래스의 부모 클래스로서 어떤 예외코드가 발생해도 Exception으로 업캐스팅된다.
			// 이것은 사용자를 위한 편의성을 위해 적어놓은것 
			// ① 여기서 오류가 있다고 연락이 오면 주석처리
			// ④ 주석 해제
			System.out.println("알 수 없는 오류 발생 / 개발자에게 연락하세요~");
			// ② 무슨 오류인지 확인
			// ⑤ 주석처리
//			System.out.println(e); 	// 출력 : java.lang.ArithmeticException: / by zero ← 이거보고 확인
		}
		}
		
	}

}
