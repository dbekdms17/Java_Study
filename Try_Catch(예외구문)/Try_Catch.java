package put_in;
class A {
	int a;
	static int score = 100;
	
	
	
	public int print(int a) throws Exception {
		int avg;
		avg = score/a;
		return avg;
	}
}
public class Try_Catch {
		public static void main(String[] args) {
			System.out.println("1. 시스템 시작");
			try {
				int score = 100;
				int avg = score/0;
				System.out.println(avg);
			} catch (Exception e) {
				System.err.println("3. 오류가 발생했습니다.");
			}
			System.out.println("2. 시스템 종료");
			
			try {
				A a = new A();
				a.print(0);
			} catch (Exception e) {
				System.err.println("5. throws 오류 입니다.");
			}
			System.out.println("4. 프로그램 종료");
		}
}
