package level1;

import java.util.Arrays;

public class 행렬의_덧셈 {
	
	public static void main(String[] args) {
		
		int[][] arr1 = {{1,2},{2,3}};
		int[][] arr2=  {{3,4},{7,9}};
		
		
		solution(arr1, arr2);
		
		
		
		
	}
	
    public static int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr1[0].length];
        
        for(int i =0; i<arr1.length; i++) {
        	for(int j =0; j<arr1[i].length; j++) {
        		
        		answer[i][j]=arr1[i][j]+arr2[i][j];
        		
        		
        	}
        	
        	
        }
        
        
        
        for(int i = 0 ; i< answer.length;i++) {
        System.out.println(Arrays.toString(answer[i]));
        }
        return answer;
    }
	
	

}
