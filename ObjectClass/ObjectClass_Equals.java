package put_in;

class Student {
	int srudentNum;
	String studentName;
	
	
	public Student(int srudentNum, String studentName) {
		this.srudentNum = srudentNum;
		this.studentName = studentName;
	}


	@Override
	// String("abc")에서 받아온 abc를 obj에 넣으면서 Object로 업캐스팅하고
	public boolean equals(Object obj) {
		// 업캐스팅한 abc를 Student로 형변환 가능한것인지 확인 즉, 포함된 것인지 확인
		if(obj instanceof Student) {
		// true라면 obj(abc)를 Student로 다운캐스팅
		Student std = (Student)	obj; 		// Object클래스로 업캐스팅된걸 다운캐스팅
		return (this.srudentNum == std.srudentNum);
		}
		return false;
	}
	
	
}


public class ObjectClass_Equals {

	public static void main(String[] args) {
		System.out.println("=============== equals 재정의 전 =================");
		String str1 = new String("abc");
		String str2 = new String("abc");
		
		// str1==str2 에서 ==은 주소값이 동일한지 물어보는 것임으로 물리적동일함을 묻는 것이고 
		// 두 인스턴스는 다른 주소에 있기 때문에 false가 반환됩니다.
		System.out.println(str1 == str2);  		// false
		
		// stra.equals(str2)는 논리적 동일성을 묻고 있기 때문에 두인스턴의 값은 abc로 같기에 true가 반환됩니다.
		System.out.println(str1.equals(str2)); 	// true
		
		System.out.println("=============== equals 재정의 후 =================");
		Student kim = new Student(100, "김민주");
		Student kim2 = kim;
		Student minju = new Student(100, "김민주");
		
		// kim과 kim2는 물리적으로 같은 주소를 가지고 있기 때문에 true가 반환됩니다.
		System.out.println(kim == kim2); 		// true
		// kim과 minju는 물리적으로 같지 않기 때문에 false가 반환됩니다.
		System.out.println(kim == minju); 		// false
		
		// 메서드에서 사용될 때 비교되는 항목이 자동으로 Object로 업캐스팅 되기 때문에 
		// instanceof를 사용해서 안전하게 Student 클래스로 다시 다운캐스팅하고 
		// 두 항목의 studentNum을 비교하게 재정의합니다. true가 반환됩니다.
		System.out.println(kim.equals(minju)); 	// true
		
	}

}
