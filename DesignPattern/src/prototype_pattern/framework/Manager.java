package prototype_pattern.framework;

import java.util.HashMap;

public class Manager {

	private HashMap<String, PrototypeProduct> showcase = new HashMap<>();
	
	public void register(String name, PrototypeProduct prototype) {
		showcase.put(name, prototype);
	}
	
	public PrototypeProduct create(String protoName) throws NullPointerException{
		PrototypeProduct product = (PrototypeProduct) showcase.get(protoName);
		return product.createClone();
	}
}
