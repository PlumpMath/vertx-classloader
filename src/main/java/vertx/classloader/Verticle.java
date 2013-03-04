package vertx.classloader;

public class Verticle extends org.vertx.java.platform.Verticle {

	@Override
	public void start() throws Exception {
		Singleton.getInstance();

		vertx.createHttpServer().listen(8080);
	}

}
