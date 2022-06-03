package programmers.level1;

public class 부족한_금액_계산하기 {

	public static void main(String[] args) {

		
		System.out.println(solution2(3,40,4));
		System.out.println(solution2(2500,10000,2500));
		System.out.println(solution(2500,10000,2500));
		
		
		
	}

	public static long solution(int price, int money, int count) {

		long sum = 0;
		for (int i = 1; i <= count; i++) {
			sum += price*i;

		}

		return sum-money <=0 ? 0 : sum-money;
	}
	
	
	//등차수열의 합으로 풀어보기
	public static long solution2(int price, int money, int count) {
		
		long res = (1+count)  * count/2 ;
		res*=price;
		
		return res <=0 ? 0 : res;
	}

}
