package day08;

public class Casting {

	public static void main(String[] args) {
		String score = "10";
		// 문자를 정수형으로 형변환
//		int num = Integer.parseInt(score);
		System.out.println(Integer.parseInt(score)+10);
		
		// 문자를 실수형으로 형변환
		double pi = Double.parseDouble("3.141354");
		System.out.println(pi + 10);
		
		// 정수를 문자열로 형변환
		String snumber = Integer.toString(10);
		System.out.println(snumber);
		
		// 실수를 문자열로 형변환
		String strpi = Double.toString(3.14169);
		System.out.println(strpi);
		
		// 자동 형변환
		String a = 1234 + "";			// 1234가 ""와 만나서 문자열로 변환
		System.out.println(a);
		String b = 123 + 100 + "";
//		int c = 123 + 100;
//		String d = c + ""; 
		System.out.println(b);
		String c = 123 + "" + 100;
		System.out.println(c);
		String d =  123 + "" + 100 + 345;
		System.out.println(d);           // 출력: 123100345
		String e = 123 + "" + (100 + 345);	// 출력: 123445
		
		String f = "abcd";
		char g = f.charAt(0);
		System.out.println(g);  			// 첫번째꺼를 추출(a만 빼옴)
		
		String str = "012345";
		String tmp = str.substring(1,4);	// str에서 index범위 1~4의 문자들을 반환
		System.out.println(tmp);
	}

}
