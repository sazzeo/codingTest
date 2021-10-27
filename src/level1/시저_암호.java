package level1;

public class 시저_암호 {
	
	public static void main(String[] args) {
		
	
		String s ="abcdefghizABCZ";
		int n = 3;
		System.out.println((97+25)%26);
		System.out.println(solution(s,n));
	}

	public static String solution(String s, int n) {
        String answer = "";
        

        
        for(int i = 0 ; i < s.length() ;i++) {
        
        	char c = s.charAt(i);
        	
        	if('a'<=c && 'z'>=c) {
        		c = (char) ((c+n-19)%26+97);
        		
        	}if('A'<=c && 'Z'>=c) {

        		c=  (char) ((c+n-13)%26+65);

        	}
        	
        	answer += c;

        	
        }
        
        
        
        return answer;
    }
}
