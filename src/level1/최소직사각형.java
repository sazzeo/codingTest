package level1;

public class 최소직사각형 {
	
	public static void main(String[] args) {
		
		int[][] sizes = {{14, 4}, {19, 6}, {6, 16}, {18, 7}, {7, 11}}; 
		
		System.out.println(solution(sizes));
		
		
	}
	
	
    public static int solution(int[][] sizes) {
        int allMax = 0; 
        int allMin = 0;
        for(int i = 0 ; i < sizes.length ;i++) {
        	
        	int max = Math.max(sizes[i][0], sizes[i][1]);
        	int min = Math.min(sizes[i][0], sizes[i][1]);
        	if(max > allMax) allMax = max;
        	if(min > allMin) allMin = min;
        	
        }
        
        return allMax * allMin;
    }

}
