package level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Temp {

	public static void main(String[] args) {

		String dartResult = "000";
		int[] res = { 0, 0, 0 };
		int p = 0;

		for (int i = 0; i < dartResult.length(); i++) {

			char a = dartResult.charAt(i);
			System.out.println("a:" + a + "  p:" + p);

			if (a >= '0' && a <= '9') {
				res[p] = a - '0';

				if (a == '1' && dartResult.charAt(++i) == '0') {
					res[p] = 10;
				}

				p++;

			}

		}

		System.out.println(Arrays.toString(res));

	}

}
