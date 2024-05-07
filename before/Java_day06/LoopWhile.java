package day06;

import java.util.Scanner;

public class LoopWhile {

	public static void main(String[] args) {
		// while 간단한 예 (홍길동 10번 출력)
//		int i = 0;
//		System.out.println("while 시작 전");
//		while(i < 10) {
//			System.out.println("홍길동");
////			i = i + 1; 		// 증감연산자
//			i += 1;			// 증감연산자(누적연산자)
//		}
//		System.out.println("while 종료 후");
		
		// while의 진정한 쓰임세(시스템이 종료될때까지 무한 반복, 식당 메뉴 키오스크)
//		Scanner sc = new Scanner(System.in);
//		int menu = 0;	// 메뉴 4번 입력하면 종료
//		
//		while(menu < 5) {
//			System.out.print("0 ~ 4번 메뉴를 선택하세요 (종료는 5번)");
//			menu = sc.nextInt();
//			
//			if(menu < 5) {
//				System.out.println(menu + "번 메뉴를 선택했습니다.");
//			} else {
//				System.out.println("시스템을 종료합니다.");
//			}
		
//		while(true) {
//			System.out.print("0 ~ 4번 메뉴를 선택하세요 (종료는 5번)");
//			menu = sc.nextInt();
//			
//			if(menu < 5) {
//				System.out.println("menu" + "번 메뉴를 선택했습니다.");
//			} else {
//				System.out.println("시스템을 종료합니다.");
//				break;
//			}
			
//			int i = 5;
//			while(i--!=0) {
//				System.out.println(i + " - I can do it.");
			// i-- != 0 i의 값이 0이 아닌 동안만 참이되고, i의 값이 매 반복마다
			// 1씩 감소하다 0이 되면 조건식은 거짓이 되어 while 문을 벗어난다.	
				
		}
		
		int num = 0, sum = 0;
		System.out.print("숫자를 입력하세요(예: 12345):");
		Scanner sc = new Scanner(System.in);
		String tmp = sc.next();
		num = Integer.parseInt(tmp);
	
		while(num != 0) {
			sum = sum + num % 10;	// 12345 % 10 → 5(나머지 값)
			System.out.printf("sum=%3d num=%d\n", sum, num);
			num = num / 10;			// num을 10으로 나눈 값을 다시 num에 저장
	}								// 12345 / 10 → 1234
			// 입력 받은 숫자 num을 0이 될 때까지 반복해서 10으로 나눠가면서,
			// 10으로 나머지 연산을 하면 num의 모든 자리를 구할 수 있다.
		System.out.println("각 자리수의 합:" + sum);
		/*
		 * 첫 번째)
		 * num에서 12345를 써줘서 num % 10해서 5가 나옴
		 * sum이 0이니 0 + 5해서 5가 나오고 printf sum에 5가 기록
		 * num은 처음 기록한 12345가 나옴
		 * 그 후, 12345 /10 = 1234가 num에 초기화됨
		 * 두 번째)
		 * 1234가 num % 10(1234 % 10) = 4가 나오고 먼저 저장된 sum =5가
		 * 5+4가 되어서 printf sum에 9가 기록
		 * num은 1234가 되고 다시 1234 / 10 = 123이 됨
		 * 다시 반복해서 123 % 10 = 3이 되고 sum + num(9 + 3)
		 * printf sum에 12가 기록되고 num은 123이 됨
		 * num / 10 (123 / 10) = 12가 num에 초기화
		 * 다시 반복 12 % 10 = 2, sum + num(12+2) = 14가 sum에 대입
		 * num에 12가 옴
		 * 12 / 10 = 1, num % 10(1 % 10) = 1이 sum(14)와 더해서 15가
		 * sum에 오고 num은 1, num / 10(1/10) = 0이 나와서 조건식이
		 * false가 나와서 나와짐 
		 */
		
		
	}

}
