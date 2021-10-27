package level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 소수_찾기 {
	
	public static void main(String[] args) {
		소수_찾기 s = new 소수_찾기();
		
		
		s.solution("1234");
		
		
		
		
	}
	
	   
    String res="";
    List<String> list = new ArrayList<>();
    String[] arr;
    
    
    public int solution(String numbers) {
    	
    	arr = new String[numbers.length()];
    	boolean [] visited = new boolean[numbers.length()];
    	
    	for(int i = 0 ; i < visited.length ;i++) {
    		arr[i]=numbers.charAt(i)+"";
    		visited[i] = false;
    		
    	}
    	
    	System.out.println(Arrays.toString(arr));
    	
    	dfs(res.length(),2,arr.length,visited);
    	
    	

    	
        return 0;
        
        
        
    }
    
 
    
    
    //depth는 현재 숫자의 길이 pos는  자릿수 size는 넣을 숫자들 개수, visited는 방문 여부 확인용
    public void dfs(int depth , int pos , int size , boolean[] visited ) {
    	
    	if(res.length() == pos) {
    		System.out.println(res);
    		list.add(res);
    		res="";
    		return;
    	}
    	
    	for(int i= 0 ; i < size ;i++) {
    		if(!visited[i]) {
    			visited[i]=true;
    			res+=arr[i];
    			dfs(res.length(), pos, size , visited);
    			visited[i] = false;
    			
    		}
    		
    	}
    	
    	
    	
    	
    } 

}
