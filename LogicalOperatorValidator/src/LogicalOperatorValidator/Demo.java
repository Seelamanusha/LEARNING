package LogicalOperatorValidator;
import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Is input valid (true/false):");
		boolean AND = scan.nextBoolean();
		System.out.println("Does input meet a certain condition (true/false):");
		boolean OR = scan.nextBoolean();
		boolean res=isValidInput( AND, OR);
		if (res) {
		System.out.println("Input is valid");
		}
		else {
		System.out.println("Input is invalid");

		}
		}
		public static boolean isValidInput(boolean AND,boolean OR) {
		return AND && OR;

		}
		}
	


