package TaxCalculator;
import java.util.Scanner;

public class Demo {
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the purchase amount: ");
		double p=scan.nextDouble();
		System.out.println("enter the tax rate: ");
		double t=scan.nextDouble();
		calculateTotalwithTax(p,t);
		System.out.println("Total cost including tax: "+calculateTotalwithTax(p,t));
		
		}
	public static double calculateTotalwithTax(double p,double t) {
		double Totalcost=p*t;
		return Totalcost+p;
		
	}
	

}
