package com.etrial.jslacktrial;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.github.seratch.jslack.*;
import com.github.seratch.jslack.api.webhook.*;

@SpringBootApplication
public class JslacktrialApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(JslacktrialApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		String url = "https://hooks.slack.com/services/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";

		Payload payload = Payload.builder()
						.channel("#general")
						.username("Bence bot")
						.iconEmoji(":smile_cat:")
						.text("Hello World!")
						.build();

		Payload payload1 = Payload.builder()
						.channel("#general")
						.username("Bence BOT2")
						.iconUrl("http://i0.kym-cdn.com/photos/images/original/000/943/273/608.jpg")
						.text("assdad")
						.build();

		Slack slack = Slack.getInstance();
		slack.send(url, payload1);
	}
}
