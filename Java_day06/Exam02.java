package day06;

import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {
//		String name  = "김민주";
//		for(int i = 1; i <= 10; i++) {
//			System.out.println(name);
//		}
		
		int sum = 0;
		for(int i = 0; i < 10; i ++) {
			sum = sum + i;
			System.out.println("중간결과 :" + sum);
		}
		System.out.println("최종결과 :" + sum);
		
//		System.out.println("----- 7단 ------");
//		for(int i = 1; i <= 9; i++) {
//			System.out.println("7X " + i + "=" + (7 * i));
//		}
		
//		for(int i = 2; i <= 9; i++) {
//			for(int j = 1; j <= 9; j++) {
//				System.out.println(i + "x" + j + "=" + (i*j));
//			}
//		}
		
//		int i = 0;
//		while(i<10) {
//			System.out.println("김민주");
//			i += 1;
//		}
		Scanner sc = new Scanner(System.in);
//		int num = 0;
//		
//		while(num < 3) {
//			System.out.print("당신은 무슨 메뉴를 고르실건가요?");
//			num = sc.nextInt();
//			
//			if(num < 3) {
//				System.out.println(num + "번 메뉴를 고르셨습니다.");
//			} else {
//				System.out.println("주문을 종료합니다.");
//			}
//		}
		
//		System.out.print("1~100까지의 숫자중 하나를 입력하세요 :");
//		int num = 0;
//		int num2 = sc.nextInt();
//		
//		for(int i = 0; i <= num2; i++) {
//			num = num + i + 1;
//		}
//		System.out.println("1에서 70까지의 촙합은 " + num + "입니다.");
		
//		for(int i = 1; i <= 3; i++) {
// 			for(int j = 1; j <= i; j++) {
//				System.out.print("#");
//			}
//			System.out.println();
//		}
//		String shap = "#";
//		for(int i = 1; i <= 3; i++) {
//			System.out.print(shap);
//			System.out.println();
//			shap = shap + "#";
//		}
		while(true) {
			System.out.print("1~3번 메뉴를 선택하세요 :");
			int in = sc.nextInt();
			
			switch (in) {
			case 1:
				System.out.println("1. 햄버거를 선택하셨습니다.");
				break;
			case 2:
				System.out.println("2. 콜라를 선택하셨습니다.");
				break;
			case 3:
				System.out.println("3. 사이다를 선택하셨습니다.");
				break;

			default:
				System.out.println("메뉴가 존재하지 않습니다.");
				break;
			}
			if(in > 3) break;
		}
	}

}
