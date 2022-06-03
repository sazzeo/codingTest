package programmers.level1;

public class 수박수박수박수 {
	public static void main(String[] args) {

		System.out.println(solution(5));
		char[] a = new char[3];
		for(int i = 0 ; i < a.length ;i++) {
			a[i] = 'A';
		}
		String str = new String(a);
		System.out.println(str);
		System.out.println("\0");
		//System.out.println(str.replace("", "수박"));

	}

	public static String solution(int n) {
		StringBuilder res = new StringBuilder();
		
		
		for(int i=0; i < n ; i++) {
			if(i%2 == 0) res.append("수");
			else res.append("박"); 
			
			
		}
		
		
		
		String answer = new String(res);
		return answer;
	}

}
