package level1;

import java.util.ArrayList;
import java.util.List;

public class 제일_작은_수_제거하기 {
	  
	
	
    public static List<Integer> solution2(int[] arr) {

    	List<Integer> list = new ArrayList<>();
    	
    	if(arr.length <2) {
    		list.add(-1);
    		return list;
    	}
    	
    	
    	int min = arr[0];
    	list.add(arr[0]);
    	System.out.println("");
    	for(int i = 1 ; i < arr.length; i++) {
    		list.add(arr[i]);
    		if(min>arr[i]) {
    			min = arr[i];
    		}
    	}
    	
    	System.out.println(min);
    	for(int i = 0 ; i < list.size();i++) {
    		
    		if(list.get(i) == min) {
    			list.remove(i);
    			break;
    		}
    		
    	}
    	
    	
    	
    	return list;
    	
        
    }
}
