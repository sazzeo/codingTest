package level1.i_id_recommend;

public class Solution {
	
	public static void main(String[] args) {
		String new_id = "...!@BaT#*..y.abcdefghijklm";
		new_id ="z-";
		solution(new_id);
		System.out.println("솔루션: " +solution(new_id));
	

	
		
	}
	
	
	public static String solution(String new_id) {
		String[] 특문 = {"~" , "!", "@" , "#" ,"$" ,"%" ,"^", "&" , "*"
				,"(",")","=","+","[","]","{","}",":","?",",","<",">","/"};
		
		new_id = new_id.toLowerCase();
		for(int i= 0 ; i < 특문.length ; i++) {
			new_id = new_id.replace(특문[i], "");
		}
		
		while(new_id.contains("..")) {
		new_id = new_id.replace("..", ".");
		}
		
		if(new_id.startsWith(".")) {
			new_id=new_id.substring(1,new_id.length());
		}
		
		if(new_id.endsWith(".")) {
			new_id=new_id.substring(0,new_id.length()-1);
			
		}
		
		if(new_id.equals("")) {
			new_id="aaa";
		}
		if(new_id.length()>15) {
			
			new_id=new_id.substring(0,15);
			if(new_id.endsWith(".")) {
				new_id=new_id.substring(0,new_id.length()-1);
				
			}
		}
		
		while(new_id.length()<3) {
			new_id = new_id + new_id.charAt(new_id.length()-1);
			
		}

		
		

        return new_id;

	
	
	}
}
