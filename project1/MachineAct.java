package Project;

public interface MachineAct {
	public abstract void insert_Coin(); 	// 동전투입
	public abstract void return_Coin();		// 잔돈반환
	public abstract void enter_Menu();		// 메뉴등록
	public abstract void delete_Menu();		// 메뉴삭제
	public abstract void update_Menu();		// 메뉴수정
	public abstract void enter_Stock();		// 재고등록
	public abstract void print_Menu();		// 메뉴보기
	public abstract void choice_Menu();		// 메뉴선택
}
