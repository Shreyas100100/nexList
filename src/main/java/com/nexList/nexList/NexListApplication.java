package com.nexList.nexList;

import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Objects;

@SpringBootApplication
public class NexListApplication {

	public static void main(String[] args) {
		// Load .env file into environment variables
		Dotenv dotenv = Dotenv.configure().ignoreIfMissing().load();
		String mongoURI = System.getenv("MONGODB_URI");
		if (mongoURI == null || mongoURI.isEmpty()) {
			mongoURI = dotenv.get("MONGODB_URI");
		}
		System.setProperty("MONGODB_URI", mongoURI);

		SpringApplication.run(NexListApplication.class, args);
	}
}