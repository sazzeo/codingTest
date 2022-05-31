package programmers.level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JadenCase_문자열_만들기 {

	public static void main(String[] args) {

		String s = "people  unFollowed 3unFollowedme   unFollowed     me";
		s = solution2(s);
		System.out.println(s);
	}
	
	
	//내코드
	public static String solution(String s) {
		StringBuilder res = new StringBuilder(""); 
		s = " " + s + " ";
		int blank = 1;
		int before=0;
		while(true) {

			int present = s.indexOf(" " , before+1);
			if(before==-1)break;
			if(before+1 ==present) {
				blank++; 
			}else {
				res.append(" ".repeat(blank));
				if(present==-1)break;
				String newStr = s.substring(before+1, before+2).toUpperCase() +
						s.substring(before+2 , present).toLowerCase();
				
				res.append(newStr);
				blank = 1;
			}
			
			before = present;
		}
		
		
		return res.toString().substring(1 , res.length()-1);
	}
	
	
	//다른사람 코드
	public static String solution2(String s) {
		   String answer = "";
	        String[] sp = s.toLowerCase().split("");
	        boolean flag = true;
	        System.out.println(Arrays.toString(sp));
	        for(String ss : sp) {
	            answer += flag ? ss.toUpperCase() : ss;
	            flag = ss.equals(" ") ? true : false;
	        }
	        
	        return answer;
	
	}

}
