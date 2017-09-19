package nbase;
import java.util.Scanner;
public class CountElementInString {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("input of 1 letter: ");
		String letter = in.next();
		String str = "our program should request an input of 1 symbol form the consoles and count a number occurrences of this symbol in a pre-created text and print it to the console. The text may be hard-coded as a String in your code or stored in .txt file";
		int lnt = str.length();
		int lnts = str.replaceAll(letter, "").length();
		int letterCounter = lnt - lnts;
		System.out.print(letterCounter);
	}
}