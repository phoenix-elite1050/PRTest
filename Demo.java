package subproject2;

import org.subproject2_A.App;

public class Demo { 

	int k;
	App app;
	
	public static void main(String[] args) {
		int k_subproject;
	}
	
	private static Demo fook = null;

	public static Demo getFook() { 
		 System.out.println(""); 
		 
		if (fook==null) {
			fook = new DemoSubproject2();
		}                       
		return fook;
	}

	public static Demo getFloatValue() { 
		 System.out.println("float value is"); 
		 
		if (fook==null) {
			fook = new DemoSubproject2();
		}                       
		return fook;
	}
	
	
	public static int getIntValue() {
		System.out.println("getIntValue");
	int k = 58; 
		System.out.println("value of k is::"+k);
	return k;	
	}
	
	public void x(){
		System.out.println("text");
		try{
			
		}
		catch(Exception ex){
			
		}
		
	}
	
}
