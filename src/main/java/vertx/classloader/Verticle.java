package vertx.classloader;

import org.vertx.java.core.Handler;
import org.vertx.java.core.http.HttpServerRequest;

public class Verticle extends org.vertx.java.platform.Verticle {

	@Override
	public void start() throws Exception {
		Singleton.getInstance();

		vertx.createHttpServer()
				.requestHandler(new Handler<HttpServerRequest>() {
					@Override
					public void handle(HttpServerRequest event) {
					}
				}).listen(8080);
	}

}
