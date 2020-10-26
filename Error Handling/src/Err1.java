
public class Err1 {

	public static void main(String[] args) {
		try {validateCell("987589652"); }
			catch(ArithmeticException e) {System.out.println(e); }
			//catch(Exception e) { System.out.println(e);}
		//finally { System.out.println("Code is Executed:....");}
			System.out.println("REst of the Code....");
		}
	static void validateCell(String cell) {
		if(cell.length()<10)throw new ArithmeticException("Not a valid Number.");
		else
			System.out.println("Valid Cell Number.");
	}
}



