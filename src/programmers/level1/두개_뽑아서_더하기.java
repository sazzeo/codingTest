package programmers.level1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class 두개_뽑아서_더하기 {
	
	
	public static void main(String[] args) {
		int[] numbers = { 2, 1, 3, 4, 1 };

		solution(numbers);

	}

	
	
	public static Integer[] solution(int[] numbers) {
		
		Integer[] answer=null;

		Set<Integer> arr = new HashSet<>();

		for(int i = 0 ; i < numbers.length-1; i++) {
			for(int j = i+1 ; j < numbers.length ; j++) {
				int sum = numbers[i] + numbers[j];
				arr.add(sum);
			}
		}
		
		answer =  arr.toArray(new Integer[0]);
				
		Arrays.sort(answer);
		System.out.println(Arrays.toString(answer));
		
		return answer;

	}
	
	

}
