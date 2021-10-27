package level1.d_center_string;

public class Solution {

	   public String solution(String s) {
	        String answer = "";
	        
			
			  int leng = s.length();
			  
			  
			  if (leng%2==0) {
			  
			  answer = s.substring(leng/2-1, leng/2+1);
			  
			  
			  }else {
			  
			  answer = s.substring(leng/2,leng/2+1);
			  
			  }
			
	        

	        
	        
	        return answer;
	    }
	
	   
	   //다른 사람 답: 한줄로 처리
	   public String solution2(String word) {
	
	        
	        return word.substring((word.length()-1) / 2, word.length()/2 + 1);
	    }
	
	
	
}
