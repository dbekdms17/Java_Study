import java.util.Scanner;
class  
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int age;
		int age2;
		int age3;
		int avg;

		System.out.println("�ƺ� ���̸� �Է��ϼ��� : ");
		age = sc.nextInt();
		System.out.println("���� ���̸� �Է��ϼ��� : ");
		age2 = sc.nextItnt();
		System.out.println("�Ƶ� ���̸� �Է��ϼ��� : ");
		age3 = sc.nextInt();
		avg = (age + age2 + age3)/3;
		System.out.println(avg);

	}
}
