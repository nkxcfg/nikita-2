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
	    System.out.print("array: "); 
	    showout(array); 
	    System.out.print("Value to search: ");
	    int searchValue = in.nextInt();
	    binSearch( array, searchValue);
    }
	public static int binSearch (int[] array, int searchValue){
		int maxN=array.length-1;
		int minN=0;
		int avgN=-1;
		while (minN <= maxN){
			avgN=(minN+maxN)/2;
	    	int avgValue=array[avgN];
			if (avgValue < searchValue){
				minN = avgN+1;
			}
			else if(avgValue > searchValue){
				maxN = avgN-1;
			}
			else{
				System.out.print("found in " + (avgN+1)+ " position ");
				break;
			}
		}
		if (minN > maxN){
			System.out.print("false");
		}
		return avgN;
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
