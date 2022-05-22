package programmers.level2;

import java.util.ArrayList;
import java.util.List;

public class 기능개발 {

	public static void main(String[] args) {

		int[] progresses = { 95, 90, 99, 99, 80, 99 };
		int[] speeds = { 1, 1, 1, 1, 1, 1 };

		System.out.println(solution(progresses, speeds).toString());

	}

	public static List<Integer> solution(int[] progresses, int[] speeds) {

		List<Integer> q = new ArrayList<>();
		List<Integer> answer = new ArrayList<>();
		List<Integer> sp = new ArrayList<>();

		for (int i = 0; i < progresses.length; i++) {
			q.add(progresses[i]);
			sp.add(speeds[i]);
		}

		int res = 0;

		while (true) {

			for (int i = 0; i < q.size(); i++) {
				q.set(i, q.get(i) + sp.get(i));

			}

			while (q.size() > 0 && q.get(0) >= 100) {
				q.remove(0);
				sp.remove(0);
				res++;

			}

			if (res != 0) {
				answer.add(res);
			}
			res = 0;

			if (q.size() <= 0)
				break;

		}

		return answer;
	}

}
