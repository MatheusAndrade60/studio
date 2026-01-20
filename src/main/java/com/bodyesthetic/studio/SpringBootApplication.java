package com.bodyesthetic.studio;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

@org.springframework.boot.autoconfigure.SpringBootApplication
public class SpringBootApplication extends Application {

	private ConfigurableApplicationContext context;

	@Override
	public void init() {
		context = new SpringApplicationBuilder(SpringBootApplication.class).run();
	}

	@Override
	public void start(Stage stage) throws Exception {
		FXMLLoader loader =
				new FXMLLoader(getClass().getResource("/fxml/main.fxml"));
		loader.setControllerFactory(context::getBean);

		Scene scene = new Scene(loader.load());
		stage.setScene(scene);
		stage.setTitle("Meu Sistema");
		stage.show();
	}

	@Override
	public void stop() {
		context.close();
	}

	public static void main(String[] args) {
		launch(args);
	}
}