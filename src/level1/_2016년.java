package level1;

public class _2016년 {
	public static void main(String[] args) {
		System.out.println(solution(5,24));

		
	}
	
    public static String solution(int a, int b) {
    	
    	
    	String[] day = {"THU","FRI","SAT","SUN","MON","TUE","WED"};
    	int[] month = {0,31,29,31,30,31,30,31,31,30,31,30};
    	
    	int d=b;
    	for(int i = 0 ; i<a;i++) {
    		d+= month[i];
    	}

        return day[d%7];
    }
    
    
	

}
