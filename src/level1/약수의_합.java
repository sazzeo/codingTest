package level1;

public class 약수의_합 {

	public static void main(String[] args) {
		System.out.println(solution(25));
		
	}

	
	public static int solution(int n) {
		int answer = 0;
		
		for(int i = 1 ; i*i <= n ; i++) {
			if(n%i==0) {
				answer+=i;
				if(n/i!=i) answer+=n/i;
				
			
			}
			
		}
		
		
		return answer;
		
		
	}

}
