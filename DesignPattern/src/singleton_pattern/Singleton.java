package singleton_pattern;

public class Singleton {

	private static Singleton singleton = new Singleton();
	
	private Singleton() {}
	
	public static Singleton getInstance() {
		System.out.println("シングルトンインスタンスを取得します。");
		return singleton;
	}
}
