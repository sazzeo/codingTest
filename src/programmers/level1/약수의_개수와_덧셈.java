package programmers.level1;

public class 약수의_개수와_덧셈 {
	public static void main(String[] args) {

		System.out.println(solution(16,17));
		
		
	}

	public static int solution(int left, int right) {
		int answer = 0;
		
 		for(int i = (int) Math.ceil(Math.sqrt(left)) ; i <= Math.sqrt(right) ;i++) {
 			answer -= i*i*2;
 		}
		

		for(int i = left ; i <=right ; i++) {

			answer+=i;
			
			
		}
		
		
		return answer;
	}

}
