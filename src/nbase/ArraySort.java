package nbase;

public class ArraySort {
	    public static void main(String[] args){
	    	int[] array = new int[12];
	    	for (int n = 0; n < array.length; n++){
	    		array[n] = (int) Math.round((Math.random() * 99));
	    	}
	    //	int[] array = {15, 64, 80, 11, 1, 9, 82, 7, 39, 41, 69, 33, 22};
	        System.out.print("input: ");
	        showout(array);
	        sort(array);
	        System.out.print("sort: ");
	        showout(array);
	    }
	    private static void sort(int[] array){
	        boolean isSorted;
	        do{
	            isSorted = sort(array, 0) & sort(array, 1);
	        } while (!isSorted);
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
	    /**
	     * swapXor - xor chager
	     * ploho chitaemaya hren' bolshe ne trogat'. odna lishnaya peremennaya pogodi ne sdelaet
	     */
	    /*private static void swapXor(int[] array, int currentIndex, int nextIndex){
	        array[currentIndex] ^= array[nextIndex];
	        array[nextIndex] ^= array[currentIndex];
	        array[currentIndex] ^= array[nextIndex];
	    }*/
	    /**
	     * swap - method for change from nextIndex to currentIndex in current  step of sorting
	     * @param array - see main
	     * @param currentIndex - array[index]
	     * @param nextIndex - array[index + 1]
	     */
	    private static void swap(int[] array, int currentIndex, int nextIndex){
	        int tmp = array[currentIndex];
	        array[currentIndex] = array[nextIndex];
	        array[nextIndex] = tmp;
	      }
	    private static void showout(int[] array){
	        for (int index = 0; index < array.length - 1; ++index){
	            System.out.print(array[index] + ", ");
	        }
	        System.out.println(array[array.length - 1]);
	    }
	    /* 
	    private static void bubbleSort(int[] array){
	        boolean isSorted = false;
	        for (int i = 0; i < array.length - 1 && !isSorted; i++){
	            isSorted = true;
	            for (int j = 0; j < array.length - i - 1; j++){
	                if (array[j] > array[j + 1]){
	                    swap(array, j, j + 1);
	                    isSorted = false;
	                }
	            }
	        }
	    }
	    */
	    }