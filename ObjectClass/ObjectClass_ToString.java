package put_in;

class Book {
	String title;
	String author;
	
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}

	// object에 있는 ToString을 여기서 재정의를 해준다.
	@Override
	public String toString() {
		return author + ", " + title;
	}
	
	
}

public class ObjectClass_ToString {

	public static void main(String[] args) {
		Book book = new Book("토지", "박경리");
		// class Book에서 ToString을 재정의를 하지 않았으면 Object에 있는 toString을 가져와서
		// hashCode를 가져온다. 그러나 class Book에서 재정의를 해줬기 때문에 
		// return author + ", " + title ← 이것들이 반환
		System.out.println(book);	// 출력 : 박경리, 토지
	}

}
