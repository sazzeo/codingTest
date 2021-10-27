package level1.b_k_number;

import java.util.Arrays;

public class Solution {
	
	
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        
        for(int i = 0 ; i < commands.length ; i++ ) {
        	
        	
        	
        	int startIdx = commands[i][0]-1;
        	int leng = commands[i][1]-startIdx;
        	int findIdx =commands[i][2]-1;
        	int arr[] = new int[leng];
        	
        	for(int j = 0 ; j < leng ; j++ ) {
        		
        		arr[j] = array[startIdx++];
        		
        		
        	}
        	
        	for(int j = 0 ; j < arr.length-1 ; j++) {
        		for(int k=0 ; k < arr.length-1-j ; k++) {		
        			if(arr[k] > arr[k+1]) {
        				int t = arr[k];
        				arr[k] = arr[k+1];
        				arr[k+1] = t;
       		
        			}
        		}
        		
        	}
        	
        	answer[i] = arr[findIdx];

        	
        	
        	System.out.println(Arrays.toString(arr));
        	System.out.println(answer[i]);
        	
        }
        
        
        
        
        

        
        
        
        return answer;
        
        
    }
    
    
    
}
