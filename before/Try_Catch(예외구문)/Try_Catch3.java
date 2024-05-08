package put_in;



public class Try_Catch {

	public static void main(String[] args) {
		int x, sum;
		try {
			x = Integer.parseInt(args[0]); 
			sum =x/0;
		} catch (ArithmeticException e) { 	// 첫번째 예외처리
			System.out.println("0으로 나누어서 예외발생");
		} catch (Exception e) { 	// 두번째 예외처리
			System.out.println("arg[0]를 주지 않아 예외발생");
		}
		// 자신이 처리해야 하는 예외들을 찾아보시고 알맞게 처리해 주는 게 필요합니다. 
		// 하지만 주의하실 점은 catch 구문도 순서가 있기에, 맨 처음부터 exception(모든 예외)로 
		// 선언해 준다면, 두 번째, 세 번째... 선언한 catch 문은 수행할 수가 없습니다.
		
		
		System.out.println("================================");
		String numStr = "11a";
		int sum2 = 0;
		int num = 0;
		try {
			// Integer.parseInt()에서 NumberFormatException이 발생하면 
			// 그 아래에 있는 코드들이 수행되지 않고 catch에 있는 코드가 실행됩니다.
			num = Integer.parseInt(numStr);
			sum2 = sum2 + num;
		} catch (NumberFormatException e) {
			// catch exception
			num =0;
			sum2 = 0;
		}
		// 위의 예제는 NumberFormatException가 발생했을 때만 catch 코드가 수행되며 예외를 처리합니다. 
		// 만약 RuntimeException이 발생하면 예외를 처리하지 못하여 프로그램이 죽습니다. 
		// 만약 다음과 같이 catch (Exception e)으로 Exception에 대해서 
		// 예외를 처리하면 거의 모든 예외가 처리될 수 있습니다.
	}

}
