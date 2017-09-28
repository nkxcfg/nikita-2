package main;

public class DogTable {
	
	private Dog[] table;
	private int nameLength;
	private int sortedBy;
	/* 0 - not sorted
	 * 1 - sorted by name asc
	 * 2 - sorted by name desc
	 * 3 - sorted by size asc
	 * 4 - sorted by size desc
	 * 5 - sorted by age asc
	 * 6 - sorted by age desc*/
	public DogTable(Dog[] arr, int sort){
		this.table = arr;
		this.sortedBy = sort;
		for (int i = 0; i < table.length; i++){ // finds the longest name in order to specify column width
			this.nameLength = (this.table[i].getName().length() > this.nameLength) ? this.table[i].getName().length(): this.nameLength;
		}
	}
	public void setInd(int ind){
		this.sortedBy = ind;
	}
	public void printTable(){
	//Header
		System.out.print("|NAME");
		for(int i = 0; i < this.nameLength-3; i++){
			System.out.print(" ");
		}
		switch (this.sortedBy){
		case 1: System.out.print("^");
				break;
		case 2: System.out.print("v");
				break;
		default: System.out.print(" ");
				break;
		}				
		System.out.print("|SIZE   ");
		switch (this.sortedBy){
		case 3: System.out.print("^");
				break;
		case 4: System.out.print("v");
				break;
		default: System.out.print(" ");
				break;
		}	
		System.out.print("|AGE ");
		switch (this.sortedBy){
		case 5: System.out.print("^");
				break;
		case 6: System.out.print("v");
				break;
		default: System.out.print(" ");
				break;
		}	
		System.out.println("|");
		
		
	//body
		for (int i = 0 ; i<this.table.length ; i++){
			StringBuilder gn = new StringBuilder();
			gn.append("|");
			gn.append(table[i].getName());
			System.out.print(gn); // Name
			for(int j = 0; j < this.nameLength-table[i].getName().length()+2; j++){
				System.out.print(" ");
			}
			StringBuilder gs = new StringBuilder();
			gs.append("|");
			gs.append(table[i].getSize());
			System.out.print(gs); // Size
			for(int j = 0; j < 8-table[i].getSize().length(); j++){
				System.out.print(" ");
			}
			StringBuilder ga = new StringBuilder();
			ga.append("|");
			ga.append(table[i].getAge());
			System.out.print(ga); // Age
			for(int j = 0; j < 5 - table[i].getAge().length(); j++){
				System.out.print(" ");
			}
			System.out.println("|");
		}
	}
	public static void cls(){
	    for (int i = 0; i < 20; ++i){
	     System.out.println();
	    }
	
	}

}