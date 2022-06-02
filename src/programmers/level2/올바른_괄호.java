package programmers.level2;

import java.util.Stack;

public class 올바른_괄호 {
	
	
	public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();
  
        
		
		String s = "(())()";
		solution(s);
		
	}
	
	static boolean solution(String s) {
		
        Stack<Integer> stack = new Stack<>();
        
        for(int i=0 ; i < s.length() ;i++) {
        	
        	if(s.charAt(i)=='(') {
        		stack.add(1);
        	}else {
        		if(stack.size()==0) return false;
        		stack.pop();
        	}
        	
        }
        
        if(stack.size()>0) return false;
        

        return true;
    }
}
