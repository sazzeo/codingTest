package programmers.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 나누어_떨어지는_숫자_배열 {
	public static void main(String[] args) {

		int[] arr = {5,9,7,10};
		int divisor = 5;

		System.out.println(solution(arr, divisor));
		
	}

	public static List<Integer> solution(int[] arr, int divisor) {

		List<Integer> answer = new ArrayList<>();
		
		Arrays.sort(arr);
		
		for(int i=0; i< arr.length;i++) {
			
			if(arr[i]%divisor==0) {
				answer.add(arr[i]);
			}

		}
		
		if(answer.size()==0) {
			answer.add(-1);
		}
		
		
		
		return answer;
	}
}
