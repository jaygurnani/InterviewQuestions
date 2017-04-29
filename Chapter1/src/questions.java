
public class questions {

	public static void main(String[] args) {
		
		// Question 1
		System.out.println(UniqueString("Testing"));
		System.out.println(UniqueString("Testingg"));
		
		// Question 2

	}
	
	// Assume its ASCII
	public static boolean UniqueString (String str){
		if (str.length() > 128) return false;
		
		boolean[] checkArray = new boolean[127];
		for(int i = 0; i < str.length(); i++){
			int val = str.charAt(i);
			
			// If there exists a value
			if (checkArray[val]){
				return false;
			}
			
			// Set the value
			checkArray[val] = true;
		}
		
		return true;
	}

}
