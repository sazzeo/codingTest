package programmers.level2;

public class N진수_게임 {
	public static void main(String[] args) {

		int n = 16;
		int t = 16;
		int m = 2;
		int p = 1;

		solution(n, t, m, p);

	}

	public static String solution(int n, int t, int m, int p) {

		// 숫자 구하기
		int cadi = 1;

		StringBuffer resStr = new StringBuffer("0");

		while (resStr.length() <= m*t+p) {
			StringBuffer s = new StringBuffer("");
			int number = cadi++;
			while (number > 0) {
				
				String num= Integer.toString(number % n);
				switch(num) {
				case "10" : num = "A"; break;
				case "11" : num ="B"; break;
				case "12" : num ="C"; break;
				case "13" : num ="D"; break;
				case "14" : num ="E"; break;
				case "15" : num ="F"; break;
				}
				
				s.append(num);
				
				
				number /= n;
			}
			resStr.append(s.reverse());
			
		}
		
		//System.out.println(resStr);
		
		StringBuffer answer = new StringBuffer("");
		
		for(int i=0 ; i < t ; i++) {
			
			answer.append(resStr.charAt(i*m + (p-1)));
			
		}
		
		//System.out.println(answer);

		return answer.toString();
	}
}
