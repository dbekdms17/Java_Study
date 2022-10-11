package day06;

import java.util.Scanner;

public class StudyJava {

	public static void main(String[] args) {
//		for(int i = 1; i <= 10; i++) {
//			System.out.println("안유진"); 
//		}
//		
		
		int input = 0, answer = 0;
		
//		answer = (int)(Math.random() * 100) + 1; // 1~100 사이의 임의의 수를 저장
		answer = (int)'A';
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.print("점수를 기록하시요 : ");
			input = sc.nextInt();
			
			if(input > answer) {
				System.out.println("금메달");
			} else if(input == answer) {
				System.out.println("은메달");
			} else if(input < answer) {
				System.out.println("동메달"); 
			}
		} while(input != answer);
		System.out.println("정답입니다");
	}

}
