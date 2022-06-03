package programmers.level1;

import java.util.Arrays;
import java.util.Comparator;

public class 문자열_내림차순으로_배치하기 {
	
	public static void main(String[] args) {

		System.out.println(solution("abcdEFG"));
	}

	public static String solution(String s) {
		String answer = "";
		
		String[] a = new String[s.length()];
		for(int i=0 ; i < s.length(); i++ ) {
			
			a[i] = s.charAt(i) +"";
			
		}
		
		Arrays.sort(a , new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {

				return o2.compareTo(o1);
			}
		});
		
		System.out.println(Arrays.toString(a) );
		for(int i= 0 ; i < a.length ; i++) {
			answer += a[i];
			
		}
		
		return answer;
	}
}
