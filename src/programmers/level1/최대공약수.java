package programmers.level1;

public class 최대공약수 {
	public static void main(String[] args) {
		
		solution(45,25);
		
		
	}
	
	
    public static int[] solution(int n, int m) {
        int[] answer = new int[2];
        
        int a = Math.max(n, m);
        int b = Math.min(n, m);
        
        while(b!=0) {
        	int temp = a;
        	a= b;
        	b= temp % a;
        	
        }
        answer[0] = a;
        answer[1] = n*m/a;
        
        
        
        return answer;
    }

}
