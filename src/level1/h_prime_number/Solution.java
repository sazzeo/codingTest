package level1.h_prime_number;

public class Solution {

	public static void main(String[] args) {
		int[] nums = { 1, 2, 7, 6, 4 };

		System.out.println(solution(nums));
		
		
		System.out.println("소수판별기");
		
		int num = 11;
		int j ;
		for(j = 2 ; j*j <num ; j++ ) {
				
			if(num%j ==0) {
				System.out.println("소수가 아닙니다.");
				break;
			}	
			
		}
		if(j*j>num) {
			System.out.println("소수입니다.");
		}
		
		
			
			
		
		
		
		
	}

	public static int solution(int[] nums) {
		
		int cnt = 0;
		for(int i = 0 ; i < nums.length-2 ;i++ ) {
			
			for(int j=i+1 ; j < nums.length-1; j++) {
				
				for(int k=j+1 ; k <nums.length;  k++) {
					int sum = nums[i] + nums[j] + nums[k];
					System.out.print(sum + " : ");
					int l=2;
					for(l = 2 ; l*l <=sum ; l++ ) {
						
						if(sum%l ==0) {
							System.out.println("소수가 아닙니다.");
							break;
						}	
						
					}
					if(l*l > sum) {
						cnt++;
						System.out.println("소수입니다.");
					}
					
					
					
				}
				
				
			}
			
			
		}
		
		
		return cnt;

	}

	/*
	 * public static int solution(int[] nums) { int answer = -1;
	 * 
	 * int n = nums.length; //서로 다른 수 3개를 고르는 함수 int c = n*(n-1)*(n-2)/3/2; //콤비네이션c
	 * System.out.println(c); int p1 = 0; //포인터1 int p2 = 1; //포인터2 int p3 = 2;
	 * //포인터3
	 * 
	 * int sp1 =0; int sp2 = 1; int sp3 =2; for(int i = 0 ; i < c ; i++) {
	 * 
	 * System.out.println("[p1]" + p1 + " [p2]"+p2 + " [p3]" + p3); int sum =
	 * nums[p1] + nums[p2] + nums[p3];
	 * 
	 * p3++;
	 * 
	 * if(p3 == n) { if(sp3 ==n-1) sp3=n-1; else sp3 = sp3+1; p3 = sp3; p2++;
	 * 
	 * }
	 * 
	 * if(p2 == n-1) { p2 = ++sp2; p1++; }
	 * 
	 * 
	 * 
	 * 
	 * }
	 * 
	 * 
	 * 
	 * 
	 * return answer; }
	 */

}
