package day08;

import java.util.Scanner;

public class Exanm01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// while(true), switch, if, for(;;) 사용
		int arr = 0;
		int menu = 0;
		int price = 0;
		
		Loop1:
		while(true) {
			System.out.println("1. A코스");
			System.out.println("2. B코스");
			System.out.println("3. C코스");
			System.out.print("원하는 코스(1~3번)를 고르세요 (종료 0번):");
			menu = sc.nextInt();
			
			switch (menu) {
			case 1:
				System.out.println("A코스 가격: 30000");
				break;
			case 2:
				System.out.println("B코스 가격: 20000");
				break;
			case 3:
				System.out.println("C코스 가격: 15000");
				break;
			}
			
			if(menu == 0) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} else if(!(1 <= menu && menu <= 3)) {
				System.out.println("메뉴를 잘못 선택하셨습니다.(종료 0번)");
				continue;
			}
			System.out.printf("%d번을 고르셨습니다.\n", menu);
			System.out.println("다음 단계로 넘어갑니다.");
			
			for(;;) {
				System.out.println("5000원 파스타");
				System.out.println("4000원 볶음밥");
				System.out.println("3000원 치킨너겟");
				System.out.print("추가적인 금액을 지불해서 서브메뉴를 고르시요(종료 0번, 프로그램 종료 99번): ");
				arr = sc.nextInt();
				
				if(arr == 0) break;
				if(arr == 99) break Loop1;
				
				if(arr == 5000) {
					System.out.println("서브메뉴로 파스타를 고르셨습니다.");
				} else if(arr == 4000) {
					System.out.println("서브메뉴로 볶음밥을 고르셨습니다.");
				} else if(arr == 3000) {
					System.out.println("서브메뉴로 치킨너겟을 고르셨습니다.");
				} else {
					System.out.println("서브메뉴를 고르지 않으셨습니다.");
				}
			}
		}
		
		
		
	}

}
