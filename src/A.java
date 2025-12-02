 // Difference Between  == and .equals() method in java //
// == operator is used for reference comparison (address comparison ). 
// .equals () method is used for content comparison (in String class ) 
public class A {

	public static void main(String[] args) {
		String s = new String ("deepak");
		String s1 = new String("deepak");
		System.out.println(s==s1);  // == ye refrence comparison ke liye use hota h    output m false aagya   // 
		// or iss program m dono string ka refrence alag alag h // 
		// dono objects ka alag alag address h  s and s1 //
		
		String s3 = "amit";
		String s4 = "amit";   
		System.out.println(s3==s4);
		// output m True aagya // 
		// kyuki dono ka address same h //  
		

	}

}
