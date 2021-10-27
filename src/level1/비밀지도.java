package level1;

import java.util.Arrays;

public class 비밀지도 {
	
	public static void main(String[] args) {
		int[] arr1 = {9, 20, 28, 18, 11};
		int[] arr2= {30, 1, 21, 17, 28};
		
		
		int a = 20;
		String str = "";
		
		while(a>0) {
			str += (a%2);
			a/=2;
		}

		System.out.println(str);
		
		
		solution(5, arr1, arr2);
		
		
	}
	
    public static StringBuilder[] solution(int n, int[] arr1, int[] arr2) {
    	
        StringBuilder[] str = new StringBuilder[n];

        for(int i = 0 ; i < n ; i++) {
        	int a = (arr1[i]|arr2[i])+ (int)Math.pow(2, n);
        	str[i] = new StringBuilder();
        	while(a>1) {
    			str[i].append(a%2==1 ? "#" : " ");
    			a/=2;
        		
        	}
        	str[i].reverse();
        	
  
        }
              
        System.out.println(Arrays.toString(str));
          
        
        return str;
    }

}
