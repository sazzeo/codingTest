package programmers.level2;

import java.util.PriorityQueue;
import java.util.Queue;

public class 더_맵게 {

	public static void main(String[] args) {

		int[] scoville = { 0, 2, 3, 9, 10, 12 };
		int k = 4;
		System.out.println(solution(scoville, k));

	}

	public static int solution(int[] scoville, int K) {

		Queue<Integer> q = new PriorityQueue<>();

		for (int i = 0; i < scoville.length; i++) {

			q.offer(scoville[i]);

		}

		int i = 0;
		int k;
		for (i = 0; i < scoville.length - 1; i++) {

			k = q.poll() + q.poll() * 2;
			q.offer(k);
			System.out.println(q.toString() + " " + k);

			if (q.peek()>=K)
				break;

		}

		if (i == scoville.length - 1)
			return -1;

		return i + 1;
	}
	
	
	

	/*
	 * public static int solution(int[] scoville, int K) {
	 * 
	 * Arrays.sort(scoville); Queue<Integer> q = new PriorityQueue<>(); int s = 0;
	 * int cnt = 0; for (int i = 0, j = 0; i < scoville.length - 1; i++, j += 2) {
	 * cnt++; if (j < scoville.length - 1) { q.offer(scoville[j]);
	 * q.offer(scoville[j + 1]); } s = q.poll() + q.poll() * 2;
	 * 
	 * System.out.println(q.toString() + " " + s);
	 * 
	 * if (!q.isEmpty() && q.peek() >= K) { System.out.println(s + " > " + K);
	 * break; }
	 * 
	 * q.offer(s);
	 * 
	 * }
	 * 
	 * if (q.isEmpty()) return -1;
	 * 
	 * return cnt; }
	 */

}
