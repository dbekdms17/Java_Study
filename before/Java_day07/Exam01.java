package day7;

import java.util.Arrays;	// ctrl + shift + o하면 자동으로 import문 추가. Arrays.toString 사용하려면 해야함
import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
//		int[] score;				// 1. 배열 score를 선언(참조변수)
//		score = new int[5];			// 2. 배열의 생성(int 저장공간 x 5)
//		
////		int[] score = new int[5];	// 배열의 선언과 생성을 동시에
//		score[3] = 100;
//		
//		System.out.println("score[0]=" + score[0]);
//		System.out.println("score[1]=" + score[1]);
//		System.out.println("score[2]=" + score[2]);
//		System.out.println("score[3]=" + score[3]);
//		System.out.println("score[4]=" + score[4]);
//		
//		int value = score[3];		// score[3]에 있는 100을 value에 저장		
//		System.out.println("value="+value);
		
//		int[] arr = new int[10];
//		System.out.println("arr.length="+arr.length);		// arr 배열의 길이가 10개
//		
//		for(int i = 0; i<10; i++) {
//			System.out.println("arr["+i+"]=" +arr[i]);		// 배열의 모든 요소가 출력
//		}													// // arr[i] 하면 배열의 길이 안에있는 값이 나옴				
		
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println("arr["+i+"]=" +arr.length);	// 배열이름.length 하면 길이만 나옴
//		}
		
//		int[] iArr = {100,95,80,70,60};
		
//		for (int i = 0; i < iArr.length; i++) {
//			System.out.println(iArr[i]);
//		}
//		System.out.println(Arrays.toString(iArr));   		// [100, 95, 80, 70, 60] 이런식으로 문자열로 출력
		
		// 배열의 활용1) 총합과 평균
//		int sum = 0;
//		double avg = 0f;
//		
//		int[] score = {100, 88, 100, 100, 90};
//		
//		for (int i = 0; i < score.length; i++) {
//			sum= sum + score[i];
//		}
//		avg = sum / (float)score.length;		// 5로 나눠도 되지만 추가될 수 있으니 score.length를 사용
//												// (float)를 사용한 이유는 평균값을 구하기 위해 소수점으로 구하려고
//		System.out.println("총합 :" +sum);
//		System.out.println("평균 :" +avg);
		
		// 배열의 활용2) 최대값과 최소값
		int[] score = {79, 88, 91, 33, 100, 55, 95};
		
		int max = score[0];						// 배열의 첫 번째 값으로 최대값을 초기화한다. (79가 저장)
		int min = score[0];						// 배열의 첫 번째 값으로 최소값을 초기화한다. (79가 저장)	
		
		for (int i = 1; i < score.length; i++) {// 1부터 시작한 이유는 첫번째를 이미 max, min에 초기화해서 1부터 시작
			if(score[i] > max) {				// score[i]가 88부터 시작하고 max는 79이니까 '참'
				max = score[i];					// score[i] 88이 max에 저장
			} else if(score[i] < min) {			// 계속 가다가 33을 만나면 거짓이 되니 else if로 건너옴
				min = score[i];					// score[i] 33이 min에 저장
			}
		}
		System.out.println("최대값: " + max);
		System.out.println("최소값: " + min);
	}

}
