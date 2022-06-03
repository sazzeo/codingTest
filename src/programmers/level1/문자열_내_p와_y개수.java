package programmers.level1;

public class 문자열_내_p와_y개수 {

	
	public static void main(String[] args) {
		System.out.println(solution("oo"));
		
		
	}

	
	static boolean solution(String s) {
		boolean answer = true;
		
		s=s.toLowerCase();
		int pCnt=0;
		int yCnt=0;
		for(int i = 0 ; i <s.length(); i++) {
			
			if(s.charAt(i)=='p') pCnt++;
			else if(s.charAt(i)=='y') yCnt++;
			
		}
		

		return answer = pCnt == yCnt ? true : false ;
	}

}
