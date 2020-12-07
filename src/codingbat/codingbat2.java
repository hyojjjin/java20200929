package codingbat;

public class codingbat2 {
	// Warmup-2 > stringSplosion
	
	public String stringSplosion(String str) {
		  
		  int cnt = 0;
		  String a = "";
		  for(int i = 0; i < str.length(); i++) {
		    cnt ++;
		    String a1 = str.substring(0, cnt);
		    a += a1;
		    
		  }
		  return a;
		  
		}

	
	//----------------------------------//
	
	
	//Warmup-2 > array123
	public boolean array123(int[] nums) {
		  for(int i = 0; i<nums.length-2; i++){
		    if (nums[i] == 1 && nums[i+1] == 2 && nums[i+2] == 3) {

		          return true;
		        
		    } 
		  }
		  
		  return false;
		}

	
	
}
