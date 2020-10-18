package PD;

import java.util.LinkedList;

public class ListAdaptee {
	public LinkedList<Integer> list;

	public ListAdaptee() {
		this.list = new LinkedList<Integer>();
	}
	public ListAdaptee(LinkedList<Integer> list) {
		this();
		this.list = list;
	} 
	public void add(int e) {
		this.list.add(e);
	}
	public int removeLast() {
		return this.list.removeLast();
	}
	public int first() {
		return this.list.getFirst();
		
	}
	public boolean empty() {
		return this.list.isEmpty();
	}
}
