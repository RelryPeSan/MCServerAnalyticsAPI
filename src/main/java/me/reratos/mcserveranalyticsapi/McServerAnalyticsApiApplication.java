package me.reratos.mcserveranalyticsapi;

import me.reratos.mcserveranalyticsapi.controller.ServerController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EntityScan("me.reratos.mcserverlogger.model")
@EnableJpaRepositories("me.reratos.mcserveranalyticsapi.repository")
@SpringBootApplication
public class McServerAnalyticsApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(McServerAnalyticsApiApplication.class, args);

		ServerController serverResource = new ServerController();

//		serverResource.
	}

}
