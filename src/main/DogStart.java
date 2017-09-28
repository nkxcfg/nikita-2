package main;

import java.util.Arrays;
import java.util.Scanner;

public class DogStart {
	Scanner s;
	Dog[] dogs;
	int dogCount;
	DogTable table;
	
	//methods ----------------------------------
	public static void main (String[] args){
		DogStart dogs = new DogStart();
		dogs.dogsDataInputAndSorterSelect();
	}
	private void dogsDataInputAndSorterSelect(){
		//input and generate dog table
		this.s = new Scanner(System.in);
		this.generateDogs();
		
		this.table = new DogTable(this.dogs, 0);
		this.table.printTable();
		
		//main loop:
		boolean looped = true;
		int sortInd;
		
		while (looped){
			sortInd = this.sortTableInd();
			if (sortInd == 7) break;
     		DogTable.cls();
			
			switch (sortInd){
			case 1:
				System.out.println("Sorted by Name ASC");
				Arrays.sort(dogs, new SortByNameAsc());
				table.setInd(sortInd);
				break;
			case 2:
				System.out.println("Sorted by Name DESC");
				Arrays.sort(dogs, new SortByNameDesc());
				table.setInd(sortInd);
				break;
			case 3:
				System.out.println("Sorted by Size ASC");
				Arrays.sort(dogs, new SortBySizeAsc());
				table.setInd(sortInd);
				break;
			case 4:
				System.out.println("Sorted by Size DESC");
				Arrays.sort(dogs, new SortBySizeDesc());
				table.setInd(sortInd);
				break;
			case 5:
				System.out.println("Sorted by Age ASC");
				Arrays.sort(dogs, new SortByAgeAsc());
				table.setInd(sortInd);
				break;
			case 6:
				System.out.println("Sorted by Age DESC");
				Arrays.sort(dogs, new SortByAgeDesc());
				table.setInd(sortInd);
				break;
			}
			
			table.printTable();
		}
	}
	
	private void generateDogs(){
		
		System.out.println("Input your data. 1st arg is count of dogs. 2nd and the nexts are dog names.");
		boolean isPutted = false;
		boolean isInt = false;
		
		while (isPutted == false){
			String temp = s.nextLine();
			String[] data = temp.trim().split(" ");
			
			if (temp.isEmpty()) {
				System.out.println("Please input smth. Try again"); //verifies that inputed string is not empty
			} else {
				try { // verifies that 1st arg is int
					this.dogCount = Integer.parseInt(data[0]);
					isInt = true;
					} catch (NumberFormatException e) {
						System.out.println("1st arg should be integer");
						} 
				if (isInt == true){
					dogs = new Dog[this.dogCount];
					isPutted = true;
				}
				//generates dog array
				if (data.length > this.dogCount+1){
					System.out.println("Please notice that you're put more names than dogs exist. Extra names will not be used.");
				}
				//this part is not obvious but it's the only way i can think about it. It's needed to verify the name format
				//It creates dogs with generated names and overwrites they names to user specified
				
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
	
	private int sortTableInd(){
		
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