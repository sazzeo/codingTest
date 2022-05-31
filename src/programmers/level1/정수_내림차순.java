package programmers.level1;

import java.util.Arrays;

public class 정수_내림차순 {
	
	public static void main(String[] args) {
		System.out.println(solution(118372));
		Integer.toString(12345).chars();

	}
	
    public static long solution(long n) {

        
        char[] charArr = (n+"").toCharArray();
        Arrays.sort(charArr);
        StringBuilder sb = new StringBuilder(new String(charArr));
        sb.reverse();
        return Long.parseLong(new String(sb));
        
    }

}
