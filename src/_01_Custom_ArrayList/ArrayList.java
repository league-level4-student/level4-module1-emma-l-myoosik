package _01_Custom_ArrayList;

@SuppressWarnings("unchecked")

public class ArrayList <T>{
	private T arr[];
	
	public ArrayList() {
		arr = (T[]) new Object[0];
	}
	
	public T get(int loc) throws IndexOutOfBoundsException {
		return arr[loc];
	}
	
	public void add(T val) {
		T arr2[] = (T[]) new Object[arr.length + 1];
		arr2[arr2.length - 1] = val;
		
		for (int i = 0; i < arr.length; i++) {
			arr2[i] = arr[i];
		}
		
		arr = arr2;
	}
	
	public void insert(int loc, T val) throws IndexOutOfBoundsException {
		T arr2[] = (T[]) new Object[arr.length + 1];
		for (int i = 0; i < arr2.length; i++) {
			
		}
	}
	
	public void set(int loc, T val) throws IndexOutOfBoundsException {
		
	}
	
	public void remove(int loc) throws IndexOutOfBoundsException {
		
	}
	
	public boolean contains(T val) {
		
		return false;
	}
	
	public int size() {
		return arr.length;
	}
}