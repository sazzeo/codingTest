package level1.e_collatz;

public class Solution {
	
	public static void main(String[] args) {
		
		Solution s = new Solution();
		System.out.println(s.solution(6));
	
		
	}
	
	
	
	
	//3차만에 성공 
	//1차 : 오버플로우 고려안함
	//2차 : 1일때 값을 고려 안함
	   public int solution(long num) {
	       
		   
		   for(int i = 0; i<500 ; i++) {

			   if(num==1) return i;
			   num = num%2==0 ? num/2 : num*3+1;

			   
		   }

		   return -1;
		   
	    }
	
	   
	   

}
