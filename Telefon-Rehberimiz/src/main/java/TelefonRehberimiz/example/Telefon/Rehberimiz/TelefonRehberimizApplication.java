package TelefonRehberimiz.example.Telefon.Rehberimiz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy(proxyTargetClass=true)
public class TelefonRehberimizApplication {

	public static void main(String[] args) {

		SpringApplication.run(TelefonRehberimizApplication.class, args);
	}

}
