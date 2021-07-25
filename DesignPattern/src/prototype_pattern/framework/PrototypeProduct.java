package prototype_pattern.framework;

public interface PrototypeProduct extends Cloneable{

	public void use(String string);
	public PrototypeProduct createClone();
}
