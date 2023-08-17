package TemperatureConversion;
import java.util.Scanner;

public class DemoAPP {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to the Temperature Conversion Tool!");
		System.out.println("Select an option:");
		System.out.println("1. Convert Celsius to Fahrenheit");
		System.out.println("2. Convert Fahrenheit to Celsius");
		System.out.println("Enter your choice:");
		int choice = scan.nextInt();
		Demo demo =new Demo();
		switch(choice) {

		case 1:System.out.println(" Enter the temperature in Celsius:");
		double celsius=scan.nextDouble();
		double f= demo.celsiusToFahrenheit(celsius);
		System.out.println(celsius+" is equivalent to" +f);
		break;

		case 2:System.out.println("Enter the temperature in Fahrenheit:");
		double fahrenheit=scan.nextDouble();
		double c= demo.fahrenheitToCelsius(fahrenheit);
		System.out.println(fahrenheit+" is equivalent to "+c);
		break;
		default:
		System.out.println("Nothing to do");

		}
		}
		}


