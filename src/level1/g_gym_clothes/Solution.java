package level1.g_gym_clothes;

import java.util.Arrays;


public class Solution {
	
		public static void main(String[] args) {
			
			int[] lost = {1,4,5,7,10,11,14};
			int[] reserve = {1,2,6,9,5,8,12,13,14};
			Arrays.sort(lost);
			System.out.println(solution(10,lost,reserve));


			
			
		}
		
		 public static int solution(int n, int[] lost, int[] reserve) {

			   int answer = n- lost.length;
		        
		
			   //다시해야 함...
		        
		        return answer;

		        
		    }
	
		
		/*
	   public static int solution(int n, int[] lost, int[] reserve) {

		   int answer = n- lost.length;
	        
	
	        List<Integer> list = new ArrayList<>();
	        
	        for(int i =0 ; i < (lost.length ) ; i++ ) {
	        	list.add(-lost[i]);  	
	        	
	        }
	        for(int i = 0 ; i < reserve.length ; i++) {
	        	list.add(reserve[i]);
	        	
	        }
	        
	        list.sort(new Comparator<Integer>() {

				@Override
				public int compare(Integer o1, Integer o2) {
					
					o1 = o1>0 ? o1 : -o1;
					o2 = o2>0 ? o2 : -o2;
					
					return o1-o2;
				}

	        });
	        

	        System.out.println(list);
	        
	        int size = list.size();
	        int p = 0;
	        
	        while(true) {
	
	        	if(list.get(p)+list.get(p+1) ==0 || Math.abs(list.get(p)+list.get(p+1))==1) {
	        		list.remove(p); size--;
	        		list.remove(p); size--;
	        		answer++;
	        		
	        		
	        	
	        		
	        	}else {
	        		p++;
	        	}

	        	
	        	if(p==size-1) {
	        	break;
	        	}
	        	
	        }
	      
	        
 
	        System.out.println(list);
	        

	        
	        
	        
	        return answer;

	        
	    }
	    
	    */
	   
	   
	   
	   
	   
	   
}
