import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] cls = {"국어", "영어", "수학"};
		int[] score = new int[cls.length];
		int total = 0; 
		double avg = 0.0;
		
		for (int i = 0; i < score.length; i++) {
			System.out.print(cls[i] + "점수 : ");
			score[i] = sc.nextInt();
			
			total += score[i];
		}
		avg = total / score.length;
		System.out.println("총점 : " + total);
		System.out.printf("평균 : %.1f\n" + avg);
 	}

}
