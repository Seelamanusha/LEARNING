package MethodOverloadingCalculator;

public class Demo {
	public static int calculate(int num1,int num2,char operator) {
		switch (operator) {
		case '+':
		return num1 + num2;
		case '-':
		return num1 - num2;
		case '*':
		return num1 * num2;
		case '/':
		return num1 / num2;
		default:
		System.out.println("Invalid operator.");
		}
	    return 0;
		}
		}


