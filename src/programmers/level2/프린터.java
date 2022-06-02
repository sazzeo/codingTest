package programmers.level2;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class 프린터 {

	public static void main(String[] args) {

		// q에 먼저
		int[] pri = { 1, 1, 9, 9, 1};
		int lo = 0;
		System.out.println(solution(pri, lo));

	}

	public static int solution(int[] priorities, int location) {
		
		Queue<Integer> q = new PriorityQueue<>(Comparator.reverseOrder());
		for (int n : priorities) {
			q.add(n);
		}
		
		int answer = 0;
		while (!q.isEmpty()) {
			
			// 현재 배열을 순회해서 큐에 가장 큰수랑 일치하는 경우 poll
			// 이때 배열의 index값이 location의 값과 일치하면
			// 현재까지 poll된 애들 개수를 반환한다.
	

			for (int i = 0; i < priorities.length; i++) {
				int max = q.peek();
				if (priorities[i] == max) {
					if (i == location) {
						answer++;
						return answer;
					}
					q.poll();
					answer++;
				}
			}

		}

		return answer;
	}

}
