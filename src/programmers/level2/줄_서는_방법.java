package programmers.level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 줄_서는_방법 {
	
	public static void main(String[] args) {
		
		int n = 3;
		int k = 5;
		
		solution(n,k);
		
	}
	
    public static int[] solution(int n, long k) {
    	 int[] answer = new int[n];
    	List<Integer> list = new ArrayList<>();
    	for(int i = 0 ; i < n ; i++) {
    		list.add(i+1);
    	}
    	
    	
    	int nn = n;
    	for(int i = 0 ; i < n-2 ; i++ ) {
    		
    		int num = (int) Math.ceil((double) k/((nn-1)*(nn-2)));
        	int a = list.remove(num-1);
        	k= k%((nn-1)*(nn-2));
        	nn--;
        	//System.out.println(a);
        
        	answer[i] = a;
    		
    	}
    	
    	if(k%2==0) {
    		answer[n-2] = list.get(1);
    		answer[n-1] = list.get(0);
    	}else {

    		answer[n-2] = list.get(0);
    		answer[n-1] = list.get(1);
    	}
    	
    	//System.out.println(Arrays.toString(answer));
    	
       
        return answer;
    }

}
