package task3;

public class Letter {
	private char letter;
	private int frequency;

	public Letter(char letter, int frequency) {
		super();
		this.letter = letter;
		this.frequency = frequency;
	}

	public Letter(char letter) {
		super();
		this.letter = letter;
	}

	public Letter() {
		super();
	}

	public char getLetter() {
		return letter;
	}

	public void setLetter(char letter) {
		this.letter = letter;
	}

	public int getFrequency() {
		return frequency;
	}

	public void setFrequency(int frequency) {
		this.frequency = frequency;
	}

	@Override
	public String toString() {
		return "Letter [letter=" + letter + ", frequency=" + frequency + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + letter;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Letter other = (Letter) obj;
		if (Character.toLowerCase(letter)==(other.getLetter()))
			return true;

		return false;

	}

}
