package task3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Alphabit {
	private Letter[] array = new Letter[26];
	

	public Letter[] getArray() {
		return array;
	}

	public void setArray(Letter[] array) {
		this.array = array;
	}

	public void loadFromFile(File file) {
		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
			String text = "";
			String[] date = null;
			for (int i = 0; (text = br.readLine()) != null && i < 26; i++) {
				array[i]=new Letter(text.charAt(0));

			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public String toString() {
		return "Alphabit [array=" + Arrays.toString(array) + "]";
	}
	
}
