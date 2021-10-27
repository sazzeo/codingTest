package level2;

import java.util.ArrayList;
import java.util.List;

public class 짝지어_제거하기 {

	public static void main(String[] args) {
		String a = "aabccbdffggd";

		System.out.println(solution(a));

	}

	public static int solution(String s) {

		List<Character> str = new ArrayList<>();
		int p = 1;
		str.add(s.charAt(0));

		for (int i = 1; i < s.length(); i++) {

			str.add(s.charAt(i));

			if (str.size() > 1) {
				if (str.get(p) == str.get(p - 1)) {
					str.remove(p);
					str.remove(p - 1);
					if (p != 1) {
						p--;
					}

				} else {
					p++;

				}
			}

		}

		return str.size() == 0 ? 1 : 0;
	}

	/*
	 * public static int solution(String s){
	 * 
	 * StringBuilder str = new StringBuilder(s);
	 * 
	 * 
	 * for(int i =0 ; i < str.length()-1 ; i++) {
	 * 
	 * if(str.charAt(i)==str.charAt(i+1)) {
	 * 
	 * str.replace(i, i+2, "");
	 * 
	 * if(i==0) i--; else i-=2; System.out.println("str: " + str +" | i: " + i );
	 * 
	 * }
	 * 
	 * 
	 * }
	 * 
	 * System.out.println(str.length());
	 * 
	 * 
	 * return str.length()==0 ? 1 : 0; }
	 */

}
