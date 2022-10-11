package day08;

import java.util.Arrays;
import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		// 공백을 사용( 2022 2 → 공백을 기준으로 나눠서 첫번째 인자(a)에 2022가 들어가고 2가 두번째 인자(b)에 들어간다.
//		System.out.print("현재 년도와 월을 쓰세요(예: 2022년 2월):");
//		
//		int a = sc.nextInt();
//		int b = sc.nextInt();
//		
//		System.out.printf("%d년 %d월", a, b);
		
		// 이중 if문
//		System.out.print("당신의 벌점은: ");
//		int nu = sc.nextInt();
//		int a = 0;
//		int b = 0;
//		
//		if(nu >= 30) {
//			a = 50000;
//			if(nu >= 35) {
//				b = 20000;
//			} else if(nu >= 31 && nu <= 34) {
//				b = 10000;
//			}
//		} else if(nu >= 20) {
//			a = 40000;
//			if(nu >= 25) {
//				b = 7000;
//			} else if(nu >= 21 && nu <= 24) {
//				b = 5000;
//			}
//		} else {
//			a = 30000;
//		}
//		System.out.printf("당신의 벌점은 %d이므로 벌금: %d", nu,(a+b));
		
		// 삼항연산자
//		System.out.println("==== 대기업 취업 ====");
//		System.out.print("당신의 서류점수는(만점:30점): ");
//		int paper = sc.nextInt();
//		System.out.print("당신의 필기점수는(만점:40점): ");
//		int test = sc.nextInt();
//		System.out.print("당신의 면접점수는(만점:30점): ");
//		int speak = sc.nextInt();
//		System.out.println("평균점수가 70점 이상이면 합격");
//		
//		
//		int avg = 0;
//		avg = (paper+test+speak)/3;
//		
////		// 직접 풀기
////		String a = " ";
////		a = avg >= 30 ? "합격" : "불합격";
////		
////		System.out.println("당신은 " + avg + "점이므로" + a +"입니다.");
//		
//		// boolean 사용
//		boolean a = avg >= 30;
//		String b = " ";
//		b = a ? "합격" : "불합격";
//		
//		System.out.printf("당신은 %d점이므로 %s입니다.", avg, b);
		
		// switch 사용
//		System.out.println("==== 문자투표 ====");
//		System.out.println("1. 김민주");
//		System.out.println("2. 안유진");
//		System.out.println("3. 김채원");
//		System.out.println("4. 조유리");
//		
//		System.out.print("투표: ");
//		int pick = sc.nextInt();
//		
//		switch (pick) {
//		case 1:
//			System.out.println("당신의 선택은 김민주입니다.");
//			break;
//		case 2:
//			System.out.println("당신의 선택은 안유진입니다.");
//			break;
//		case 3:
//			System.out.println("당신의 선택은 김채원입니다.");
//			break;
//		case 4:
//			System.out.println("당신의 선택은 조유리입니다.");
//			break;
//
//		default:
//			System.out.println("당신은 아무도 선택하지 않았습니다.");
//			break;
//		}
		
		// 2차원 배열
		int[][] arr = new int[4][3];
//		System.out.println(Arrays.deepToString(arr));		// 배열을 문자열로 변환시켜주는 코드
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				
			}
		}
		
	}

}
