package week43;

public class HiddenWord {
	// Declare any fields (instance variables)
	private String hiddenWord;

	// Declare a constructor
	public HiddenWord(String word) {
	    this.hiddenWord = word;
	}

	// Write the getHint method
	public String getHint(String guess) {
	    StringBuilder hint = new StringBuilder();
	    for (int i = 0; i < guess.length(); i++) {
	        if (guess.charAt(i) == this.hiddenWord.charAt(i)) {
	            hint.append(guess.charAt(i));
	        } else if (this.hiddenWord.indexOf(guess.charAt(i)) != -1) {
	            hint.append("+");
	        } else {
	            hint.append("*");
	        }
	    }
	    return hint.toString();
	}

	// This is a main method for testing the class
	public static void main(String[] args) {
	    HiddenWord puzzle = new HiddenWord("HARPS");
	    System.out.println(puzzle.getHint("AAAAA") + " it should print +A+++");
	    System.out.println(puzzle.getHint("HELLO") + " it should print H****");
	    System.out.println(puzzle.getHint("HEART") + " it should print H*++*");
	    System.out.println(puzzle.getHint("HARMS") + " it should print HAR*S");
	    System.out.println(puzzle.getHint("HARPS") + " it should print HARPS");
	} // end of main


}
