import java.util.Scanner;
public class EvenOddTest{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
	
		System.out.print("임의의 수를 입력하세요 ==> ");
		num= sc.nextInt();
		
		if(num % 2 == 0) {
			System.out.print("짝수입니다.");
		} else {
			System.out.print("홀수입니다.");
		}
		
	}
}