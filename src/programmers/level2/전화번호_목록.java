package programmers.level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class 전화번호_목록 {
	
	public static void main(String[] args) {
		
		System.out.println("안녕".startsWith("안"));
		
		String[] phone_book = {"119", "97674223", "1195524421"};
		
		solution(phone_book);
		
	}
	
	//타임아웃........
    public static boolean solution(String[] phone_book) {
    	
    	//1번조건 : 1~9 시작하는 수로 나눈다. => map으로
    	//2번조건 : 자릿수(1~20)으로 나눈다. => list로 
    	
    	Map<Integer , Map<Integer,List<String>>> hashMap = new HashMap<>();
    	
    	for(int i = 1; i<=9 ; i++) {
    		Map<Integer , List<String>> lengthMap = new HashMap<>();
    		for(int j=1; j<=20; j++) {
    			lengthMap.put(j, new ArrayList<String>() );
    		}
    		hashMap.put(i,lengthMap );
    		
    	}

    	for(String phone:phone_book) {
    		int first = phone.charAt(0)-'0';
    		int length = phone.length();
    		Map<Integer , List<String>> thisMap = hashMap.get(first);
    		
    		for(int i=1 ; i < length  ; i++) {
    			for( String a : thisMap.get(i)) {
    				if(phone.startsWith(a)) return false;
    			}
    		}
    		for(int i=length+1 ; i <=20  ; i++) {
    			for( String a : thisMap.get(i)) {
    				if(a.startsWith(phone)) return false;
    			}
    		}
    		
    		hashMap.get(first).get(length).add(phone);
    		
    		
    	}
        
        
        return true;
    }
    
    
    //통과
    public static boolean solution2(String[] phone_book) {
    	
    	Arrays.sort(phone_book);
    	
    	for(int i=0; i < phone_book.length-1 ; i++) {
    		if(phone_book[i+1].startsWith(phone_book[i])) return false;
    	}
    	
    	
    	return true;
    }

}
