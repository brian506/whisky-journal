package whisky.whisky_journal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class WhiskyJournalApplication {

	public static void main(String[] args) {
		SpringApplication.run(WhiskyJournalApplication.class, args);
	}

}
