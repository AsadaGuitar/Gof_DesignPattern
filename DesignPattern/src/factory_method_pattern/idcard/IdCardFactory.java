package factory_method_pattern.idcard;

import java.util.ArrayList;
import java.util.List;

import factory_method_pattern.framework.Factory;
import factory_method_pattern.framework.Product;

public class IdCardFactory extends Factory{
	
	private List<Product> productList = new ArrayList<>();

	@Override
	protected Product createProduct(String owner) {
		return new IdCard(owner);
	}

	@Override
	protected void registerProduct(Product product) {
		productList.add(product);
	}

}
