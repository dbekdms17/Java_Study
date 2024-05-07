package day08;

import java.util.Arrays;

public class Array2D {

	public static void main(String[] args) {
		// 배열 선언
//		int[] arr = new int[3];
//		// 배열의 값을 출력해주기 위해 사용하는 편리한 메소드
//		System.out.println(Arrays.toString(arr));	// 1차원
		
		int[][] arr2 = new int[4][3];
		// 배열의 값을 출력해주기 위해 사용하는 메소드
//		System.out.println(Arrays.deepToString(arr2));
//		System.out.println(arr2[0].length);			// 출력: 3 → 0번에 뒤에 3칸은 같기때문
//		System.out.println(arr2[1].length);			// 출력: 3
//		System.out.println(arr2[2].length);			// 출력: 3
		
		// for문
//		int no = 1;
//		for (int i = 0; i < arr2.length; i++) {
//			for (int j = 0; j < arr2[0].length; j++) {
//				System.out.println(no +". " +arr2[i][j]);
//				no += 1;
//			}
//		}
		
		// 2차원 배열도 선언과 동시에 초기화
//		int[][] arrs = {{1,2,3}, {4,5,6}, {7,8,9}};		// 3 x 3 = 9
//		for (int i = 0; i < arrs.length; i++) {	// 3
//			for (int j = 0; j < arrs[0].length; j++) { // 3
//				System.out.println(arrs[i][j]);
//			}
//		}
//		
//		int[][] score = {
//				{100, 100, 100},
//				{20,20,20},
//				{30, 30, 30},
//				{40,40,40}
//		};
//		int sum = 0;
//		
//		for (int i = 0; i < score.length; i++) {
//			for (int j = 0; j < score[i].length; j++) {
//				System.out.printf("score[%d][%d]=%d\n", i, j, score[i][j]);
//				
//				sum += score[i][j];
//			}
//		}
//		System.out.println("sum= " + sum);
		
		int[][] score = {
				{100, 100, 100},
				{20, 20, 20},
				{30, 30, 30},
				{40, 40, 40},
				{50, 50, 50},
		};
		// 과목별 총점
		int korTotal = 0, engTotal = 0, mathTotal = 0;
		
		System.out.println("번호 국어 영어 수학 총점 평군");
		System.out.println("=========================");
		
		for (int i = 0; i < score.length; i++) {
			int sum = 0;		// 개인별 총점
			float avg = 0f;		// 개인별 평균
			
			korTotal += score[i][0];
			engTotal += score[i][1];
			mathTotal += score[i][2];
			System.out.printf("%3d", i+1);
			
			for (int j = 0; j < score[i].length; j++) {
				sum += score[i][j];
				System.out.printf("%5d", score[i][j]);
			}
			avg = sum / (float)score[i].length;
			System.out.printf("%5d %5.1f%n", sum, avg);
		}
		System.out.println("================================");
		System.out.printf("총점:%3d %4d %4d%n", korTotal, engTotal, mathTotal);
		
		
		}

}
