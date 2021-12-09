package level1;

import java.util.Arrays;

public class 없는_숫자_더하기 {
	
	public static void main(String[] args) {
		
		int[] numbers= {5,8,4,0,6};
		System.out.println(solution(numbers));
		
		
	}
	
	
	
    public static int solution(int[] numbers) {
    	
    	int sum=0;
    	 for(int i = 0  ; i < numbers.length; i++) {
    		 sum +=numbers[i];
   
    	 }
    	 
    	 return 45-sum;
    }
    
    
	

}
