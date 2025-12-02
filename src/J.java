// Case Conversion and Type Conversion Methods6  in String // 
public class J {

	public static void main(String[] args) {
		 String s = "deepak";
		 System.out.println(s.toUpperCase()); // ye sabhi characters ko upper case m convert kar dega // 
		 // output m aagya DEEPAK // 
		 String s1 = "DEEPAK"; 
		 
		 System.out.println(s1.toLowerCase()); // ye s1 ke characters ko lower case m convert kar dega  // 
		 // output m aagya deepak // 
		 
		  int a = 10;
		  int b = 20; 
		  String s2  = String.valueOf(a);// ye method integer ko string m convert kar deta h // 
		  String s3  = String.valueOf(b);
		  System.out.println(s2+s3); // ye kisi bhi dusre data type ko as a argument leta h or usko string m convert kar deta h //
		  // aab output aagya 1020 //   
		  
		  char [] c = s.toCharArray(); // vo string ko character array m convert karwa deta h // 
		  System.out.println(c);  
 
	}

}
 