package codingbat;

public class codingbat_1 {
	
	// Warmup-1 > mixStart
	
	public boolean mixStart(String str) {
		  int a = str.indexOf("ix");
		  
		  return a != -1;
		}

	
	//----------------------------------//
	
	
	// Warmup-1 > startOz
	
	//-----------------------------------------
	//Warmup-1 > intMax
	public int intMax(int a, int b, int c) {
		  int max;
		  max = a > b ? a : b;
		  max = max > c ? max : c;
		  
		  return max;
		}

	
	
	
	
	//---------------------------------------
	//Warmup-1 > close10
	public int close10(int a, int b) {
		  
		  int x = Math.abs(10 - a);
		  int y = Math.abs(10 - b);
		  
		  
		  if (x-y == 0) {
		    return 0;
		  } else if (x > y) {
		    return b;
		  } else {
		    return a;
		  }
		}
	
	
	
	//----------------------------------//
	
	//Warmup-1 > max1020

	public int max1020(int a, int b) {
		  

		  if((a == 20) || (b == 20)) {
		    return 20;
		  }
		  
		    else if ((a == 10) || (b == 10)) {
		    return 10;
		  }  
		  
		    else if (a > b) {
		    return a;
		    
		  } else if ((a > 20) || (b > 20)) {
		    return 0;
		  } return b;
		}

}
