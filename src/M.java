// Program to Reverse a String // 
public class M {

	public static void main(String[] args) {
          String s = "deepak";
          String reverse = "";
          for(int i = s.length() - 1; i>=0; i--) {
        	  reverse = reverse+s.charAt(i); 
          }
          System.out.println(reverse);    
	}

}
