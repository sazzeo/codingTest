package level1.c_dont_finish;

import java.util.Arrays;

public class Solution {
	
	
	
	//이중 포문 = > 실행 횟수초과...
	 public String solution(String[] participant, String[] completion) {
	        String answer = "";
	        
	        int pFirst=0;
	        int cFirst=0;
	        

	        for(int i = 0 ; i < participant.length ; i++) {
	        	

		        System.out.println(Arrays.toString(participant));
		        System.out.println(Arrays.toString(completion));
		        System.out.println();
	        	
		        int j ;
	        	for(j=cFirst ; j <completion.length ; j++ ) {
	        		
	        		if(participant[i].equals(completion[j])) {
	        			
	        			participant[pFirst++]="";
	        			
	        			completion[j] = completion[cFirst];
	        			completion[cFirst++] = "";
	        			
	        			break;

	        		}
	        		
	        		if(j==completion.length-1) {
	        			answer = participant[i];
	        	        return  answer;

	        		}
	        		
	        		
	        		
	        		
	        		
	        	}
	        	
	        	
	        	
	        	
	        }
	        
	        
	        
	        
	        return answer;
	        
	    }
	 
	 
	 //정렬후 1중 포문= > 성공
	 public String solution2(String[] participant, String[] completion) {
		 	String answer = "";

	        Arrays.sort(participant);
	        Arrays.sort(completion);
	       
	        System.out.println(Arrays.toString(participant));
	        System.out.println(Arrays.toString(completion));
	  
	        
	        for(int i = 0 ; i < completion.length ; i++ ) {
	        	if (!participant[i].equals(completion[i])) {
	        		
	        		answer = participant[i];
	        		break;
	        		
	        	}	        	
	        }
	        
	        if(answer =="") {
	        	return participant[participant.length-1];
	        }else {
	        
	        return answer;
	        }
	 }
}
