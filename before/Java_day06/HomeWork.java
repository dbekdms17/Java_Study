package day06;

import java.util.Scanner;

public class HomeWork {

	public static void main(String[] args) {
		/*
		 * // 구구단 2~9단 출력하기(2분 생각)
      // ------ 2단 -------
      // 2 x 1 = 2
      // .....
      // 2 x 9 = 18
      // ------ 3단 -------
      // 3 x 1 = 3
      // .....
      // 3 x 9 = 27
		 */
//		System.out.println("------- 2단 -------");
//		for(int i =1; i < 10; i++) {
//			System.out.println("2x " + i + "=" + (i * 2));
//		}
//		System.out.println("------- 3단 -------");
//		for(int i = 1; i <10; i++) {
//			System.out.println("3x " + i + "=" + (i * 3));
//		}
//		System.out.println("------- 4단 -------");
//		for(int i = 1; i <10; i++) {
//			System.out.println("4x " + i + "=" + (i * 4));
//		}
//		System.out.println("------- 5단 -------");
//		for(int i = 1; i <10; i++) {
//			System.out.println("5x " + i + "=" + (i * 5));
//		}
//		System.out.println("------- 6단 -------");
//		for(int i = 1; i <10; i++) {
//			System.out.println("6x " + i + "=" + (i * 6));
//		}
//		System.out.println("------- 7단 -------");
//		for(int i = 1; i <10; i++) {
//			System.out.println("7x " + i + "=" + (i * 7));
//		}
//		System.out.println("------- 8단 -------");
//		for(int i = 1; i <10; i++) {
//			System.out.println("8x " + i + "=" + (i * 8));
//		}
//		System.out.println("------- 9단 -------");
//		for(int i = 1; i <10; i++) {
//			System.out.println("9x " + i + "=" + (i * 9));
//		}
		
//		for(int i = 2; i < 10; i++) {
//			for(int j = 1; j < 10; j++) {
//		    	System.out.println(i + " x " + j + " = " + (i * j));
//		    }
//		}
		
		
		/* 1.
		 * 반복문을 사용하고 1 ~ 100중 하나의 값을 입력받아
		 * 1부터 입력된 숫자까지 총합을 구하는 반복문을 만드시요.
		 * 
		 * 1 ~ 100까지의 숫자중 하나를 입력하세요 : 10
		 * 1에서 10까지의 총합은 55입니다.
		 * 
		 */
//		System.out.print("1 ~ 100까지의 숫자중 하나를 입력하세요 : ");
//		Scanner sc = new Scanner(System.in);
//		int num = 0;
//		int num2 = sc.nextInt();
//		
//		// if(num <= 100) 이렇게 하면 100까지로 제한할 수 있다.
//		if(num <= 100) {
//			for(int i = 1; i <= num2; i++) {
//			num = num + i; 
//		
//		}
//		System.out.println("1에서 10까지의 총합은 " + num +"입니다.");
//	  }
		

		/* 2.
		 * 반복문을 사용하여 아래와 같이 출력되도록 만드세요.
		 * 
		 * #
		 * ##
		 * ###
		 * 
		 * #을 1 ~ 3번까지 차례로 출력
		 * hint) 
		 * 1. String 변수에 "#"을 저장, 연산 하는 방법
		 * 2. for문 안에 for문을 사용한 이중 반복문 사용 방법.
		 */
		
		// 방법 1
//		for(int i = 1; i <= 3; i++) {
//			for(int j= 1; j <= i; j++) {
//				System.out.print("#");
//			}
//			System.out.println();
//		}
		
		// 방법 2
//		String shap = "#";
//		for(int i = 0; i < 3; i++) {
//			System.out.print(shap);
//			System.out.println();
//			shap = shap + "#";
//		}
		
		
//		
		
		/* 3.
		 * 사용자에게 1~3번 까지의 메뉴를 입력받고
		 * 그 번호에 해당하는 메뉴를 아래와 같이 표시한다.
		 * 단, 그외의 번호를 선택하면 "메뉴가 존재하지 않습니다."
		 * 를 출력하고 프로그램을 종료한다.
		 * switch or if문 아무거나 상관없음
		   반복문을 사용하여 '메뉴가 존재하지 않습니다.' 를 출력하고 반복을 종료하세요
		 * 
		 * 1 ~ 3번 메뉴를 선택하세요 : 
		 * 1. 햄버거를 선택하셨습니다.
		 * 2. 콜라를 선택하셨습니다.
		 * 3. 사이다를 선택하셨습니다.
		 * 메뉴가 존재하지 않습니다.
		 */
		Scanner sc = new Scanner(System.in);
//		
//		int menu = 0;
//		
//		while(menu <= 3) {
//			System.out.print("1 ~ 3번 메뉴를 선택하세요 :");
//			menu = sc.nextInt();
//			
//			if(menu == 1) {
//				System.out.println("1. 햄버거를 선택하셨습니다.");
//			} else if(menu == 2) {
//				System.out.println("2. 콜라를 선택하셨습니다.");
//			} else if(menu == 3) {
//				System.out.println("3. 사이다를 선택하셨습니다.");
//			} else {
//				System.out.println("메뉴가 존재하지 않습니다.");
//			}
//		}
		
		
		while(true) {
			System.out.print("1 ~ 3번 메뉴를 선택하세요 :");
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
