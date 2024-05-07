package day7;

public class Array2 {

	public static void main(String[] args) {
//		int[] score = new int[5];
//		score[0] = 50;
//		score[1] = 60;
//		score[2] = 70;
//		score[3] = 80;
//		score[4] = 90;
//		
//		System.out.println(score[3]);
		
		int[] iArr = {100,95,80,70,60};
//		
//		for (int i = 0; i < iArr.length; i++) {
////			System.out.println(iArr[i]);
//			System.out.println(iArr[i] + ",");
//		}
//		System.out.println();
//		System.out.println(iArr); 				// 출력 : [I@5e91993f
		
		int[] a  = new int[7];
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;
		a[4] = 50;
		
		for (int i = 0; i < a.length; i++) {
			a[i] = i + 1;
			System.out.println(a[i]);
		}
		
	}

}
