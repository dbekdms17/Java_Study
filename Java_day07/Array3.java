package day7;

import java.util.Arrays;

public class Array3 {

	public static void main(String[] args) {
		// 섞기
		int[] numArr = {0,1,2,3,4,5,6,7,8,9};
		System.out.println(Arrays.toString(numArr));
		
		for(int i = 0; i < numArr.length; i++) {	// 100번 두 요소 값 바꾸기
			int n = (int)(Math.random() * 10); // 0~9중의 한값을 받는다.
			int tmp = numArr[i];	// numArr 첫번째 값을 tmp라는 빈칸에 넣고
			numArr[i] = numArr[n];	// numArr 무작의 값을 [i]에 넣고
			numArr[n] = tmp;		// tmp에 넣었던 첫번째 값을 [n]에 넣어줌
		}
		System.out.println(Arrays.toString(numArr));
		// 위 for문에서 numArr.length를 사용해서
		// 배열의 길이만큼만 돌림
		// 여기서는 10번 돌아가는데 numArr[i]는 처음에는 첫번째 값
		// 그다음은 두번째값에 numArr[n] 무작의 값이 저장되는데 그것이 10번 반복
		
		
		
	}

}
