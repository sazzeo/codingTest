package programmers.level2;

public class 일이사_나라의_숫자 {

	public static void main(String[] args) {

		int n = 21;
		solution(n);

	}


	// 3진수로 변환 : 해당숫자에 0이 있으면 위 10을 아래 4로 변환 =>0이 없어질떄까지 반복
	public static String solution(int n) {

		StringBuilder res = new StringBuilder("");
		while (n != 0) {
			res.append(n % 3);
			n /= 3;
		}
		String num = res.reverse().toString();

		while (num.contains("0")) {

			if (num.contains("40")) {
				num = num.replace("40", "24");
			}
			if (num.contains("20")) {
				num = num.replace("20", "14");
			}
			if (num.contains("10")) {
				num = num.replace("10", "04");
			}
			if (num.charAt(0) == '0') {
				num = num.substring(1);
			}


		}

		return num;
	}

}
