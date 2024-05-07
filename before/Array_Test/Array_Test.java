import java.util.Arrays;
import java.util.Scanner;

public class Array_Test {

	public static void main(String[] args) {
		//10칸짜리 빈 배열 만들고 1부터 10까지 채워넣은 뒤
		//배열의 각 방에 있는 값들 출력하기
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
			System.out.println(arr[i]);
		}
	
	
		
		// 방번호 = 값 - 1
//		arr[0] = 1;
//		arr[1] = 2;
//		arr[2] = 3;
//		arr[3] = 4;
//		arr[4] = 5;
//		arr[5] = 6;
//		arr[6] = 7;
//		arr[7] = 8;
//		arr[8] = 9;
//		arr[9] = 10;
		System.out.println("====================");
		
		//10칸짜리 빈 배열 만들고 10부터 1까지 채워넣은 뒤
		//배열의 각 방에 있는 값들 출력하기
		int[] arr2 = new int[10];
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = 10 - i;
			System.out.println(arr2[i]);
		}
		System.out.println("====================");
		
		//서울시, 해바라기, 고양이, Java, 레드벨벳, 한우오마카세 
		//반복문으로 출력하기
		String[] name = {"서울시", "해바라기", "고양이","레드벨벳", "한우오마케세"};
		for (int i = 0; i < name.length; i++) {
			System.out.println(name[i]);
		}
		System.out.println("====================");
		//사용자에게 5개의 정수 입력받아서 (1,2,3,4,5)
				//1번째 정수 : 1
				//2번째 정수 : 2
				//3번째 정수 : 3
				//..
				//5번째 정수 : 5
				//총합 : 15
		Scanner sc = new Scanner(System.in);
		
//		System.out.print("1번쨰 정수 : ");
//		int num = sc.nextInt();
//		System.out.print("2번쨰 정수 : ");
//		int num2 = sc.nextInt();
//		System.out.print("3번쨰 정수 : ");
//		int num3 = sc.nextInt();
//		System.out.print("4번쨰 정수 : ");
//		int num4 = sc.nextInt();
//		System.out.print("5번쨰 정수 : ");
//		int num5 = sc.nextInt();
//		
//		int[] arr3 = {num, num2, num3, num4,num5};
//		int sum = 0;
//		for (int i = 0; i < arr3.length; i++) {
//			sum += arr3[i];
//		}
//		System.out.println("총합 : " + sum);
//		System.out.println("==============");
		
//		int[] arr3 = new int[5];
//		int sum = 0;
//		for (int i = 0; i < arr3.length; i++) {
//			arr3[i] = sc.nextInt();
//			sum += arr3[i];
//		}
//		System.out.println(sum);
		
		//국어점수, 영어점수, 수학점수 입력받아서 총점과 평균점수 출력하기
				//국어점수 : 100
				//영어점수 : 80
				//수학점수 : 90
				
				//총점 : 270
				//평균 : 90.0점
		System.out.print("국어점수 : ");
		int kor = sc.nextInt();
		System.out.print("영어점수 : ");
		int eng = sc.nextInt();
		System.out.print("수학점수 : ");
		int mat = sc.nextInt();
		
		int[] arr4 = {kor, eng, mat};
		int[] score = new int[arr4.length];
		int total = 0;
		float avg = 0f;
		
		for (int i = 0; i < score.length; i++) {
			 total += arr4[i];
		}
		avg = total / (float)arr4.length;
		System.out.println("총점 : " + total);
		System.out.printf("평균 : %.1f\n", avg);
	}
	
}
