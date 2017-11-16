package list;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.util.NoSuchElementException;
import list.List;
public class TestList{
	
	List<String> testList;
	
	@Before
	public void setUp(){
		this.testList = new List<String>();
	}
	
	
	@Test
	public void addCheckRemoveStringTest(){
		//add
		this.testList.add("This ");
		this.testList.add("is ");
		this.testList.add("linked ");
		this.testList.add("list ");
		this.testList.add("test.");
		assertTrue(this.testList.size() == 5);
		
		//check
		assertTrue(this.testList.getElementByIndex(0).equals("This "));
		assertTrue(this.testList.getElementByIndex(2).equals("linked "));
		
		//remove
		this.testList.remove("linked ");
		
		//check
		assertTrue(this.testList.getElementByIndex(2).equals("list "));
		assertTrue(this.testList.size() == 4);
	}
	
	@Test (expected = NoSuchElementException.class)
	public void negativeRemove() throws Exception{
		//add
		this.testList.add("This ");
		this.testList.add("is ");
		this.testList.add("linked ");
		
		//check
		assertTrue(this.testList.getElementByIndex(0).equals("This "));
		assertTrue(this.testList.getElementByIndex(2).equals("linked "));
		
		//removeNegative
		this.testList.remove("asdas jdha sjkda s");
	}
	
	@Test (expected = IndexOutOfBoundsException.class)
	public void indexOutOfBounds() throws Exception{
		this.testList.add("This ");
		this.testList.getElementByIndex(1);
	}
	
	@Test
	public void removeAllData(){
		//add
		this.testList.add("This ");
		this.testList.add("is ");
		this.testList.add("linked ");
		this.testList.add("list ");
		this.testList.add("test");
		
		//remove
		this.testList.remove("This ");
		this.testList.remove("is ");
		this.testList.remove("linked ");
		this.testList.remove("list ");
		this.testList.remove("test");
		
		//check
		assertTrue(this.testList.size() == 0);
		}
}