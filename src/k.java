// String Buffer Class and Methods in Java // 
public class k {

	public static void main(String[] args) {
	  StringBuffer sb = new StringBuffer("deepak"); // StringBuffer mutable object create karta h //  
	  sb.append("java");
	  System.out.println(sb);  
	  sb.append("deepak javaa");
	  System.out.println(sb.capacity()); // 22 old capacity * 2 + 2 = new capacity // 
	  
   
	  
	   // StringBuffer object ke ander kitne characte store kara sakta h // 
	  
	  StringBuffer sa = new StringBuffer();
	  System.out.println(sa.capacity());   // 16 character store kara sakta h // 
	
	  StringBuffer saa = new StringBuffer("deepak"); // aab output aagya 22 // 
	  System.out.println(saa.capacity());  // capacity 16 + string ki length 6 16 + 6 = 22 // 
	  
	  
	  StringBuffer sc = new StringBuffer(1000); // initial capacity khud se provide kar sakte h // 
	  System.out.println(sc.capacity()); // output m 1000 aagya // 
	  
	  
	  StringBuffer sv = new StringBuffer("amit java ");
	  System.out.println(sv.length());  // output m ye length bata dega 10 // 
	  
	  StringBuffer sg = new StringBuffer("abhay is good boy");
	  System.out.println(sg.charAt(3)); // output m a aagya // 
	  
	  StringBuffer sm = new StringBuffer("abhay is good boy");
	  System.out.println(sm.delete(2,5)); // output m aagya ab  is good boy // 
	  
	  
	             
	
	}

}
