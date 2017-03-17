package task3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

import task2.Student;

public class Frequency {
	private ArrayList<Letter> list = new ArrayList<>();
	private Alphabit alpha = new Alphabit();

	public Frequency() {
		super();
	}

	public ArrayList<Letter> getList() {
		return list;
	}

	public void setList(ArrayList<Letter> list) {
		this.list = list;
	}

	public Alphabit getAlpha() {
		return alpha;
	}

	public void setAlpha(Alphabit alpha) {
		this.alpha = alpha;
	}

	public void loadFromFile(File file) {
		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
			String text = "";
			String[] date = null;
			for (; (text = br.readLine()) != null;) {
				char[] b = new char[0];
				b = text.toCharArray();
				for (int i = 0; i < b.length; i++) {
					Letter temp=new Letter(b[i]);
					list.add(temp);
				}

			}
			System.out.println(list.toString());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void createAlpha(File file) {
		alpha.loadFromFile(file);
	}

	public void comp() {

		for (int i = 0; i < alpha.getArray().length; i++) {
			int temp = 0;
			Iterator<Letter> itr = list.iterator();
			for (; itr.hasNext();) {
				if (itr.next().equals(alpha.getArray()[i].getLetter())) {
					temp++;

				}
			}
			alpha.getArray()[i].setFrequency(temp);
		}
	}
}
