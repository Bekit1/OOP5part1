package task2;

import java.util.ArrayList;
import java.util.Iterator;

public class Group {
	private ArrayList<Student> list = new ArrayList<>();

	public Group(ArrayList<Student> list) {
		super();
		this.list = list;
	}

	public Group() {
		super();
	}

	public ArrayList<Student> getList() {
		return list;
	}

	public void setList(ArrayList<Student> list) {
		this.list = list;
	}

	public void addStudent(Student student) {
		list.add(student);
	}

	public void deleteStudentBySurname(String surname) {
		Iterator<Student> itr = list.iterator();
		for (; itr.hasNext();) {
			if (itr.next().getSurname().equalsIgnoreCase(surname)) {
				itr.remove();

			}
		}
	}

	public void show() {
		Iterator<Student> itr = list.iterator();

		for (; itr.hasNext();) {
			System.out.println(itr.next());
		}
	}
}
