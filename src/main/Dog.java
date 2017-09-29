package main;

import java.util.Random;

/**
 * @author nikita.kazakov .
 *
 */
public class Dog {
	private String dogName;
	private int dogSize;
	private int dogAge;
	private Random ran;
	
	public Dog(String name, int size, int age){
		
		this.dogName = name;
		this.dogSize = size;
		this.dogAge = age;
		
		if (this.dogName == null || this.dogSize == 0 || this.dogAge == 0){
			
			this.ran = new Random();
			
			if (this.dogName == null){ // generates name in case if name's not set
				this.dogName = NameGenerator.fPart[ran.nextInt(NameGenerator.fPart.length)] 
						+ NameGenerator.lPart[ran.nextInt(NameGenerator.lPart.length)];
			}
			
			if (this.dogSize == 0){ // size
				this.dogSize = ran.nextInt(3)+1;
			}
			
			if (this.dogAge == 0){ // sets dogs age 
				this.dogAge = ran.nextInt(20)+1;
			}
		}
	}
	
	/** int size to String size for table and sorting.
	 * @return result String size.
	 */
	public String getSize(){ // Interprets int size as String
		String result;
		switch (this.dogSize){
		case 1: result = "small";
				break;
		case 2: result = "medium";
				break;
		default: result = "big";
				break;
		}
		return result;
	}
	
	/** For convert names to one format.
	 * @param name
	 */
	public void setName(String name){
		this.dogName = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
	}
	
	/**For table and sorting.
	 * @return dogAge to String.
	 */
	public String getAge(){
		Integer temp = new Integer(this.dogAge);
		return temp.toString();
	}
	
	/**For table and sorting.
	 * @return 
	 */
	public String getName(){
		return this.dogName;
	}
	
	/**For table and sorting.
	 * @return
	 */
	public int getAgeInt(){
		return this.dogAge;
	}
	
	/**For table and sorting.
	 * @return
	 */
	public int getSizeInt(){
		return this.dogSize;
	}
		
}