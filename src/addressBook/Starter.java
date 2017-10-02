package addressBook;

import java.util.ArrayList;

public class Starter {
	
	ArrayList<Data> book;
	public Starter(){
		book = new ArrayList<Data>();
	}
	/** Main.
	 * @param args.
	 */
	public static void main(String[] args){
		Starter start = new Starter();
		start.createList();
		start.printList();
	}
	
	/** Test data.
	 * 
	 */
	private void createList(){
		book.add(new Data("Person One", "880055555555", "US", "36003", "Street 1", "40", "Houston"));
		book.add(new Data("Person Two", "12345123412", "BR", "XXX555", "St. Pele", "70", "Brasília"));
		book.add(new Data("Person Another", "89990981212", "US", "11001", "Street 15", "5225", "Dalas"));
	}
	
	/** Print address book.
	 * 
	 */
	private void printList(){
		for (Data e : book){
			e.printName();
			e.printAddress();
			e.printPhone();
			System.out.println();
		}
	}
}