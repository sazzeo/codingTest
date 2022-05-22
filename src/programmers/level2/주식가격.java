package programmers.level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 주식가격 {

	public static void main(String[] args) {

		int[] prices = { 1, 2, 3, 2, 3 };

		System.out.println(Arrays.toString(solution(prices)));

	}

	public static int[] solution(int[] prices) {
		int[] answer = new int[prices.length];

		List<Integer> list = new ArrayList<Integer>();
		int p = 0;
		int idx = 1;
		list.add(prices[0]);

			while(list.size()>0) {

				if (list.get(0) <= prices[idx]) {
					list.add(prices[idx]);
					idx++;
					p++;
				}if(idx>=prices.length) {
					idx=1;
				//	list.remove(i)
				}
				
				
				System.out.println(list.toString());
				

			}
	

		return answer;
	}

}
