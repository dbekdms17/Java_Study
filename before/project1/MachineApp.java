package Project;

import java.util.Scanner;

public class MachineApp {

	public static void main(String[] args) {
		MachineActlmpl mc = new MachineActlmpl();
		Scanner sc = new Scanner(System.in);
		
		int ch =0;
		
		while(true) {
			do {
				System.out.println("1. 동전 투입");
				System.out.println("2. 잔돈 반환");
				System.out.println("3. 메뉴 선택");
				System.out.println("4. 관리자 메뉴");
				System.out.println("5. 종료 ▶");
				System.out.print("번호를 고르세요 : ");
				ch = sc.nextInt();
			} while(ch < 1 || ch > 5);
			
			if(ch == 5) break;
			
			switch (ch) {
			case 1:
				mc.insert_Coin();
				break;
			case 2:
				mc.return_Coin();
				break;
			case 3:
				mc.choice_Menu();
				break;
			case 4:
				while(true) {
					do {
						System.out.println("1. 메뉴 등록");
						System.out.println("2. 메뉴 삭제");
						System.out.println("3. 메뉴 수정");
						System.out.println("4. 재고 등록");
						System.out.println("5. 이전 ▶");
						System.out.print("번호를 고르세요 : ");
						ch = sc.nextInt();
					} while(ch <1 || ch >5);
					
					if(ch == 5) break;
					
					switch (ch) {
					case 1:
						mc.enter_Menu();
						break;
					case 2:
						mc.delete_Menu();
						break;
					case 3:
						mc.update_Menu();
						break;
					case 4:
						mc.enter_Stock();
						break;
					}
				}
				break;
			}
		}
	}

}
