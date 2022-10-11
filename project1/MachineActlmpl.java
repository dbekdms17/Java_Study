package Project;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class MachineActlmpl implements MachineAct {
	Scanner sc = new Scanner(System.in);
	
	ArrayList<MachineVO> list = new ArrayList<MachineVO>();
	
	private int remain_Money = 0;

	@Override
	// 돈을 투입하는 메소드
	public void insert_Coin() {
		int ch;
		
		System.out.println("1. 5000원");
		System.out.println("2. 1000원");
		System.out.println("3. 500원");
		System.out.println("4. 100원");
		// 사용자에게 입력 
		System.out.print("돈을 넣어주세요 : ");
		ch = sc.nextInt();
		
		switch (ch) {
		case 1:
			remain_Money = remain_Money + 5000;
			System.out.println("투입금액 5000원");
			break;
		case 2:
			remain_Money = remain_Money + 1000;
			System.out.println("투입금액 1000원");
			break;
		case 3:
			remain_Money = remain_Money + 500;
			System.out.println("투입금액 500원");
			break;
		case 4:
			remain_Money = remain_Money + 100;
			System.out.println("투입금액 100원");
			break;
		}
		// 위에서 선택한 금액들의 누적 금액이 나옴
		System.out.println("사용 가능 금액 : " + remain_Money);
	}

	@Override
	// 돈을 반환하는 메소드
	public void return_Coin() {
		// 0원이면 반환할 돈이 없기 때문에 반환 안함
		if(remain_Money == 0) {
			System.out.println("반환할 돈이 없습니다.");
		} else {
			// ① 0원이 아니면 remain_Money를 0원으로 맞춰주고
			// ② 반환완료가 뜸
			// ③ 위에서 0원으로 맞춰준 금액이 나옴
			remain_Money = 0;
			System.out.println("반환완료");
			System.out.println("사용 가능 금액 : " + remain_Money);
		}
	}

	@Override
	// 자판기 메뉴를 등록하는 메소드
	public void enter_Menu() {
		MachineVO vo = new MachineVO();
		System.out.println("== 자판기 메뉴 등록 == ");
		System.out.print("메뉴 이름 : ");
		vo.setDrink_name(sc.next());
		System.out.println("메뉴 가격 (숫자만 입력) : ");
		vo.setDrink_price(sc.nextInt());
		System.out.println("재고등록(채울 개수) : ");
		vo.setDrink_stock(sc.nextInt());
		list.add(vo);
		System.out.println("등록완료");
	}

	@Override
	// 제품 삭제하는 메소드
	public void delete_Menu() {
		System.out.println("삭제할 제품명 입력 : ");
		String s ="";
		// 객체 생성
		MachineVO vo = new MachineVO();
		print_Menu();
		s = sc.next();
		
		// Iterator 생성 및 반복돌림
		Iterator<MachineVO> it = list.iterator();
		while(it.hasNext()) {
			// vo에 대입하여 vo를 반환
			vo = it.next();
			// 사용자가 쓴 음료수이름과 vo에 담긴 음료수이름 확인
			if(s.equals(vo.getDrink_name())) {
				// 같은 이름이면 삭제
				list.remove(vo);
				System.out.println("삭제완료");
				break;
			}
		}
	}

	@Override
	public void update_Menu() {
		System.out.println("수정 할 제품 명 입력 : ");
		String s = "";
		MachineVO vo = new MachineVO();
		print_Menu();
		s = sc.next();
		
		Iterator<MachineVO> it = list.iterator();
		while(it.hasNext()) {
			vo = it.next();
			
			if(s.equals(vo.getDrink_name())) {
				System.out.print("(수정)메뉴 이름 : ");
				vo.setDrink_name(sc.next());
				System.out.print("(수정)메뉴 가격(숫자만 입력) : ");
				vo.setDrink_price(sc.nextInt());
				System.out.println("(수정)재고 입력 : ");
				vo.setDrink_stock(sc.nextInt());
				System.out.println();
				System.out.println("수정완료");
				break;
			}
		}
	}

	@Override
	public void enter_Stock() {
		System.out.println("=== 재고충전 ===");
		System.out.println("충전할 음료명 입력 : ");
		String s ="";
		s = sc.next();
		
		int stock = 0;
		MachineVO vo = new MachineVO();
		print_Menu();
		System.out.println();
		
		
		
		Iterator<MachineVO> it = list.iterator();
		while(it.hasNext()) {
			vo = it.next();
			if(s.equals(vo.getDrink_name())) {				
				System.out.print("충전할 재고 수량 입력 : ");
				stock = sc.nextInt();
				vo.setDrink_stock(vo.getDrink_stock() + stock);
				System.out.println(vo.getDrink_name() + "충전완료재고 : " + vo.getDrink_stock());
				break;
			}
		}
	}

	@Override
	// 메뉴 보여주는 메소드
	public void print_Menu() {
		System.out.println("==== 메뉴 ====");
		
		MachineVO vo = new MachineVO();
		Iterator<MachineVO> it = list.iterator();
		while(it.hasNext()) {
			vo = it.next();
			System.out.println("제품명 : " + vo.getDrink_name());
			System.out.println("가격 : " + vo.getDrink_price());
			System.out.println("재고 개수 : " + vo.getDrink_stock());
		}
	}

	@Override
	public void choice_Menu() {
		System.out.println("==== 메뉴 선택 ====");
		
		print_Menu();
		System.out.println();
		System.out.print("원하는 제품명 입력 : ");
		
		String s = "";
		MachineVO vo = new MachineVO();
		Iterator<MachineVO> it = list.iterator();
		while(it.hasNext()) {
			vo= it.next();
			
			if(s.equals(vo.getDrink_stock())) {
				if(vo.getDrink_stock() == 0) {
					System.out.println("재고가 없습니다.");
					break;
				}
				if(remain_Money - vo.getDrink_price() < 0) {
					System.out.println("잔액이 부족합니다.");
					break;
				}
				remain_Money = remain_Money - vo.getDrink_price();
				vo.setDrink_stock(vo.getDrink_stock() -1);
				System.out.println(vo.getDrink_name() + "출력완료, 남은돈" 
				+ remain_Money + "재고 : " +vo.getDrink_stock());
			}
		}
	}

	
}
