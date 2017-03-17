package task1;

import java.util.ArrayList;
import java.util.Iterator;

public class NewList<T> {
	private ArrayList<T> a = new ArrayList<>();

	public NewList(ArrayList<T> a) {
		super();
		this.a = a;
	}

	public NewList() {
		super();
	}

	public ArrayList<T> getA() {
		return a;
	}

	public void setA(ArrayList<T> a) {
		this.a = a;
	}

	public void createList(T[] array) {

		for (int i = 0; i < 10; i++) {
			a.add(array[i]);
		}

	}

	public void deleteOneTwoLast() {
		a.remove(0);
		a.remove(0);
		a.remove(a.size() - 1);
	}

	public void show() {
		Iterator<T> itr = a.iterator();

		for (; itr.hasNext();) {
			System.out.print(itr.next() + " ");
		}
	}

	public void createDeleteAndShow(T[] array) {
		this.createList(array);
		this.deleteOneTwoLast();
		this.show();
	}
}
