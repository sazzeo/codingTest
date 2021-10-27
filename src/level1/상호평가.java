package level1;

import java.util.Arrays;

public class 상호평가 {

	public static void main(String[] args) {
		int[][] scores = { { 100, 90, 98, 88, 65 }, { 50, 45, 99, 85, 77 }, { 47, 88, 95, 80, 67 },
				{ 61, 57, 100, 80, 65 }, { 24, 90, 94, 75, 65 } };

		solution(scores);
	}

	public static String solution(int[][] scores) {

		StringBuilder res = new StringBuilder("");
		for (int i = 0; i < scores.length; i++) {

			int[] arr = new int[scores.length];
			int selfScore = scores[i][i];

			int sum = 0;
			for (int j = 0; j < scores.length; j++) {

				arr[j] = scores[j][i];
				sum += arr[j];
			}

			boolean self = false;
			Arrays.sort(arr);
			if ((arr[0] == selfScore && arr[1] != selfScore)
					|| (arr[arr.length - 1] == selfScore && arr[arr.length - 2] != selfScore)) {
				self = true;

			}

			if (self) {
				sum -= selfScore;
				sum /= (arr.length - 1);

			} else {
				sum /= arr.length;

			}

			if (sum >= 90) {
				res.append("A");
			} else if (sum >= 80) {
				res.append("B");
			} else if (sum >= 70) {
				res.append("C");
			} else if (sum >= 50) {
				res.append("D");
			} else {
				res.append("F");
			}

		}

		return res.toString();

	}

}
