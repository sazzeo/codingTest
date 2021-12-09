package level2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class 오픈채팅방 {
	
	
	public static void main(String[] args) {
		
		String[] record = {"Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan","Change uid4567 Ryan1"};
		
		
		solution2(record);
		
		
		
	}
	
	
    public static String[] solution(String[] record) {
    	
    	//일단 id로 만들고, 최종 닉네임으로 갈아 끼우기

		Map<String, String> map = new HashMap<>();
		List<String> list = new ArrayList<>();
		StringBuilder sb = new StringBuilder("");
		
        for(String re : record) {
        	String[] ins = re.split(" ");
        	if(ins[0].equals("Enter")) {
        		map.put(ins[1] , ins[2]);
        		sb.append(ins[1]+"님이 들어왔습니다.@@");
        		
        	}else if(ins[0].equals("Leave")) {
        		sb.append(ins[1]+"님이 나갔습니다.@@");
        		
        	}else {
        		map.put(ins[1] , ins[2]);
        	}
        	
        }
        
        System.out.println(sb);
        System.out.println(map);
        String res=sb.toString();
        
        for(Entry<String, String> en : map.entrySet()) {
        	
        	res = res.replace(en.getKey(), en.getValue());
        }
        
        String[] arr = res.split("@@");
        
        return arr;
    }
    
    public static String[] solution2(String[] record) {
    	
    	//일단 id로 만들고, 최종 닉네임으로 갈아 끼우기
    	
    	Map<String, String> map = new HashMap<>();
    	List<String[]> list = new ArrayList<>();
    	
    	for(String re : record) {
    		String[] ins = re.split(" ");
    		if(ins[0].equals("Enter")) {
    			map.put(ins[1] , ins[2]);
    			String ar[] = {ins[0],ins[1]};
    			list.add(ar);
    			
    		}else if(ins[0].equals("Leave")) {
    			
    		}else {
    			map.put(ins[1] , ins[2]);
    		}
    		
    	}
    	
    	System.out.println(list);
    	String[] arr = {};
    	return arr;
    }

}
