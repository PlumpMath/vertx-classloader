package vertx.classloader;

public class Singleton {
	private Singleton() {
		System.out.println("Singleton constructor");
	}

	private static Singleton instance;

	public static Singleton getInstance() {
		return instance == null ? instance = new Singleton() : instance;
	}
}
