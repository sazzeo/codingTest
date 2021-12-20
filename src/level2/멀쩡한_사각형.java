package level2;

public class 멀쩡한_사각형 {

	public static void main(String[] args) {

		int w = 8, h = 8;
		
		System.out.println(gcf(8,8));
		//System.out.println(solution(w,h));
		
	}

	public static long solution(long w, long h) {

		if(w==h) {
			return w*(w-1);
		}
		
		// 1. 최대공약수로 나눈다.

		long gcf = gcf(w,h);
		
		double max = Math.max(w/gcf,  h/gcf);
		double min = Math.min(w/gcf,  h/gcf);
		long sum = 0;
		
		int prev = -1;
		//max-1만큼 반복
		for(int i = 1 ;  i < max; i++) {
			
			int p = (int)((min/max)*i);
			
			if(prev==p) {
				sum++;
			}else {
				sum+=2;
			}
			
			prev = p;
			
			
		}
		
		return w*h-(sum*gcf);

	}

	// 최대 공약수 구하기
	public static long gcf(long a, long b) {

		long max = Math.max(a, b);
		long min = Math.min(a, b);

		while (min != 0) {

			long t = min;
			min = max % min;
			max = t;

		}

		return max;

	}

}
