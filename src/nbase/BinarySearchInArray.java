package nbase;
import java.util.Scanner;
public class BinarySearchInArray {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("array size: ");
		int size = in.nextInt();
		int[] array = new int[size];
	    for (int n = 0; n < array.length; n++){
	    	array[n] = (int) Math.round((Math.random() * 99));
	   		}
	    sort(array);	
	    System.out.print("array debug: "); // for debugging 
	    showout(array); // for debugging 
	    System.out.print("Value to search: ");
	    int searchValue = in.nextInt();
	    
	    binSearch( array, searchValue);
	}
	private static void binSearch ( int[] array, int searchValue){
		int maxN=array.length-1;
		int minN=0;
		int avgN=maxN/2;
		boolean check = false;
		while ((array[avgN]!= searchValue)&&(maxN-minN>1)){
			if (searchValue > array[avgN]){
				minN = avgN+1;
				avgN=((minN+maxN)/2);
			}
			else {
				maxN=avgN-1;
				avgN=((minN+maxN)/2);
			}
		}
		if (maxN-minN<1){
			System.out.print(check);
		}
		else if (searchValue>array[array.length-1]){
			System.out.print(check);
		}
		else{
			check = true;
			System.out.print(check + " : found in " + (avgN+1)+ " position");
		}
		
	}
	private static void showout(int[] array){ 
		for (int index = 0; index < array.length - 1; ++index){
			System.out.print(array[index] + ", ");
	    	}
	    System.out.println(array[array.length -1]);
		}
	private static void sort(int[] array){
		boolean isSorted;
		do{
			isSorted = sort(array, 0) & sort(array, 1);
			}
		while (!isSorted);
		}
	private static boolean sort(int[] array, int startIndex){
		boolean isSorted = true;
		for (int index = startIndex; index < array.length - 1; index += 2){
			if (array[index] > array[index + 1]){
				isSorted = false;
		        swap(array, index, index + 1);
		    	}
			}
		return isSorted;
		}
	private static void swap(int[] array, int currentIndex, int nexttIndex){
		int tmp = array[currentIndex];
		array[currentIndex] = array[nexttIndex];
		array[nexttIndex] = tmp;
		}

}
