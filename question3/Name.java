package question3;

public class Name {

	private String first, middle, last;

	public Name(String first, String middle, String last) {
		this.first = first;
		this.middle = middle;
		this.last = last;
	}

	public Name(String wholeName) {
		String[] name = wholeName.split(" ");

		this.first = name[0];
		this.middle = name[1];
		this.last = name[2];
	}

	public String initials() {
		return first.charAt(0) + ". " + middle.charAt(0) + ". " + last.charAt(0);
	}

	public String toString() {
		return first + " " + middle.charAt(0) + ". " + last;
	}

	public String toFullString() {
		return first + " " + middle + " " + last;
	}

	public String toLastString() {
		return last + ", " + first;
	}

	public String toUpperCase() {
		return first.toUpperCase() + middle.toUpperCase() + last.toUpperCase();
	}

}
