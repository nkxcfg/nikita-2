package nbase;
import java.util.Scanner;
public class SearchInArray {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("array size: ");
        int size = in.nextInt();
        int[] array = new int[size];
    	for (int n = 0; n < array.length; n++){
    		array[n] = (int) Math.round((Math.random() * 50));
    	}
    	System.out.print("array debug: "); // for debugging 
        showout(array); // for debugging 
        System.out.print("Value to search: ");
        int searchValue = in.nextInt();
        search(array, searchValue);
               
    }
	private static void search (int[] array, int searchValue){
		int n;
		for (n = 0; n < array.length; n++){
	    	if (array[n] == searchValue){
	    		System.out.print("true: found in " + (n+1)+ " position");
	    		break;
	    	}
		}	
		if (n == array.length){
			System.out.print("false");
		}
	}
	// for debugging 
		private static void showout(int[] array){ 
        for (int index = 0; index < array.length - 1; ++index){
            System.out.print(array[index] + ", ");
        	}
        System.out.println(array[array.length -1]);
		}
	}
