package factory_method_pattern.idcard;

import factory_method_pattern.framework.Product;

public class IdCard extends Product{
	
	private String owner;
	
	IdCard(String owner) {
		System.out.println(owner + "を作ります。");
		this.owner = owner;
	}

	@Override
	public void use() {
		System.out.println(owner + "を使います。");
	}

}
