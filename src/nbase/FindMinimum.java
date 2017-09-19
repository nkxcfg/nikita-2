package nbase;

public class FindMinimum{
	public static void main(String[] args) {
		int a = 2;
		int b = 5;
		SearchThird(a, b);
		System.out.print(SearchThird(a, b));
	}
	public static int SearchOne (int a, int b) {
		int one;
 	    one = Math.min(a, b);
 	    return one;
	}
	public static int SearchSecond (int a, int b) {
		int second=SearchOne(a, b);
		return second;
	}
	public static int SearchThird (int a, int b) {
		int third=SearchSecond(a, b);
		return third;
	}
}

