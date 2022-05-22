package programmers.level1;

import java.util.Arrays;
import java.util.Comparator;

public class 문자열_내_마음대로_정렬하기 {

	public static void main(String[] args) {

		String[] strings = { "s", "bed", "car" };
		solution(strings, 0);

	}

	public static String[] solution(String[] strings, int n) {

		Arrays.sort(strings, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {

				o1 = o1.charAt(n) + o1.substring(0);

				o2 = o2.charAt(n) + o2.substring(0);

				return o1.compareTo(o2);
			}

		}

		);

		System.out.println(Arrays.toString(strings));

		return strings;
	}

}
