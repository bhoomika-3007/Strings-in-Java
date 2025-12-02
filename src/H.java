// Method4 in java Replacing and Removing Character in String in Java // 
public class H {

	public static void main(String[] args) {
		 String s1 = "this is demo";
		 System.out.println(s1.replace("is", "was")); // is ki jagha pe m was lagana chatha hu // 
		 // output aagya thwas was demo // 
		 
		 
		 System.out.println(s1.replaceFirst("is", "was")); // jaha pe bhi usse phele is milega ve bss usse hi replace karega // 
		 // output aagya thwas is demo // 
		 
		 System.out.println(s1.replaceAll("is", "was")); 
		 // output aagya thwas was demo // 
		 
		 System.out.println(s1.replaceAll("is(.)", "was")); // ye space ko remove kar dega // 
         // output aagya thwaswasdemo // 
		 
		 System.out.println(s1.replaceAll("is(.*)", "was"));   // . and * ko hum regular expression bolte h //  
		 // isse jha pe bhi is milega ye uss ke baad sabhi ko remove kar dega //    
		 // output m aagya thwas // 
	}

}
