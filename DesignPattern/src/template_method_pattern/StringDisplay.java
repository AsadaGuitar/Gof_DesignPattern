package template_method_pattern;

public class StringDisplay extends AbstractDisplay{
	private String string;
	private int string_length;
	
	public StringDisplay(String string) {
		this.string = string;
		string_length = string.getBytes().length;
	}

	@Override
	public void open() {
		printLine();
	}

	@Override
	public void print() {
		System.out.println(" | " + string + " | ");
	}

	@Override
	public void close() {
		printLine();
	}
	
	private void printLine() {
		System.out.print("+");
		for(int i = 0; i < string_length; i++) {
			System.out.print("-");
		}
		System.out.println("+");
	}

}
