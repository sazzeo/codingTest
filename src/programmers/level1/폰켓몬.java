package programmers.level1;

import java.util.HashSet;
import java.util.Set;

public class 폰켓몬 {
	public static void main(String[] args) {
		
		int[] nums = {3,3,3,2,2,4};
		solution(nums);
		
	}
	
    public static int solution(int[] nums ) {
       
    	Set<Integer> a = new HashSet<>();
    	
    	for(int i = 0; i < nums.length;i++) {
    		
    		a.add(nums[i]);
    	}
    	
    	System.out.println(a.size());

    	
    	return a.size()>=nums.length/2 ? nums.length/2:a.size();


    	
    }
	
	
	
}
