package level1;

public class 나머지가_1이_되는_수_찾기 {

	public static void main(String[] args) {
		
		
		System.out.println(solution(30));
		

	}

	public static int solution(int n) {
		n--;

		int i;
		for (i = 2; i * i <= n; i++) {
			if (n % i == 0)
				return i;
		}

		// 만약 소수면?

		return n;
	}

}
