import java.io.*;
 class ThrowDemo {
	 void method()throws IOException {
		 throw new IOException("Something is Wrong.......");
	 }
}
class Test{
	public static void main(String args[]) throws IOException {
		ThrowDemo m= new ThrowDemo();
		m.method();
		System.out.println("Rest of the main code....");
		
	}
}
 
