// String MEthod3  in Java // 
public class G {

	public static void main(String[] args) {
	   
		
		// how to add two Strings // 
		String s1 = "Deepak";
		String s2 = "Java";
		System.out.println(s1+s2);
		// output m DeepakJava aagya // 
		
		System.out.println(s1+10);
		// output m aagya Deepak10 // 
		
		System.out.println(s1+10+20); 
		// output m aagya Deepak1020 //
		 
		
		System.out.println(10+20+s1);
		// output m aagya 30Deepak // 
		
		System.out.println(10+s1+20);   
		// output m aagya 10Deepak20 // 
		
		System.out.println(s1+20/10); 
		// output m aagya Deepak2 // 
		
		System.out.println(s1+20*10); 
		// output m aagya Deepak200  // 
		
		
	// 	System.out.println(s1+10-5);  ye error show kara dega //
		
		 
		
		// concat(String str) method ka use karenge //
		
		System.out.println(s1.concat(s2)); // concat ke threw hum String ko add kara skate h //     
		   
		
		// join method in java // 
		// join is the static method of the String class // 
		// join(CharSequence delimiter, CharSequence... elements) // 
		 
		 System.out.println(String.join(";", s1,s2));  // do strings ke bich m hume kya add karwna h // 
		 // output aagya  deepak;java //  
		 
		 
		 
		 
		 //  subSequence Method in Java // 
		 String se = "this is demo";
		 System.out.println(se.subSequence(3, 9));  // start point of the index and end point of the index // 
		 // output aagya s is d ye ek kaam chalta h tho d thak hi show karega  // 
		 
		 
		 
		 // substring method in java //
		 System.out.println(se.substring(3));  // agar hum bss ek hi index value likhte h tho //  
		 // output ye 3 se lekar end thak substring provide kar dega // 
		
		 
		 System.out.println(se.substring(3,11)); 
		 // output m  s is dem //         
	}

}
