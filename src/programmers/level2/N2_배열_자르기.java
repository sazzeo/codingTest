package programmers.level2;

import java.util.Arrays;

public class N2_배열_자르기 {
	
	public static void main(String[] args) {
		
		int n = 4;
		long left = 7;
		long right = 14;
		
		solution(4,0,14);
		
	}

	
    public static int[] solution(int n, long left, long right) {
    	
        int[] answer = new int[(int)(right-left)+1];

		   
        for(long i=  left ; i<= right ; i++ ) {
        	
        	long row = i/n;
        	long col = i%n;
        	if(col<=row) {
        		answer[(int)(i-left)] = (int)row+1;
        		
        		
        	}else {
        		answer[(int)(i-left)] = (int)col+1;        	}
        	
        }
        

        
        
        return answer;
    }
}
