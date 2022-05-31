package programmers.level2;



public class 프린터 {

	public static void main(String[] args) {

		int[] pri = {1,1,9,1,1,1};
		int lo = 0;
		
		System.out.println(solution(pri, lo));
		
	}

	public static int solution(int[] priorities, int location) {

	
		int order = 0;
		for(int i=0; i<priorities.length ;i++) {

			if(priorities[i]> priorities[location]) {
				order++;
			}
			
			
			
			if(priorities[i]==priorities[location]) {
				if(i>location) order++;
				if(i<location) order--;
			}
			
		}
		
		

		return ++order;
	}

}
