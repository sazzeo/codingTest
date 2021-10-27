package level2;

import java.util.ArrayList;
import java.util.List;

public class 수식_최대화 {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3 };

		for (int i = 0; i < arr.length; i++) {

		}

		String ex = "100-200*300-500+20";

		System.out.println(solution(ex));

	}

	public static long solution(String expression) {

		List<String> list = new ArrayList<>();

		String[] oper = { "+", "-", "*" };
		int[][] order = { { 0, 1, 2 }, { 0, 2, 1 }, { 1, 0, 2 }, 
						{ 1, 2, 0 }, { 2, 0, 1 }, { 2, 1, 0 } };

		int s = 0;
		int f = 1;
		for (int i = 0; i < expression.length(); i++) {
			char p = expression.charAt(i);
			if (p == '*' || p == '-' || p == '+') {
				f = i;
				list.add(expression.substring(s, f));
				s = f + 1;
				list.add(p + "");
			}
		}

		list.add(expression.substring(s));

		long max = 0;

		for (int i = 0; i < order.length; i++) {
			List<String> copyList = new ArrayList<>(list);

			for (int j = 0; j < oper.length; j++) {
				cal(copyList, oper[order[i][j]]);
			}

			if (max < Math.abs(Long.parseLong(copyList.get(0)))) {
				max = Math.abs(Long.parseLong(copyList.get(0)));

			}

		}

		return max;
	}

	public static void cal(List<String> list, String oper) {

		for (int i = 0; i < list.size(); i++) {

			if (list.get(i).equals(oper)) {
				switch (oper) {
				case "*":

					list.set(i, String.valueOf(Long.parseLong(list.get(i - 1)) 
							* Long.parseLong(list.get(i + 1))));

					break;
				case "-":

					list.set(i, String.valueOf(Long.parseLong(list.get(i - 1)) 
							- Long.parseLong(list.get(i + 1))));

					break;
				case "+":

					list.set(i, String.valueOf(Long.parseLong(list.get(i - 1)) 
							+ Long.parseLong(list.get(i + 1))));

					break;

				}
				list.remove(i + 1);
				list.remove(i - 1);
				i--;
			}

		}

	}

}
