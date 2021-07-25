package prototype_pattern;

import prototype_pattern.framework.PrototypeProduct;

public class MessageBox implements PrototypeProduct{
	
	private char decochar;
	
	public MessageBox(char decochar) {
		this.decochar = decochar;
	}

	@Override
	public void use(String string) {
		int length = string.getBytes().length;
		for(int i = 0; i < length + 4; i++) {
			System.out.print(decochar);
		}
		System.out.println("");
		System.out.println(decochar + " " + string + " " + decochar);
		for(int i = 0; i < length + 4; i++) {
			System.out.print(decochar);
		}
		System.out.println("");
	}

	@Override
	public PrototypeProduct createClone() {
		PrototypeProduct product = null;
		try {
			product = (PrototypeProduct)clone();
		}
		catch(CloneNotSupportedException e) {
			System.err.printf(e.getMessage(), e);
		}
		return product;
	}
}
