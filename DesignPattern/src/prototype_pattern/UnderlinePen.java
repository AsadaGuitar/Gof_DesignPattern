package prototype_pattern;

import prototype_pattern.framework.PrototypeProduct;

public class UnderlinePen implements PrototypeProduct{
	
	private char ulchar;
	
	public UnderlinePen(char ulchar) {
		this.ulchar = ulchar;
	}

	@Override
	public void use(String string) {
		int length = string.getBytes().length;
		System.out.println("\"" + string + "\"");
		System.out.println(" ");
		for(int i = 0; i < length; i++) {
			System.out.print(ulchar);
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
