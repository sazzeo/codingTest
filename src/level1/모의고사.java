package level1;

import java.util.ArrayList;

import java.util.List;


public class 모의고사 {

	public static void main(String[] args) {
		
		int[] answers = {1,2,3,4,5,1,2,3,4,5};
		
		System.out.println(solution(answers));
		
		
		
	}

	public static List<Integer> solution(int[] answers) {
		
		List<Integer> answer = new ArrayList<>(); 
		
		int[] supo = {0,0,0};

		
		int[] arr2 = {2,1,2,3,2,4,2,5};
		int[] arr3 = {3,3,1,1,2,2,4,4,5,5};

		for(int i = 0 ; i<answers.length ; i++ ) {
			if(i%5+1 == answers[i]) supo[0]++;
			if(arr2[i%8] == answers[i]) supo[1]++;
			if(arr3[i%10] == answers[i]) supo[2]++;

		}


		int maxScore = Math.max(Math.max(supo[0], supo[1]),supo[2]);
		
		
		System.out.println(maxScore);
		

		
		for(int i = 0 ; i < 3 ; i++) {
			if(supo[i] == maxScore) answer.add(i+1);
		}

		
		
		
		
		return answer;


		
	}

}
