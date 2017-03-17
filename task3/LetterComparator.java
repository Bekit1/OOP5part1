package task3;

import java.util.Comparator;

public class LetterComparator implements Comparator<Letter> {

	@Override
	public int compare(Letter a, Letter b) {
		// TODO Auto-generated method stub
		if (a.getFrequency() < b.getFrequency()) {
			return 1;
		} else if (a.getFrequency() > b.getFrequency()) {
			return -1;
		} else return 0;
			
	}

}
