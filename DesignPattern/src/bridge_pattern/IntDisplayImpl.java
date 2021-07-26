package bridge_pattern;

public class IntDisplayImpl extends BridgeDisplayImpl{

	private int number;
	private int width;

	public IntDisplayImpl(int number){
		this.number = number;
		this.width = String.valueOf(number).length();
	}

	@Override
	public void rawOpen() {
		printLine();
	}

	@Override
	public void rawPrint() {
		System.out.println("|" + number + "|");
	}

	@Override
	public void rawClose() {
		printLine();
	}

	private void printLine(){
		System.out.print("+");

		for(int i = 0; i < width; i++){
			System.out.print("-");
		}

		System.out.println("+");
	}
}
