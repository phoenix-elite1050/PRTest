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
		try{
			if (fook==null) {
				fook = new DemoSubproject2();
			}                      
			return fook;
		}
		catch(Exception ex){
			System.out.println(ex);
			return ex;
		}
	}
	
	
	public static int getIntValue() {
	int k = 58; 
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
