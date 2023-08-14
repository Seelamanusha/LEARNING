package Double;
import java.util.Scanner;

public class Double {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		int num=scan.nextInt();
		System.out.println(doublethenumber(num));
		
	}
	public static int doublethenumber(int num) {
		return num*2;
	}

}
