package level2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class 전화번호_목록 {
	
	public static void main(String[] args) {
		
		
		String[] phone_book = {"119","1195524421", "97674223"};
		
		System.out.println(solution(phone_book));
		
	}
	
    public static boolean solution(String[] phone_book) {
    	
        boolean answer = true;
        Map<String, Object> map = new HashMap<>();
        Arrays.sort(phone_book , new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				
				
				return o1.length()-o2.length();
			}
		});
        
        
       //짧은애부터 정렬
        System.out.println(Arrays.toString(phone_book));
        
        for(String s : phone_book) {
        	
        	for(int i=0 ; i < s.length();i++) {
        		
        		String num = s.substring(i , i+1);
        		
        		
        	//	map.put(s, value)
        		
        		
        		
        		
        		
        	}
        	
        	
        	
        }
        
        
        
        
        
        return answer;
    }

}
