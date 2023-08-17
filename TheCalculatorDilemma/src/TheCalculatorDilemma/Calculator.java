package TheCalculatorDilemma;
import java.util.Scanner;
public class Calculator {
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter two numbers");
	int num1=scan.nextInt();
	int num2=scan.nextInt();
	int n=scan.nextInt();
	switch(n) {
	case 1:
	System.out.println("Addition Result is"+(num1+num2));
	break;
	case 2:
	System.out.println("Subtraction Result is"+(num1-num2));
	break;
	case 3:
	System.out.println("Multiplication Result is"+(num1*num2));
	break;
	case 4:
	System.out.println("Division Result is"+(num1/num2));
	break;
	default:
	System.out.println("Nothing to do");
	}
	}
	}


