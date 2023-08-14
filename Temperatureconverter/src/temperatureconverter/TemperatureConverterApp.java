package temperatureconverter;
import java.util.Scanner;

public class TemperatureConverterApp {
	public static void main(String[]args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter the degree");
	double F = scan.nextDouble();
	TemperatureConverter temperatureConverter = new TemperatureConverter();
	double a=temperatureConverter.convertFahrenheitToCelsius(F);
	System.out.println(a);
	
	
	}
	

}
