package put_in;

class ItemCode {
	String code;
	
	public ItemCode(String code) {
		this.code = code;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof ItemCode) {
			ItemCode code2 = (ItemCode)obj;
			return (this.code == code2.code);
		}
		return false;
	}

	@Override
	public String toString() {
		return "아이템 정식 코드 : " + code;
	}
	
	
	
	
}

public class Object {

	public static void main(String[] args) {
		ItemCode item = new ItemCode("145023723");
		ItemCode item2 = new ItemCode("145023723");
		
		// equals를 오버라이드 하기전에는 false 
		// 하고 나서는 true
		System.out.println(item.equals(item2));
		
		// "145023723"이게 매개변수 code에 넣어져서 toString에서 return "아이템 정식 코드 : " + code이것이 반환해서
		// toString을 오버라드해서 아이템 정식 코드 : 145023723 출력
		// 오버라이드 하지 않으면 Object에 있는 toString을 가져오지만 오버라이드해서 내가 만든 클래스에 있는 toString을 가져와서
		// item에 대한 정보를 알 수 있게 해준다.
		System.out.println(item);
	}

}
