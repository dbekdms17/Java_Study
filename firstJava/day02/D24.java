import java.util.Scanner;
class D23 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int num;
		String result = "6�� ��� �ƴ�";

		System.out.println("������ ���� �Է��ϼ��� ");
		num = sc.nextInt();

		if(num % 6 == 0) {
			result = "6�� �����";
		}
		System.out.println(result);
	}
}
