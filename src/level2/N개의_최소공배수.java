package level2;


public class N개의_최소공배수 {
	
	public static void main(String[] args) {
		

		N개의_최소공배수 n = new N개의_최소공배수();
		int[] arr = {2,6,8,14};
		System.out.println(n.solution(arr));
		

	}
	
	
	
	
	
    public int solution(int[] arr) {
    	

    	int pre = arr[0];
  
    	for(int i = 1 ; i <arr.length ; i++) {
    		
    		pre = gcd(pre,arr[i]);

    	}
    	
    	
    	
    	return pre;

    }
    
    
    //최소 공배수 구하기
    public int gcd(int a , int b) {
    	if(a<b) {
    		int t = a;
    		a= b;
    		b= t;
    	}
       	int a1 = a;
    	int b1 = b;
    	
    	while(a%b!=0) {
    		int t=a;
    		a=b;
    		b=t%b;
    	}

    	return a1*b1/b;
    }

}
