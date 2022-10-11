package day7;

import java.util.Arrays;
import java.util.Scanner;

public class HomeWork {

	public static void main(String[] args) {
		/* 1.
		 * { 10, 50, 30 } 이런식으로 초기화한 배열에서 가장큰 수 찾아내기
		 * 3개의 값 중에서 가장 큰 수를 찾아내는 알고리즘
		 * 
		 * 가장 큰 수는 50입니다.
		 */
		
//		int[] a = new int[] {10, 50, 30};
//		int max = a[0];
//		
//		for (int i = 1; i < a.length; i++) {
//			if(a[i] > max) {
//				max = a[i];
//			}
//		}
//		System.out.println("가장 큰 수는: " + max);

		/* 2.
		 * { 10, 50, 30, 4, 100 } 이런식으로 초기화한 배열에서 
		 * 가장큰 수와 가장 작은 수 찾아내기
		 * 큰 수와 작은 수 찾기 알고리즘 문제
		 * 
		 * 가장 큰 수는 100이고, 가장 작은수는 4입니다.
		 */
//		int[] a2 = {10, 50, 30, 4, 100};
//		
//		int max = a2[0];
//		int min = a2[0];
//		
//		for (int i = 1; i < a2.length; i++) {
//			if(a2[i] > max) {
//				max = a2[i];
//			} else if(a2[i] < min) {
//				min = a2[i];
//			}
//		}
//		System.out.printf("가장 큰 수는 %d이고, 가장 작은수는 %d입니다.", max, min);	
		
		/* 3.
		 * ===== 주문 메뉴 =====
		 * 1. 햄버거 2000원
		 * 2. 감자튀김 500원
		 * 3. 콜라 1000원
		 * 4. 주문하기 
		 * 
		 * 을 배열로 생성하여 출력하고.
		 * 해당 메뉴를 사용자가 선택하면 배열에 저장하여
		 * 4. 주문하기 선택시 계산하여 주문 금액을 출력한다.
		 *  
		 * 주문 메뉴를 선택하세요 : 1
		 *       주문 메뉴 출력 ....
		 * 주문 메뉴를 선택하세요 : 2
		 *       주문 메뉴 출력 ....
		 * 
		 * 단, 최대 주문 받을수 있는 횟수는 5회 까지로 한다.
		 * 
		 * 총 결제 금액은 XXX 원입니다.
		 */
		Scanner sc = new Scanner(System.in);
//		String[] menu = new String[] {"햄버거 2000원", "감자튀김 500원","콜라 1000원", "주문하기"};
//		int[] money = {2000, 500, 1000, 0};		// 여기에 있는것이 위에있는 배열에 저장
//		int[] a = new int[5];
//		int price = 0;
		
//		System.out.println("==== 주문메뉴 ====");
//		System.out.println("1." + menu[0]);
//		System.out.println("2." + menu[1]);
//		System.out.println("3." + menu[2]);
//		System.out.println("4." + menu[3]);
//		
//		for(int count = 0; count <5; count++) {
//			if(count < 5) {				// 5 밑으로만 가능하게 조건을 넣어준것임
//				System.out.print("주문 메뉴를 선택하세요: ");
//				int me = sc.nextInt();
//				if(me == 1) {
//					System.out.println("주문 메뉴 출력 " + menu[0]);
//					price = price + 2000;
//					System.out.printf("주문 금액 : %d원\n", price);
//					System.out.printf("남은 횟수 : %d번\n", 5 - count );
//				} else if(me ==2) {
//					System.out.println("주문 메뉴 출력 " + menu[1]);
//					price = price + 500;
//					System.out.printf("주문 금액 : %d원\n", price);
//					System.out.printf("남은 횟수 : %d번\n", 5 - count );
//				} else if(me ==3) {
//					System.out.println("주문 메뉴 출력 " + menu[2]);
//					price = price + 1000;
//					System.out.printf("주문 금액 : %d원\n", price);
//					System.out.printf("남은 횟수 : %d번\n", 5 - count );
//				} else if(me == 4) {
//					break;
//			}
//			
//			
//			
//			}
//		}
//			System.out.printf("총 결제 금액은 %d원 입니다." , price);
		
		String[] menu = new String[] {"1. 햄버거 2000원", "2. 감자튀김 500원","3. 콜라 1000원", "4. 주문하기"};
		int[] money = {2000, 500, 1000, 0};		// 여기에 있는것이 위에있는 배열에 저장
		int[] a = new int[5];
		int price = 0;
		
		for(int count = 0; count < 5; count++) {
			System.out.println("===== 주문메뉴 =====");
			for (int i = 0; i < menu.length; i++) {
				System.out.println(menu[i]);
			}
			System.out.print("주문 메뉴를 선택하세요: ");
			int food = sc.nextInt();
			// 4번을 선택하면 종료해야하므로
			if(food >= 4) {
				break;
			}
			
			// 현재 횟수에 해당하는 배열번째에 주문한 번호의 n-1번째 값을 저장한다.
			a[count] = money[food-1];
		}
		
			int total = 0;
			for (int i = 0; i < a.length; i++) {
			total += a[i];
		}
			System.out.printf("총 결제 금액은 %d원 입니다." , total);
		

	}

}
