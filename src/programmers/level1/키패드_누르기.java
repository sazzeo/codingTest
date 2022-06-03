package programmers.level1;

import java.util.Arrays;

public class 키패드_누르기 {
	public static void main(String[] args) {

		int[] numbers = {7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2 };
		String hand = "left";
		System.out.println(solution(numbers, hand));
	

	}

	public static String solution(int[] numbers, String hand) {
		StringBuilder answer = new StringBuilder();
		int leftFinger = 10;
		int rightFinger = 12;

		for (int i = 0; i < numbers.length; i++) {
			
			int num = numbers[i];
			String finger="";
			if (num == 0) num= 11; 
			if (num == 1 || num == 4 || num == 7) {
				finger = "L";

			} else if (num == 3 || num == 6 || num == 9) {
				finger = "R";
			} else {
				int leftDistance = xy(leftFinger, num);
				int rightDistance = xy(rightFinger, num);
				if (leftDistance > rightDistance) {
					finger = "R";
				} else if (leftDistance < rightDistance) {
					finger = "L";

				} else {
					if (hand.equals("right")) {
						finger = "R";
					} else {
						finger = "L";
					}
				}
			}
			
			
			if(finger.equals("R")) {
				rightFinger = num;
			}else {
				leftFinger = num;
			}
			
			answer.append(finger);
				

		}
		
		return answer.toString();
	}

	// 두 수간의 거리 재주는 함수
	public static int xy(int num1, int num2) {

		int x = (num1 - 1) % 3 - (num2 - 1) % 3;
		int y = (num1 - 1) / 3 - (num2 - 1) / 3;

		int distance = Math.abs(x) + Math.abs(y);

		return distance;
	}

}
