// Searching Character in String in Java Method5  // 
public class I {

	public static void main(String[] args) {
	 String s = "deepak";
	 System.out.println(s.indexOf('e')); // e ki index value kya h // 
	 // ouput m ye e ki index value print kara dega  1 //
	 
	 System.out.println(s.indexOf("ep")); // String value bhi provide kara sakte h // 
	 // output m ye 2 print kara dega // 
	 
	 System.out.println(s.lastIndexOf('e'));   
	 //  output m 2 aagya ye last se serach karna start karta h // 
	 
	 
	 System.out.println(s.charAt(3));  // charAt me hum integer value provide karte h // 
	// output string ki form m deta h  p aagya output m // 
	 
	 System.out.println(s.contains("ep")); // ye check karega ki ep present h ya nahi ye boolean return karega // 
	 // output m aagya true // 
	 
	 System.out.println(s.startsWith("d")); // kya ye d se start ho rha h  boolean value return karta h // 
	 // output m true aagya // 
	 
	 System.out.println(s.endsWith("a")); // kya s jo h a se end ho rha h //
	 // output m aagya false // 
	  

	}

}
