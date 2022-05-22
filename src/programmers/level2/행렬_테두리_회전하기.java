package programmers.level2;

import java.util.HashMap;
import java.util.Map;

public class 행렬_테두리_회전하기 {

	public static void main(String[] args) {
		int rows =6;
		int columns =6;
		int[][] queries = {{2,2,5,4},{3,3,6,6},{5,1,6,3}};
		solution(rows, columns , queries);
		
		
	}
	
	
	
    public static int[] solution(int rows, int columns, int[][] queries) {
       
    	int[] answer = {};
    	Map<Integer , Integer> map = new HashMap<>();
    	
    	for(int i = 1 ; i <= rows; i++) {
    		
    		for(int j=1 ; j <=columns;j++) {
    			map.put( ((i-1)*columns+j), i*1+j);
    		}

    	}
    	
    	for(int[] query : queries) {
    		
    		
    		
    	}
    	
    	
    	
    	System.out.println(map);
        
        
        return answer;
    }
	
	
	
}
