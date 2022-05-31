package level1.b_k_number;

public class Run {

	public static void main(String[] args) {

		Solution s = new Solution();

		int[] array = { 1, 5, 2, 6, 3, 7, 4 };
		int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
		
		s.solution(array, commands);
		
		
		
		int[] array2 = {100, 45, 1, 2, 3, 43, 4, 7, 4, 32};
		
		s.solution(array2, commands);
		

	}

}
