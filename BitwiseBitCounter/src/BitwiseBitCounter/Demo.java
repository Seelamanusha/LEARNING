package BitwiseBitCounter;
import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int num = scan.nextInt();
		int setBits = countSetBits(num);
		System.out.println("Number of set bits: " + setBits);
		} public static int countSetBits(int num) {
		int count = 0;
		while (num > 0) {
		if ((num & 1) == 1) {
		count++;
		}
		num >>= 1;

		}
		return count;
		}
		}


