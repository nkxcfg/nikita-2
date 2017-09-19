package nbase;
import java.util.*;
public class Hanoi {
	private void meshalka(int n,String a, String b, String c) {
		String text = "Disk " + n + " moved from " + a + " to " + c;       
		if (n == 1) {
			System.out.println(text);
		}
		else {
			meshalka(n - 1, a, c, b);
		    System.out.println(text);
		    meshalka(n - 1, b, a, c);
		}
	}
	public static void main(String[] args) {
		Hanoi hanoi = new Hanoi();
		System.out.print("Enter number of discs: ");
		Scanner scanner = new Scanner(System.in);
		int diskN = scanner.nextInt();
		
		hanoi.meshalka(diskN, "A", "B", "C");
   }
}
