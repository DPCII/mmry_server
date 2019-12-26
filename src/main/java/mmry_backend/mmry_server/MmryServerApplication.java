package mmry_backend.mmry_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class MmryServerApplication {
	public static void main(String[] args) {
		SpringApplication.run(MmryServerApplication.class, args);
	}
}
