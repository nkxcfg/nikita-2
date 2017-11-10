package list;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class List<T>{
    int size = 0;
    Entry<T> header;
    public List(){
        this.header = new Entry<T>(null, null, null);
        this.header.next = this.header.prev = this.header;
    }
    private class Entry<E>{
        E element;
        Entry<E> next;
        Entry<E> prev;
        private Entry(E element, Entry<E> next, Entry<E> prev){
            this.element = element;
            this.next = next;
            this.prev = prev;
        }
    }
    private class ListIterator implements Iterator<Entry<T>>{
       	int count;
    	Entry<T> iterable;
      	private ListIterator(){
    		this.count = 0;
    		this.iterable = header.next;
    	}
    	public boolean hasNext() {
		return (this.count>=size)? false : true;
		}
        public Entry<T> next() {
			count++;
			this.iterable = this.iterable.next;
			return iterable;
		}
    }
    public void add(T element){
    	this.size++;
        Entry<T> entry = new Entry<T>(element, this.header, this.header.prev);
        entry.prev.next = entry;
        entry.next.prev = entry;
    }
    public void remove (T element){
        ListIterator iterator = new ListIterator();     
        int tempSize = this.size; //kostyl'. need to think how to change it to smth normal
        while (iterator.hasNext()){
            if (iterator.iterable.element.equals(element) == true){
            	iterator.iterable.prev.next = iterator.iterable.next;
            	iterator.iterable.next.prev = iterator.iterable.prev;
            	iterator.iterable.next = iterator.iterable.prev = null;
            	iterator.iterable = null;
            	size--;
            	break;
            } 
     
            else {
            	iterator.next();
            }
        }
        if (tempSize == size){
        	throw new NoSuchElementException("No such element in the list: " + element.toString());
        }
    }
    public T getElementByIndex(int index){
    	if (index < 0 || index>=size){
    		throw new IndexOutOfBoundsException("Index: " + index + ", list size: " + size);
    	}
    	Entry<T> temp = this.header;
    	for (int i = 0; i <= index ; i++){
    		temp = temp.next;
    	}
    	return temp.element;
    }
    public int size(){
    	return this.size;
    }
}