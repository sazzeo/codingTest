package level1;



public class 다트_게임 {

	public static void main(String[] args) {

		System.out.println(solution("1S2D*3T"));
	}

	public static int solution(String dartResult) {

		int[] res = { 0, 0, 0 };
		int p = 0; // 점수 포인터

		for (int i = 0; i < dartResult.length(); i++) {

			char a = dartResult.charAt(i);

			if (a >= '0' && a <= '9') {
				res[p] = a - '0';

				if (a == '1' && dartResult.charAt(++i) == '0') {
					res[p] = 10;
				}
				p++;
			}

			switch (a) {

			case 'D':
				res[p - 1] *= res[p - 1];
				break;

			case 'T':
				res[p - 1] *= (res[p - 1] * res[p - 1]);
				break;
			case '*':
				res[p - 1] *= 2;
				if ((p) != 1) {
					res[p - 2] *= 2;
				}
				break;
			case '#':
				res[p - 1] *= -1;
				break;
			}

		}

		return (res[0] + res[1] + res[2]);

	}

}
