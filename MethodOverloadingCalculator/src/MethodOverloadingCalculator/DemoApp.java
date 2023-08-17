package MethodOverloadingCalculator;
import java.util.Scanner;

public class DemoApp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first integer:");
		int num1 = scan.nextInt();
		System.out.println("Enter second integer:");
		int num2 = scan.nextInt();
		System.out.print("Enter the operator (+, -, *, /): ");
		char operator = scan.next().charAt(0);
		Demo demo = new Demo();
		double Res= demo.calculate(num1, num2, operator);
		System.out.println("Result:" +Res);

		}
		}


