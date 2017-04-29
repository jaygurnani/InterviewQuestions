
public class questions {

	public static void main(String[] args) {
		
		// Question 1
		System.out.println(UniqueString("Testing"));
		System.out.println(UniqueString("Testingg"));
		
		// Question 2 - skip (C/C++ question)
		
		// Question 3
		System.out.println(permutation("dog", "god"));
		
		// Question 4 - skip, manipulate the string backwards and you can do it in place
		
		// Question 5 
		
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
	
	public static boolean permutation(String src, String dest){
		if (src.length() != dest.length()){
			return false;
		}
		
		String srcSorted = sortString(src);
		String destSorted = sortString(dest);
		if (srcSorted.equals(destSorted)) return true;
		return false;
	}
	
	public static String sortString(String s){
		char [] content = s.toCharArray();
		java.util.Arrays.sort(content);
		return new String(content);
	}

	public static String condense(string src){
				
		
	}
}
