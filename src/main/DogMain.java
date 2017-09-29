package main;

import java.util.Arrays;
import java.util.Scanner;

/** Main class.
 * @author nikita.kazakov .
 *
 */
public class DogMain {
	Scanner s;
	Dog[] dogs;
	int dogCount;
	DogTable table;
	public static void main (String[] args){
		DogMain dogs = new DogMain();
		dogs.dogsDataInputAndSorterSelect();
	}
	private void dogsDataInputAndSorterSelect(){
		this.s = new Scanner(System.in);
		this.inputDogs();
		this.table = new DogTable(this.dogs, 0);
		this.table.printTable();
		boolean looped = true;
		int sortChoice;
		while (looped){
			sortChoice = this.sortTableByChoice();
			if (sortChoice == 7) break;
     		DogTable.cls();
			switch (sortChoice){
			case 1:
				System.out.println("Sorted by Name ASC");
				Arrays.sort(dogs, new SortByNameAsc());
				table.setChoice(sortChoice);
				break;
			case 2:
				System.out.println("Sorted by Name DESC");
				Arrays.sort(dogs, new SortByNameDesc());
				table.setChoice(sortChoice);
				break;
			case 3:
				System.out.println("Sorted by Size ASC");
				Arrays.sort(dogs, new SortBySizeAsc());
				table.setChoice(sortChoice);
				break;
			case 4:
				System.out.println("Sorted by Size DESC");
				Arrays.sort(dogs, new SortBySizeDesc());
				table.setChoice(sortChoice);
				break;
			case 5:
				System.out.println("Sorted by Age ASC");
				Arrays.sort(dogs, new SortByAgeAsc());
				table.setChoice(sortChoice);
				break;
			case 6:
				System.out.println("Sorted by Age DESC");
				Arrays.sort(dogs, new SortByAgeDesc());
				table.setChoice(sortChoice);
				break;
			}
			table.printTable();
		}
	}
	
	private void inputDogs(){
		
		System.out.println("Input your data. 1st arg is count of dogs. 2nd and the nexts are dog names.");
		boolean isPutted = false;
		boolean isInt = false;
		
		while (isPutted == false){
			String temp = s.nextLine();
			String[] data = temp.trim().split(" ");
			
			if (temp.isEmpty()) {
				System.out.println("Please input smth. Try again"); 
			} else {
				try { 
					this.dogCount = Integer.parseInt(data[0]);
					isInt = true;
					} catch (NumberFormatException e) {
						System.out.println("1st arg should be integer");
						} 
				if (isInt == true){
					dogs = new Dog[this.dogCount];
					isPutted = true;
				}
				if (data.length > this.dogCount+1){
					System.out.println("Please notice that you're put more names than dogs exist. Extra names will not be used.");
				}
				
				
				for (int i = 0; i<this.dogCount; i++){
						dogs[i] = new Dog(null, 0, 0);
					}
				
				int tempNames = (this.dogCount+1>data.length) ? data.length-1: this.dogCount;
				
				for (int i = 0; i< tempNames; i++){
					this.dogs[i].setName(data[i+1]);
				}
				
			}
		}
	}
	
	/** Check inputed value for select sorting method. 
	 * @return choice - checked value provided bu user.
	 */
	private int sortTableByChoice(){
		boolean isPutted = false;
		int choice = 0;
		System.out.println("Input the following to sort:\n 1 - by name asc,\n 2 - by name desc,\n 3 - by size asc,\n 4 - by size desc,\n 5 - by age asc,\n 6 - by age desc,\n 7 - for exit.");
		while (isPutted == false){
			String temp = s.nextLine();
			try{
				choice = Integer.parseInt(temp);
				if ((choice>7 || choice<1)){
					System.out.println("Your choice is need to be integer from 1 to 7");
				}
				else {
					isPutted = true;
				}
			} 
			catch (NumberFormatException e) {
				System.out.println("Your choice is need to be integer from 1 to 7");
			} 
		}
		return choice;
	}
}