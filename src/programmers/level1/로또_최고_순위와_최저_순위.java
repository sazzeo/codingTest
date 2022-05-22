package programmers.level1;

import java.util.Arrays;

public class 로또_최고_순위와_최저_순위 {
	
	
	public static void main(String[] args) {
		int[] lottos = {44, 1, 0, 0, 31, 25};
		int[] win_nums = {31, 10, 45, 1, 6, 19};
		
		System.out.println(Arrays.toString(solution(lottos, win_nums)));

	}
    public static int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        
        Arrays.sort(lottos);
        Arrays.sort(win_nums);
        int zeroCnt = 0 ; 
        int same = 0;
        
        for(int i = 0 ; i < 6 ; i++) {
        	if(lottos[i]==0) {
        		zeroCnt++;
        		continue;
        	}
        	
        	
        	for(int j = 0 ; j < 6 ; j++) {
        		if(lottos[i] == win_nums[j]){
        			same++;
        			break;
        		}
        		
        	}
        	
        	
        }
        
        
        answer[0] = 7-(same+zeroCnt)==7 ? 6 : 7-(same+zeroCnt);
        answer[1] = (7-same) >=6 ? 6 : 7-same;
        
        return answer;
    }
	
	
	
}
