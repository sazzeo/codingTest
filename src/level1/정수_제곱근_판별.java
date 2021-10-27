package level1;



public class 정수_제곱근_판별 {
	
	
	public static void main(String[] args) {
		
		System.out.println(solution(121));

	
	}
    public static long solution(long n) {
    	
        if(n%Math.sqrt(n)==0) {
        	return (long)(Math.sqrt(n)+1) * (long)(Math.sqrt(n)+1);
        }else return -1;
        
        
        

    }
  

}
