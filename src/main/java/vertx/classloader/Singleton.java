package vertx.classloader;

public class Singleton {
	private Singleton() {
		System.out.println("Singleton constructor");
	}

	private static Singleton instance = new Singleton();

	public static Singleton getInstance() {
		return instance;
	}
}
