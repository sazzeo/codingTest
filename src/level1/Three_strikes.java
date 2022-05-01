package level1;

public class Three_strikes {

	public static void main(String[] args) {
		
		System.out.println(solution(125));

		//3진법으로 변환해주기..와우
		System.out.println(Integer.parseInt("22111",3));
		
		
	}
	
	
	public static int solution(int n) {

        String num="";
        
		while( (n) >= 3) {
			
			num += (n%3); 
			n/=3;
			
		}
		num+=n;
		int res = 0;
		
		for(int i = 0 ; i < num.length(); i++) {
			
			res +=Integer.parseInt(num.substring(i,i+1)) * (int) Math.pow(3, num.length()-1-i);

			
			
		}
		
        return res;

	
	}
	
	
	
	
	
	

}
