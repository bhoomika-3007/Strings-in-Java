// String Methods2 in Java // 

 // Inn sab methods se hum two strings ko Comparing karte h // 
public class F {

	public static void main(String[] args) {
	
                 // equals method boolena m value return karta h // 
		   String s1 = "deepak";
		   String s2 = "amit";
		   System.out.println(s1.equals(s2));   // output aagya false // 
		   
		   // aagar amit ki jagha deepak hota tho true output  provide kar deta // 
		   String s3 = "deepak";
		   System.out.println(s1.equals(s3)); // aab output m true aagya //  
		   
		   // ye upper case or lower case ko different hi treat karta h // 
		   
		   String s4 = "Deepak";
		   System.out.println(s1.equals(s4)); // aab output aagya false // 
		   
		     // aagar aap chathe ho ki deepak or Deepak ko ye true output leke de tho hum use karenge s1.equalsIgnore ka // 
		   
		   String s5 = "Deepak";
		   System.out.println(s1.equalsIgnoreCase(s5));  // aab output aagya true //  
		   
		   
		   // hum euqals method ke throw bhi ye pata kar sakte h ki humari string empty h ki nahi h //
		   System.out.println(s1.equals(""));  // output aagya false //  
		   
		   
		   
		   
		   // compareTo() method in String //
		   
		   
		   String s = "a"; // a ki value hoti h 97 // 
		   String ss = "A"; // A ki value hoti h 65 //  
		   System.out.println(s.compareTo(ss));   // compareTo integer m value return karta h // 
		   // 97 - 65  tho output 32 aagya // 
		   // output aagya 32 // 
		   // aagar  output aati h zero tho s1 and s2 both are equal // 
	       // positive h tho s1 > h s2 se // 
		   // agar negative value aati h tho s1 < s2 se //  
		   
		   
		   // compareToIgnoreCase //
		   String sa = "ab";
		   String as = "AB";
		   System.out.println(sa.compareToIgnoreCase(as));  // iss case m vo small a or capital A ko same treat kar rha h // 
		   // output aagya 0  // 
		       
	} 
	        

}
