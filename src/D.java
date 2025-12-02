
public class D {
	
	

	public static void main(String[] args) {
		String s2 = new String(); // ye two objects create karta h // 
		System.out.println(s2.length()); // output m zero aagya // 
		
		
		String S3 = new String("deepak"); // ye two objects create karta h // 
		System.out.println(S3.length());	// output m aagya 6 // 
		 
		
		byte [] b = {101, 102, 103}; // byte ka ye ek array // 
		String s4 = new String(b);
		System.out.println(s4);  // output m aagya efg  101 ki value e hoti h //
		
		
		char [] c = {'a','b','c'}; // ye char array h // 
		String s7 = new String(c);
		System.out.println(s7); // output m aagya abc //  
		
		 char[] s1 = new char[] {'a','b','c'}; // ye jada safe hota h password ke liye // 
		 String s8 = new String("xyz");   
		 System.out.println("s1 :- " +s1);
		 System.out.println("s2 :- " +s8);   
		
		

	}

}
