package level1;

import java.util.ArrayList;
import java.util.List;

public class 같은_숫자는_싫어 {
	public static void main(String[] args) {
		
		int[] arr = {1,1,3,3,0,1,1,1};
		
		System.out.println(solution(arr));
	}
	
    public static List<Integer> solution(int []arr) {

   
        List<Integer> answer = new ArrayList<>();
   
        answer.add(arr[0]);
        for(int i= 0 ; i < arr.length-1 ; i++) {
        	
        	if(arr[i]!=arr[i+1]) 
        		answer.add(arr[i+1]);
        	

        	
        	
        }
        

        

        return answer;
    }

}
