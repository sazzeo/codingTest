package level1.z_simple;

public class simple_example {

	public static void main(String[] args) {

		
		
		
	}

	// 핸드폰 번호 가리기
	public static String solution1(String phone_number) {

		int leng = phone_number.length();
		String star = "";
		for (int i = 0; i < leng - 4; i++) {
			star += "*";

		}

		return phone_number.replace(phone_number.substring(0, leng - 4), star);

	}

	// x만큼 간격이 있는 n개의 숫자
	public static long[] solution2(int x, int n) {
		long[] answer = new long[n];
		long res = x;
		for (int i = 0; i < n; i++) {

			answer[i] = res;

			res += x;

		}

		return answer;
	}

	// 자연수 뒤집어 배열로 만들기

	public int[] solution3(long n) {

		String str = String.valueOf(n);

		int[] answer = new int[str.length()];

		for (int i = 0; i < str.length(); i++) {

			answer[str.length() - 1 - i] = Integer.parseInt(str.substring(i, i + 1));

		}

		return answer;

	}
	
	
	//음양 더하기
	
	  public int solution4(int[] absolutes, boolean[] signs) {
	        int answer = 0;
	        
	        for(int i=0;  i<absolutes.length ; i++) {
	        	if(signs[i]) {
	        		answer+=absolutes[i];
	        	}else {
	        		answer-=absolutes[i];
	        	}
	        }

	        return answer;
	    }
	
	

}
