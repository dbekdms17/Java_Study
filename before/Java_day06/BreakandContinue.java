package day06;

import java.util.Scanner;

public class BreakandContinue {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		int menu = 0;
//		int num = 0;
//		
//		while(true) {
//			System.out.println("1. 샤브샤브");
//			System.out.println("2. 치킨");
//			System.out.println("3. 족발");
//			System.out.print("원하는 메뉴(1~3)를 선택하세요(종료:0): ");
//			
//			menu = sc.nextInt();
//			
//			if(menu == 0) {
//				System.out.println("프로그램을 종료합니다.");
//				break; // 0번을 하면 종료함
//			} else if(!(1 <= menu && menu <= 3)) {
//				System.out.println("메뉴를 잘못고르셨습니다.(종료:0)");
//				continue; // 1~3번 외에 번호를 선택하면 continue문이 바깥으로 뺌 
//			}
//			System.out.println("선택하신 메뉴는 " + menu + "번입니다.");
//		}
		
		// 이름 붙은 반복문
		
		int menu = 0, num = 0;
		
		outer:
			while(true) {
				System.out.println("1. 샤브샤브");
				System.out.println("2. 족발");
				System.out.println("3. 치킨");
				System.out.print("원하는 메뉴(1~3)을 고르세요(종료:0)");
				menu = sc.nextInt();
				
				if(menu == 0) {
					System.out.println("프로그램을 종료합니다.");
					break;
				} else if(!(1 <= menu && menu <= 3)) {
					System.out.println("메뉴를 잘못 선택하셨습니다.(종료:0)");
					continue;
				} else if(menu == 1) {
					System.out.println("샤브샤브를 고르셨습니다.");
					System.out.println("가격: 14500원");
				} else if(menu == 2) {
					System.out.println("족발을 고르셨습니다.");
					System.out.println("가격: 34000원");
				} else if(menu == 3) {
					System.out.println("치킨을 고르셨습니다.");
					System.out.println("가격: 20000원");
				}
				for(;;) {
					System.out.print("계산할 값을 입력하세요. (계산 종료:0, 전체 종료:99): ");
					num = sc.nextInt();
					
					if(num == 0) break;
					if(num == 99) break outer;
					
					switch (menu) {
					case 1:
						System.out.println("result = " + num+"원");
						break;
					case 2:
						System.out.println("result = " + num+"원");
						break;
					case 3:
						System.out.println("result = " + num+"원");
						break;
					
					}
				}
			}
	}

}
