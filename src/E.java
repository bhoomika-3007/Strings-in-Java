// String Methods1  in Java // 


// inn sab methods se hum pata kar skate h ki humari String empty h ki nahi //  
public class E {

	public static void main(String[] args) {
		String name = "abc";
		String email = "abc@gamil.com";
		String password = "abc123";
		 System.out.println(name.length()); // output aagya 3 length method hemasa integer m output provide karta h // 
		  int i = name.length(); // output m aagya 3 // 
		  if(i==0) {
			  System.out.println("name is empty"); 
		  }
		  else {
			  System.out.println("name is not empty");   
		  }
		  
		  
			
			// now isEmpty ko dhekte h isEmpty method boolean value return karta h true ya false // 
			String name3 = "mohit"; 
			System.out.println(name3.isEmpty()); // ye boolean value return kara h // 
			 // output aagya false // 
			String name4 = "";
			System.out.println(name4.isEmpty());
			// aab output aagya true //   
			
			// hum ek or  tarike se likh sakte h //
			String name5 = "";
			if(name5.isEmpty()==true) {
                  System.out.println("name is empty"); // output aagya name is empty // 				
			}
			
			
			
			// aab aata h trim() Method in java //
			// trim() method String m output return  karta h // 
			
			String name1 = "            akash       ";  // this is without trim() method in java // 
			System.out.println(name1); // akash aagya output m //
			
			
			// trim () method aage or piche ke spaces ko remove kar deta h // 
			
			String name9 = "    Prince      ";
			System.out.println(name9.trim()); 
			
			
			 
			String name7 = "           abc        xyz"; // ye sirf aage or piche ke spaces ko remove karta h bich me spaces ko remove nahi karta h // 
			System.out.println(name7.trim());  // output m abc        xyz  aagya // 
			
			
			//  trim () method se bhi hum length pata kar sakte h //
			
			String name8 = "yash";
			if(name8.trim().length()==0) {
				System.out.println("name8 is empty");  
			}
			else {
				System.out.println("name8 is not empty "); 
			}
			
			
			}  
	
	}
