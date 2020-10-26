
public class Err {

	public static void main(String[] args) {
		try {
		int data=100/0;
		}
		catch(ArithmeticException e) { System.out.println(e.getMessage());
		System.out.println("REst of the Code");

	}

}
}
