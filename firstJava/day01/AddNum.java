import java.util.Scanner;
public class AddNum{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		int num2;

		System.out.print("첫번째 수를 입력하세요 ==> ");
		num= sc.nextInt();
		
		System.out.print("두번째 수를 입력하세요 ==> ");
		num2 = sc.nextInt();
		System.out.println("*** 사칙 연산 결과 ***");
		System.out.println("--------------------------------");
		System.out.println(num + "+" + num2 + "= " + (num + num2));
		System.out.println(num + "-"  + num2 + "= " + (num - num2));
		System.out.println(num + "*"  + num2 + "= " + (num * num2));
		System.out.println(num + "/"  + num2 + "= " + (num / num2));
	}
}