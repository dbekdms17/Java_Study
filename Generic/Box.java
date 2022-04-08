package generic;

import java.awt.print.Paper;

public class Box<M, I> {
	private M material;
	private I item;
	
	
	public void setMaterial(M material) {
		this.material = material;
	}
	
	public M getMaterial() {
		return material;
	}
	
	public void setItem(I item) {
		this.item = item;
	}
	public I getItem() {
		return item;
	}
	
	
	
	
	public static void main(String[] args) {
//		Box<Paper, String> box = new Box<Paper, String>();
		Box<Paper, String> box = new Box<>();
		Box box2 = new Box<>(); 		// Object로 간주
		
		// 클래스의 제네릭 타입이 전역 변수처럼 사용된다면 메소드의 제네릭 타입은 해당 메소드 안에서만
		// 사용할 수 있는 지역성을 가진다.
	
		
	}

}
