package level2;

public class 문자열_압축 {
	
	public static void main(String[] args) {
		
		String s = "aabbaccc";
		solution(s);
		
	}

    public static int solution(String s) {
        int answer = 0;
        for(int i = 2; i<=s.length();i++) {
        	
        	s.split(s, i);
        	
        	
        }
        
        
        
        
        
        System.out.println(answer);
        return answer;
    }
	
	
}
